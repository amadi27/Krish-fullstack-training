package FactoryMethod;

public class SilverPackage extends Package {

    @Override
    protected void cretePackage() {
        decoration.add(new BridalDeco());
        decoration.add(new BridesMaidDeco());
    }
}
