package Chain_Of_Responsibility;

public class VAT extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax()+ invoice.getAmount() * 0.01);
        if(invoice.getAmount() <= 100){
            return invoice.getTax();
        }
        else{
            return  sucessor.applyTax(invoice);
        }

    }
}
