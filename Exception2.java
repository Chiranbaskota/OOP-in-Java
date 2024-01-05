import java.util.Scanner;
public class Exception2 {
    public static void main(String[] args){
    int age;
    System.out.println("Enter your age");
    Scanner sc=new Scanner(System.in);
    age=sc.nextInt();
    sc.close();
    if(age<18){
        throw new ArithmeticException("Access denied-- You must be at least 18 years old");
    }
    else{
        System.out.println("Access granted-- You are old enough");
    }
    }
}
