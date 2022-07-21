package Chain_Of_Responsibility;

public abstract class Handler {

    protected Handler sucessor;

    public void setSucessor(Handler sucessor) {
        this.sucessor = sucessor;
    }

    public abstract double applyTax(Invoice invoice);

}
