package Association.Aggregation;

import java.util.ArrayList;
import java.util.List;

class Car {
    private MusicPlayer player;                       // Aggregation (Weak Bond)
    private List<Tyres> tyres;                        // Aggregation (Strong Bond)
    private String model;

    public Car(MusicPlayer player, List<Tyres> tyres, String model) {
        this.player = player;
        this.tyres = tyres;
        this.model = model;
    }

    public void startCar() {
        System.out.println(model + " Car is started and ready for long ride..");
    }
}

class MusicPlayer {
    public MusicPlayer() {
        System.out.println("Music player is started..");
        playSong("Yeh Sham Masatani..");
    }

    public void playSong(String song) {
        System.out.println("Song is playing : " + song);
    }
}

class Tyres {
    private int size;

    public Tyres(int size) {
        this.size = size;
        System.out.println("Tyres are ready..");
    }

    public void rotate() {
        System.out.println("Tyre is rotating of size : " + this.size);
    }
}

public class AggregationClass {
    public static void main(String[] args) {
        Tyres tyre1 = new Tyres(18);
        Tyres tyre2 = new Tyres(18);
        Tyres tyre3 = new Tyres(18);
        Tyres tyre4 = new Tyres(18);
        List<Tyres> allTyres = new ArrayList<>();

        allTyres.add(tyre1);
        allTyres.add(tyre2);
        allTyres.add(tyre3);
        allTyres.add(tyre4);

        for (Tyres tyre : allTyres) {
            tyre.rotate();
        }

        MusicPlayer player = new MusicPlayer();

        Car mustang = new Car(player, allTyres, "1969 Mustang");
        mustang.startCar();
    }
}
