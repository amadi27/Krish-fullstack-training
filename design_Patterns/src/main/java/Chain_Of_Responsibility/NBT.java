package Chain_Of_Responsibility;

public class NBT extends Handler {

    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.02);
        System.out.println("NBT");
        if(invoice.getAmount() > 100.0 && invoice.getAmount() <= 200.0){
            return invoice.getTax();
        }
        else{
            return  sucessor.applyTax(invoice);
        }

    }


}
