package lecture_nr_6.encapsulation;

public class CreditCard {

    private String cardNumber;
    private String cardHolder;
    private int CVV;

    public CreditCard(String cardNumber, String cardHolder, int CVV) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.CVV = CVV;
    }

    private String encryptCardNumber(String cardNumber){

        String returnString = cardNumber.substring(0, 12);
        returnString += "****";

        return returnString;
    }

    public String getCardNumber() {

        return encryptCardNumber(cardNumber);
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
}
