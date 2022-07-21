package FactoryMethod;

public class BasicPackage extends Package{
    @Override
    protected void cretePackage() {
        decoration.add(new BridalDeco());
        decoration.add(new BridesMaidDeco());
    }
}
