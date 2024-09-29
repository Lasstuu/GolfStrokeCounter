package main.strokecounter;

public class Hole {
    protected Integer holePar, holeStrokes;


    public Hole(Integer holePar, Integer holeStrokes) {
        this.holePar = holePar;
        this.holeStrokes = holeStrokes;
    }

    public Integer getHolePar() {
        return holePar;
    }

    public void setHolePar(Integer holePar) {
        this.holePar = holePar;
    }

    public Integer getHoleStrokes() {
        return holeStrokes;
    }

    public void setHoleStrokes(Integer holeStrokes) {
        this.holeStrokes = holeStrokes;
    }

}
