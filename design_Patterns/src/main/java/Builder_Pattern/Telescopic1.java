package Builder_Pattern;

public class Telescopic1 {
    String insurance;
    Boolean etc;
    String roadAssistance;
    String dropOfLocation;

    public Telescopic1(String insurance) {
        this.insurance = insurance;
    }

    public Telescopic1(String insurance, Boolean etc) {
        this(insurance);
        this.etc = etc;
    }

    public Telescopic1(String insurance, Boolean etc, String roadAssistance) {
        this(insurance,etc);
        this.roadAssistance = roadAssistance;
    }

    public Telescopic1(String insurance, Boolean etc, String roadAssistance, String dropOfLocation) {
        this(insurance,etc,roadAssistance );
        this.dropOfLocation = dropOfLocation;
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
