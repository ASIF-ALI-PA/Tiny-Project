import jdk.internal.vm.vector.VectorSupport;

import java.util.Scanner;

public class tinyproject {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("WELCOME TO SIMELABS ");
        System.out.print("Enter your Name: ");
        String name=scanner.next();
        System.out.print("Enter Your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your Qualification: ");
        String Qualfication=scanner.next();

        System.out.println("enter your stream");
        String stream = scanner.next();
        System.outprintln("enter you cgpa");
        double cgpa = scanner.nextDouble();

    }
}