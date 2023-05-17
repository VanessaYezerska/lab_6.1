
package classes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Film class2 = new Film("Remove the knives",2019,"comedy");
        Cartoon class3 = new Cartoon("Volt",2008,"Byron Howard");
        watchTheFilm();
        }

    public static void watchTheFilm(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Доброго дня! Вас вітає наша система бронювання квитків на кіносеанс.");
        System.out.println("Будь ласка, виберіть тип фільму, на який ви хочете забронювати квитки (введіть 1 для фільму або 2 для мультфільму):");
        int movieType = scanner.nextInt();

        if (movieType == 1) {
            System.out.println("Ви вибрали фільм. Будь ласка, введіть назву фільму:");
            String filmName = scanner.next();

            System.out.println("Введіть кількість квитків:");
            int numberOfTickets;
            numberOfTickets = scanner.nextInt();

            System.out.println("Дякуємо! Ви забронювали " + numberOfTickets + " квитків на фільм " + filmName + ".");

        } else if (movieType == 2) {
            System.out.println("Ви вибрали мультфільм. Будь ласка, введіть назву мультфільму:");
            String cartoonName = scanner.nextLine();
            System.out.println("Введіть кількість квитків:");
            int numberOfTickets = scanner.nextInt();
            System.out.println("Дякуємо! Ви забронювали " + numberOfTickets + " квитків на мультфільм " + cartoonName);
        } else {
            System.out.println("Ви ввели невірний тип фільму. Будь ласка, введіть 1 для фільму або 2 для мультфільму.");
        }
    }
}



