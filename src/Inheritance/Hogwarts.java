package Inheritance;

public class Hogwarts {
    private String name;
    private int SorceryPower;
    private int TransgressDistance;

    public Hogwarts(String name, int sorceryPower, int transgressDistance) {
        this.name = name;
        this.SorceryPower = sorceryPower;
        this.TransgressDistance = transgressDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSorceryPower() {
        return SorceryPower;
    }

    public void setSorceryPower(int sorceryPower) {
        SorceryPower = sorceryPower;
    }

    public int getTransgressDistance() {
        return TransgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        TransgressDistance = transgressDistance;
    }

    @Override
    public String toString() {
        return "Ученик" + name + '\'' +
                ", мощность колдовства " + SorceryPower +
                ", расстояние трансгрессии " + TransgressDistance +
                '.';
    }
}
