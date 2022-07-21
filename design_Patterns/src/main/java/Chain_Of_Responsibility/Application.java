package Chain_Of_Responsibility;

public class Application {
    public static void main(String[]args) {
        VAT vat = new VAT();
        NBT nbt = new NBT();
        BTT btt = new BTT();
        SSF ssf = new SSF();
        Tax tax = new Tax();


        //tax.
        tax.setSucessor(vat);
        vat.setSucessor(nbt);
        nbt.setSucessor(btt);
        btt.setSucessor(ssf);
        // vat.setSucessor(vat);

        Invoice invoice = new Invoice(1, 50);
        System.out.println(tax.applyTax(invoice));

        Invoice invoice1 = new Invoice(2, 100);
        System.out.println("SSF calculated");

        //Invoice invoice2 = new Invoice(3, 25);
        //System.out.println("SSF calculated");


    }

}
