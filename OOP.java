 class Student{
      
       int age;
       String name;

      public void printInfo(){
          System.out.println("The age of student is "+age);
          System.out.println("The name of the student is "+name);
      }
}
public class OOP
{
public static void main(String[] args)
{
    Student s1=new Student();
    s1.age=5;
    s1.name="Chiran";
    

    Student s2=new Student();
    s2.age=10;
    s2.name="Baskota";
    s1.printInfo();
    s2.printInfo();
    
//System.out.print();
}
}