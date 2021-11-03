package com.company.passout;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO SIMELABS ");
        tinyProject student1 = new tinyProject();
        student1.getDetails();
        student1.isEligible();
    }
}
