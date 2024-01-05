  abstract class Animal{
    Animal(){
     System.out.println("I am constructor of animal class");
    }
    public abstract void walk();
        
    
    public void eat(){
        System.out.println("Animals eats grass.");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("I am constructor of horse class");
    }
    public void walk(){
        System.out.println("Horse walks with four legs.");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("I am the constructor of chicken class");
    }
    public void walk(){
        System.out.println("Chicken walks with two legs.");
    }
}
public class Abstraction
{
public static void main(String[] args)
{
   
        
   
    Horse h1=new Horse();
    Chicken c1=new Chicken();
    
    
    
   
    h1.eat();
    h1.walk();
    c1.walk();
   
    
        
    
//System.out.print();
}
}