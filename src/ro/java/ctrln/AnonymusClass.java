package ro.java.ctrln;

public class AnonymusClass {

    enum Weekday {MONDAY, TUESDAY};

    public static void main(String[] args) {

        Starship starship = new Starship() { //aici definim clasa anonima

           // enum Weekday {MONDAY, TUESDAY};

            @Override
            public void warp() {
                System.out.println("Anonymus class warp!");

            }

            @Override
            public void setStarshipDestination(String destination) {
                System.out.println("Flying to: " + destination);

            }

            @Override
            public double computWarpSpeed(int warpFactor, int lightYearsToDestination) {
                return warpFactor * lightYearsToDestination;
            }
        };

        starship.warp();
        starship.setStarshipDestination("Mars");
        System.out.println("Warp speed is: " + starship.computWarpSpeed(3,1000));

        System.out.println("starship instanceof Object: " + (starship instanceof Object));
        System.out.println("starship instanceof Starship: " + (starship instanceof Starship));
    }
}

