package Prototype;

public class Bus extends Vehicle{

    private int NumberOfSeats;

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "NumberOfSeats=" + NumberOfSeats +
                '}';
    }
}
