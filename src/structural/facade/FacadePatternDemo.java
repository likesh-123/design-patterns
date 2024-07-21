package structural.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, amplifier, lights);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}

