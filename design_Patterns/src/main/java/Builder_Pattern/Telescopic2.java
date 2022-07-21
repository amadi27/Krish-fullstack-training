package Builder_Pattern;

public class Telescopic2 {
    String insurance;
    Boolean etc;
    String roadAssistance;
    String dropOfLocation;

    public Telescopic2(String insurance, Boolean etc, String roadAssistance, String dropOfLocation) {
        this.insurance = insurance;
        this.etc = etc;
        this.roadAssistance = roadAssistance;
        this.dropOfLocation = dropOfLocation;
    }

    public Telescopic2(String insurance, Boolean etc, String roadAssistance) {
        this(insurance,etc,roadAssistance,null) ;

    }

    public Telescopic2(String insurance, Boolean etc) {
        this(insurance,etc,null);
    }

    public Telescopic2(String insurance) {
        this(insurance,null );
    }

    @Override
    public String toString() {
        return "Telescopic2{" +
                "insurance='" + insurance + '\'' +
                ", etc=" + etc +
                ", roadAssistance='" + roadAssistance + '\'' +
                ", dropOfLocation='" + dropOfLocation + '\'' +
                '}';
    }
}
