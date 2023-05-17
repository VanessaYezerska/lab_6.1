package classes;

import java.util.Scanner;

public class Film {
    String name;
    String genre;
    int year_of_release;

    public Film(String name,int year_of_release,String genre){
        this.name = name;
        this.genre = genre;
        this.year_of_release = year_of_release;

    }
    public static void ChooseTheFilm() {
        System.out.println("Який фільм бажаєте подивитись?");
        Scanner sc = new Scanner(System.in);
        String watch;
        watch = sc.nextLine();
        System.out.println("Ви обрали фільм: " + watch +". Гарного перегляду!");


    }

    public static void main(String[] args) {
        ChooseTheFilm();
    }
}
