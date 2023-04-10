package Inheritance;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int sorceryPower,
                      int transgressDistance, int nobility, int honor, int courage) {
        super(name, sorceryPower, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + "Gryffindor:" +
                "благородство= " + nobility +
                ", честь=" + honor +
                ", храбрость=" + courage +
                '}';
    }

    public int getGriffindorScore() {
        int score = nobility + honor + courage;
        return score;
    }
    public void getBetterGriffindor(Gryffindor student1){
        if (student1.getGriffindorScore()>this.getGriffindorScore()){
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + this.getName());}
        else if (this.getGriffindorScore()>student1.getGriffindorScore()){
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student1.getName());}
        else {System.out.println(this.getName() + " и " + student1.getName()+" одинакого хороши.");}
    }


}
