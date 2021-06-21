package ro.java.ctrln;

public enum Oceans {

    ARTIC(5450),
    ANTARTIC(7236),
    ATLANTIC(8486),
    INDIAN(8047),
    PACIFIC(11022);

    private final int maximumDepth;

    Oceans(int maximumDepth) {
        this.maximumDepth = maximumDepth;
    }

    public int getMaximumDepth() {
        return this.maximumDepth;
    }

    public static void main(String[] args) {
        for (Oceans ocean : Oceans.values()) {
            System.out.println("Adancimea maxima a oceanului " + ocean.name() + " este: " + ocean.getMaximumDepth());
        }
    }
}
