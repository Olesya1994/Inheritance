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
        if ((sorceryPower<100) && (sorceryPower > 0)) {
            this.sorceryPower = sorceryPower;
        } else {
            this.sorceryPower = 0;
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        if (transgressDistance <= 100 & transgressDistance >= 0) {
            this.transgressDistance = transgressDistance;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    @Override
    public String toString() {
        return "Ученик " + name + '\'' +
                ", мощность колдовства " + sorceryPower +
                ", расстояние трансгрессии " + transgressDistance +
                '.';
    }

    public int getHogwartsScore() {
        int score = sorceryPower + transgressDistance;
        return score;
    }

    public void getBetterHogwarts(Hogwarts student1) {
        if (student1.getHogwartsScore() > this.getHogwartsScore()) {
            System.out.println(student1.getName() + " лучше в трансгресии и владению магией, чем " + this.getName());
        } else if (this.getHogwartsScore() > student1.getHogwartsScore()) {
            System.out.println(this.getName() + " лучше в трансгресии и владению магией, чем " + student1.getName());
        } else {
            System.out.println(this.getName() + " и " + student1.getName() + " одинакого хороши.");
        }
    }
}
