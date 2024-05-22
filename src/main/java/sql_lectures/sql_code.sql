-- Create table
create table employee_info(
                              employee_id serial primary key,
                              name text not null,
                              surname text not null,
                              age int not null,
                              isMale boolean
);

-- Delete table

drop table employee_info;

-- Select everything from table
select *
from employee_info;

-- Insert data into table
insert into employee_info (name, surname, age, isMale)
values
    ('Serghei', 'Petrov', 25, true);

--This won't work, violates not-null constraint
insert into employee_info (name, age)
values
    ('Dumitru', 30);

--Select all employees which name is Alexey

select *
from employee_info ei
where name = 'Alexey';

--Select employees older than 30 years old

select *
from employee_info ei
where age > 30;

--Select all males older than 20 years old

select *
from employee_info ei
where age > 20
  and ismale = true;

-- Change surname of dumitru from Russu to Ciobanu

update employee_info
set surname = 'Ciobanu'
where surname = 'Russu'

-- Change name of alexey petrov to serghei petrov

update employee_info
set name = 'Serghei'
where surname = 'Petrov'
  and name = 'Alexey'

-- Delete Serghei Petrov from the table

delete from employee_info
where name = 'Serghei'

-- Change name of Alexey ciobanu to Andrei with id 5

update employee_info
set name = 'Anton'
where employee_id = 1

--Sorting

select *
from employee_info ei
order by age;

--Create new column in table using alter

alter table employee_info
    add column idnp text;

alter table employee_info
    ADD CONSTRAINT unique_idnp UNIQUE (idnp);

-- Populate idnp column

update employee_info
set idnp = '1112'
where employee_id = 3;

select *
from employee_info ei;

-- find max age

select count(*)
from employee_info ei

-- find the count of individual names

select name, count(name)
from employee_info ei
group by name
order by count(name) desc;

-- column name override example

select count(name) as name_count
from employee_info ei;

-- in example

select *
from employee_info ei
where name in ('Alexey', 'Serghei')

-- between example

select *
from employee_info ei
where age between 10 and 25

-- like (wildcards)

select *
from employee_info ei
where name like 'A_e%';

-- select surnames that have letter i in surname

select *
from employee_info ei
where surname like '_%i%_'

-- select names that must be of minimum 6 characters

select *
from employee_info ei
where name like '______%'

-- any first letter, any letter betweeen e, before last o

select *
from employee_info ei
where surname like '_%e%o_'

-- First letter either S or I

select *
from employee_info ei
where surname like 'S%'
   or surname like 'I%'

-- create employee address table

create table employee_address(
                                 address_id serial primary key,
                                 country text not null,
                                 city text not null,
                                 address_line_1 text not null,
                                 address_line_2 text,
                                 zip_code int,
                                 fk_employee_id int,
                                 constraint fk_employee
                                     foreign key (fk_employee_id)
                                         references employee_info(employee_id)
)

select *
from employee_address;

select *
from employee_info ei

    insert into employee_address(country, city, address_line_1, address_line_2, zip_code, fk_employee_id)
values ('Moldova', 'Balti', 'str. Orhei 10', 'bl 2, ap. 30', 9982, 1);

-- Select name and country

select *
from employee_info ei
         full outer join employee_address ea on ei.employee_id = ea.fk_employee_id;

-- Select names of employees which live in moldova

select name
from employee_info ei
         inner join employee_address ea on ei.employee_id = ea.fk_employee_id
where ea.country = 'Moldova';

-- Select all addresses that have or don't have employees assigned to them

select address_line_1, name
from employee_address ea
         left join employee_info ei on ea.fk_employee_id = ei.employee_id;


select address_line_1, name
from employee_info ei
         right join employee_address ea on ei.employee_id = ea.fk_employee_id;

-- Select all addresses that are not assigned to any employees

select address_line_1, name
from employee_info ei
         right join employee_address ea on ei.employee_id = ea.fk_employee_id
where ei.name is null;

select address_line_1
from employee_address
where fk_employee_id is null

