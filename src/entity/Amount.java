package entity;

public class Amount {

    private String currency;
    private Double numberAmount;

    @Override
    public String toString() {
        return "Amount{" +
                "currency='" + currency + '\'' +
                ", numberAmount=" + numberAmount +
                '}';
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getNumberAmount() {
        return numberAmount;
    }

    public void setNumberAmount(Double numberAmount) {
        this.numberAmount = numberAmount;
    }
}
