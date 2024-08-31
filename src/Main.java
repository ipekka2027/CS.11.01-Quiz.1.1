import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("Enter your first name: ");
        scanner.nextLine();
        firstName = scanner.nextLine();
        System.out.println("Enter your favourite food: ");
        favouriteFood = scanner.nextLine();

        System.out.println("First Name: " + firstName + "\nAge" + age + "\nFavourite Food: " + favouriteFood);

    }

}