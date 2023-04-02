package Inheritance;

public class Hogwarts {
    private String name;
    private int sorceryPower;
    private int transgressDistance;

    public Hogwarts(String name, int sorceryPower, int transgressDistance) {
        this.name = name;
        this.sorceryPower = sorceryPower;
        this.transgressDistance = transgressDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSorceryPower() {
        return sorceryPower;
    }

    public void setSorceryPower(int sorceryPower) {
        this.sorceryPower = sorceryPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    @Override
    public String toString() {
        return "Ученик" + name + '\'' +
                ", мощность колдовства " + sorceryPower +
                ", расстояние трансгрессии " + transgressDistance +
                '.';
    }
    public int getScore(){
        int score = sorceryPower +transgressDistance;
        return score;
    }
}
