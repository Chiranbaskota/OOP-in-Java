interface Animal{
    int a=5;
    void animalSound();
    void walk();
   
}
class Horse implements Animal{
   
public void animalSound(){
System.out.println("The horse make sound hee.. hee..");
}
public void walk(){
System.out.println("The horse walks with four legs.");
}
}
public class Interface1
{
public static void main(String[] args)
{
    Horse h1=new Horse();
    h1.animalSound();
    h1.walk();
    System.out.println(Animal.a);
        
    
//System.out.print();
}
}