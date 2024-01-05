 import java.util.*;
 class Person{
   private String name;
   //Setter
   public void setName(String name){
    this.name=name;
   }
   //Getter
   public String getName(){
    return this.name;
   }

}
public class Encapsulation
{
public static void main(String[] args)
{
    String name;
    Person p1=new Person();
    Scanner sc=new Scanner(System.in);
    name=sc.nextLine();
    p1.setName(name);
    System.out.println(p1.getName());
//System.out.print();
}
}