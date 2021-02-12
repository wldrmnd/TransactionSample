package entity;

//ID CardHolder_Name CardHolder_Surname Amount Time_Begin Time_End
public class Transaction {

    private Long id;
    private CardHolder cardHolder;
    private TransactionTime time;

    private Amount amount;

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(CardHolder cardHolder) {
        this.cardHolder = cardHolder;
    }

    public TransactionTime getTime() {
        return time;
    }

    public void setTime(TransactionTime time) {
        this.time = time;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", cardHolder=" + cardHolder +
                ", time=" + time +
                ", amount=" + amount +
                '}';
    }
}
