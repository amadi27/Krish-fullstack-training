package FactoryMethod;

public class PlatinumPackage extends Package{

    @Override
    protected void cretePackage() {
        decoration.add(new BridalDeco());
        decoration.add(new BridesMaidDeco());
        decoration.add(new FlowerGirlDeco());
        decoration.add(new ParentDeco());
    }
}
