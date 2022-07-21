package Prototype;

public abstract class Vehicle implements Cloneable{
    private String fualType;
    private int EngineCapacity;

    public String getFualType() {
        return fualType;
    }

    public void setFualType(String fualType) {
        this.fualType = fualType;
    }

    public int getEngineCapacity() {
        return EngineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        EngineCapacity = engineCapacity;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
