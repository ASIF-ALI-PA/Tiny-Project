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
        System.out.print("Enter your College Name: ");
        String collegename=scanner.next();
        System.out.println("enter your stream");
        String stream = scanner.next();
        System.out.println("enter you cgpa");
        double cgpa = scanner.nextDouble();
        System.out.println("Enter year of passout: ");
        int yearOfPassout= scanner.nextInt(); 
        
        if(yearOfPassout==2021 && cgpa>=7)
        {
        	System.out.println("You are eligible to attend Interview");
        }else {
        	System.out.println("You are not eligible to attend Interview");
     }
        
    }
}