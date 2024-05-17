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


