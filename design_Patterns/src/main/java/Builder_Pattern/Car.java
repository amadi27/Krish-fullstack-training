package Builder_Pattern;

public class Car {
    private final String insurance;
    private final Boolean etc;
    private final String roadAssistance;
   private final String dropOfLocation;

    public Car(Builder builder) {
        this.insurance= builder.insurance;
        this.etc= builder.etc;
        this.roadAssistance= builder.roadAssistance;
        this.dropOfLocation= builder.dropOfLocation;

    }

    static class Builder{

       private String insurance;
       private Boolean etc;
       private String roadAssistance;
       private String dropOfLocation;

       public Car build(){
           return new Car(this);
       }

       public Builder(String insurance) {
           this.insurance = insurance;
       }

       public Builder etc(Boolean etc) {
           this.etc = etc;
           return this;
       }
       public Builder roadAssistance(String roadAssistance) {
           this.roadAssistance = roadAssistance;
           return this;
       }

       public Builder dropOfLocation(String dropOfLocation) {
           this.dropOfLocation = dropOfLocation;
           return this;
       }
   }

    @Override
    public String toString() {
        return "Car{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOfLocation='" + dropOfLocation + '\'' +
                '}';
    }
}
