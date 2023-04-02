package Inheritance;

public class Main {
    public static void main(String[] args) {
        Gryffindor ron = new Gryffindor("Рон Уизли", 50,60,60,80,90);
        Gryffindor germiona = new Gryffindor(" Гермиона Грейнджер", 70,50,40,60,30);
        Gryffindor harry = new Gryffindor("Гарри Поттер", 50,80,60,80,20);

        Hufflepuff zaharia = new Hufflepuff("Захария Смит",20,50,60,30,80);
        Hufflepuff cedrik = new Hufflepuff("Седрик Диггори",60,50,50,30,80);
        Hufflepuff jastin = new Hufflepuff("Джастин Финч-Флетчли",60,40,60,30,80);

        Ravenclaw chang = new Ravenclaw("Чжоу Чан",50,50,40,60,50,30);
        Ravenclaw padma = new Ravenclaw("Падма Патил ",50,50,40,20,90,30);
        Ravenclaw markus = new Ravenclaw("Маркус Белби",50,40,40,60,80,30);

        System.out.println(ron.toString());
    }
}