-- Select all employees that are not assigned to any addresses

select name
from employee_info ei
         left join employee_address ea on ei.employee_id = ea.fk_employee_id
where ea.fk_employee_id is null;

-- Select all employees that are not assigned to any addresses and addresses with non assigned employees

select name, address_line_1
from employee_info ei
         full outer join employee_address ea on ei.employee_id = ea.fk_employee_id
where ea.fk_employee_id is null
   or ei.employee_id is null

-- Creating department table

create table department(
                           department_id serial primary key,
                           name text not null,
                           description text
);

-- Create employee_department_relationship table

create table employee_department_relationship(
                                                 relationship_id serial primary key,
                                                 fk_employee_id int,
                                                 fk_department_id int,
                                                 constraint fk_employee_id_const
                                                     foreign key(fk_employee_id)
                                                         references employee_info(employee_id),
                                                 constraint fk_department_id_const
                                                     foreign key (fk_department_id)
                                                         references department(department_id)
);

select *
from department d;

select *
from employee_info ei;

select *
from employee_department_relationship edr;

insert into department (name, description)
values ('Accounting', 'Everything money related happens here');

-- Add people to departments

-- Anton, Serghei -> Accounting
-- Andreea -> Software
-- Alexey, Alexey -> Hardware

insert into employee_department_relationship(fk_employee_id, fk_department_id)
values
    (1, 1), (2, 1), (3, 2), (4, 3), (5, 3);

-- select all employees alongside all departments

select ei.employee_id, ei.name, d.name
from employee_info ei
         inner join employee_department_relationship edr on ei.employee_id = edr.fk_employee_id
         inner join department d ON edr.fk_department_id = d.department_id
order by ei."name";

-- create customer table

create table customer(
                         customer_id serial primary key,
                         name text not null,
                         fiscal_code int not null
);

--create customer department relationship table

create table customer_department_relationship(
                                                 relationship_id serial primary key,
                                                 fk_customer_id int,
                                                 fk_department_id int,
                                                 constraint fk_customer_id_const
                                                     foreign key (fk_customer_id)
                                                         references customer(customer_id),
                                                 constraint fk_department_id_const
                                                     foreign key (fk_department_id)
                                                         references department(department_id)
)

--create customer_contact table

create table customer_contact(
                                 contact_id serial primary key,
                                 country text not null,
                                 city text not null,
                                 address text not null,
                                 fk_customer_id int,
                                 constraint fk_customer_id_const
                                     foreign key (fk_customer_id)
                                         references customer(customer_id)
)

select *
from customer_department_relationship;

select *
from customer;

insert into customer(name, fiscal_code)
values
    ('Google LLC', 12312), ('Apple LLC', 11111), ('Endava ICS', 847123);

insert into customer_department_relationship(fk_customer_id, fk_department_id)
values(1, 2), (1, 3), (2, 2), (3, 1), (3, 2);

insert into customer_contact (country, city, address, fk_customer_id)
values ('USA', 'Washington', 'str. Address 1', 1), ('France', 'Paris', 'str. France Street 3', 1),
       ('Great Britain', 'London', 'str. Address 2', 2), ('Great Britain', 'Coventry', 'str. Address 5', 3);

-- Find out what employees work for what customer

select ei."name", c.name, cc
from employee_info ei
         inner join employee_department_relationship edr on ei.employee_id = edr.fk_employee_id
         inner join department d ON edr.fk_department_id = d.department_id
         inner join customer_department_relationship cdr on d.department_id = cdr.fk_department_id
         inner join customer c on cdr.fk_customer_id = c.customer_id
         inner join customer_contact cc on c.customer_id = cc.fk_customer_id;

-- find out what customers have hired what employees

select *
from customer c
         inner join customer_department_relationship cdr on c.customer_id = cdr.fk_customer_id
         inner join department d on cdr.fk_department_id = d.department_id
         inner join employee_department_relationship edr on d.department_id = edr.fk_department_id
         inner join employee_info ei on edr.fk_employee_id = ei.employee_id;


