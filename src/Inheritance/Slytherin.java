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
        return super.toString() + "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", powerLust=" + powerLust +
                '}';
    }
    public int getSlytherinScore() {
        int score = cunning + determination + ambition+powerLust;
        return score;
    }
    public void getBetterSlytherin(Slytherin student1){
        if (student1.getSlytherinScore()>this.getSlytherinScore()){
            System.out.println(student1.getName() + " лучший ученик Слизарена, чем " + this.getName());}
        else if (this.getSlytherinScore()>student1.getSlytherinScore()){
            System.out.println(this.getName() + " лучший ученик Слизарена, чем " + student1.getName());}
        else {System.out.println(this.getName() + " и " + student1.getName()+" одинакого хороши.");}
    }
}
