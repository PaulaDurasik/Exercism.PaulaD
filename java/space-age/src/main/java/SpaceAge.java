import java.time.LocalDateTime;

class SpaceAge {

    private final double seconds;
    double secondonEarth=31557600;
    double secondonMercury=0.2408467;
    double secondonVenus=0.61519726;
    double secondonMars=1.8808158;
    double secondonJupiter=11.862615;
    double secondonSaturn=29.447498;
    double secondonUranus=84.016846;
    double secondonNeptun=164.79132;

    SpaceAge(double seconds) {
        this.seconds=seconds;
    }

    double getSeconds() {

        return this.seconds;
    }

    double onEarth() {
        return seconds/secondonEarth;
    }

    double onMercury() {
        return onEarth()/secondonMercury;
    }

    double onVenus() {
        return onEarth()/secondonVenus;
    }

    double onMars() {
        return onEarth()/secondonMars;
    }

    double onJupiter() {
        return onEarth()/secondonJupiter;
    }

    double onSaturn() {
        return onEarth()/secondonSaturn;
    }

    double onUranus() {
        return onEarth()/secondonUranus;
    }

    double onNeptune() {
        return onEarth()/secondonNeptun;
    }

}
