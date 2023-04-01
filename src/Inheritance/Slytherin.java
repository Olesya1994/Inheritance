package Inheritance;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int powerLust;

    public Slytherin(String name, int sorceryPower, int transgressDistance,
                     int cunning, int determination, int ambition, int powerLust) {
        super(name, sorceryPower, transgressDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }

    @Override
    public String toString() {
        return Hogwarts.toString() + "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", powerLust=" + powerLust +
                '}';
    }
}
