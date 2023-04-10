package Inheritance;

public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int sorceryPower, int transgressDistance,
                      int hardworking, int loyal, int honest) {
        super(name, sorceryPower, transgressDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        if (honest < 100 & honest >= 0) {
            this.honest = honest;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "Hufflepuff:" +
                "трудолюбие=" + hardworking +
                ", верность=" + hardworking +
                ", честность=" + honest +
                '}';
    }
    public int getHufflepuffScore() {
        int score = hardworking + hardworking + honest;
        return score;
    }
    public void getBetterHufflepuff(Hufflepuff student1){
        if (student1.getHufflepuffScore()>this.getHufflepuffScore()){
            System.out.println(student1.getName() + " лучший Пуфендуец, чем " + this.getName());}
        else if (this.getHufflepuffScore()>student1.getHufflepuffScore()){
            System.out.println(this.getName() + " лучший Пуфендуец, чем " + student1.getName());}
        else {System.out.println(this.getName() + " и " + student1.getName()+" одинакого хороши.");}
    }
}
