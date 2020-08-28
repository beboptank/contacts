package contacts;

import java.util.Scanner;

public class Contact {
    private final Scanner scanner;

    public String firstName;
    public String lastName;
    public String phoneNumber;

    public Contact() {
        this.scanner = new Scanner(System.in);

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public void main(String[] args) {
        setContactData();
    }

    public void setContactData() {
        System.out.println("Enter the name of the person:");
        firstName = scanner.nextLine();
        System.out.println("Enter the surname of the person:");
        lastName = scanner.nextLine();
        System.out.println("Enter the number:");
        this.phoneNumber = scanner.nextLine();
        System.out.println("A record created!");
        System.out.println("A Phone Book with a single record created!");
    }
}
