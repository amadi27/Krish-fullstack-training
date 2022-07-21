package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract  class Package {
    protected List<Decoration> decoration = new ArrayList<>();
    
    public Package(){
        cretePackage();
    }

    protected abstract void cretePackage();

    @Override
    public String toString() {
        return "Package{"+ "decoration="+ decoration+ '}';
    }
}
