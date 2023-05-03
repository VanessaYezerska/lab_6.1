package classes;

public class Main {
    public static void main(String[] args) {
        Serial class1 = new Serial("Stranger things",4,2017);

        Film class2 = new Film("Remove the knives",2019,"comedy");

        Cartoon class3 = new Cartoon("Volt",2008,"Byron Howard");

        System.out.println("назва серіалу: " + class1.name +";" + " кількість сезонів: " + class1.number_of_seasons +";"+ " рік випуску: " + class1.year_of_release);
        System.out.println("назва фільму: " + class2.name +";" + " рік випуску: " + class2.year_of_release + ";" + " жанр: " + class2.genre);
        System.out.println("назва мультфільму: " + class3.name +";" + " рік випуску: " + class3.year_of_release + ";" + " режисер: " + class3.producer);
    }
}
