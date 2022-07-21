package Chain_Of_Responsibility;

public class Tax  extends Handler{

    @Override
    public double applyTax(Invoice invoice) {
        //this class is implemented for keep the tax name outside .then you can change taxes any time
        return sucessor.applyTax(invoice);
    }
}
