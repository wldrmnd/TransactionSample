package entity;

public class Amount {

    private Currency currency;
    private Double numberAmount;

    @Override
    public String toString() {
        return "Amount{" +
                "currency='" + currency + '\'' +
                ", numberAmount=" + numberAmount +
                '}';
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Double getNumberAmount() {
        return numberAmount;
    }

    public void setNumberAmount(Double numberAmount) {
        this.numberAmount = numberAmount;
    }
}
