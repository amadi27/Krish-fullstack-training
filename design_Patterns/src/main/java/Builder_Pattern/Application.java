package Builder_Pattern;

public class Application {

    public static void main(String[]args){
        Telescopic1 telescopic1= new Telescopic1("full");
        System.out.println(telescopic1);

        Telescopic2 telescopic2= new Telescopic2("full");
        System.out.println(telescopic2);

        Car.Builder builder= new Car.Builder("Full");
        Car car = builder.dropOfLocation("LA").roadAssistance("Full").build();
        System.out.println(car);
    }

}
