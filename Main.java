package com.company.passout;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("enter your stream");
    String stream = scanner.next();
	System.out.println("enter your year of passout ");
    int year = scanner.nextInt();
    System.out.printf("your stream is " + stream + " and your year of passout is " + year);

    }
}
