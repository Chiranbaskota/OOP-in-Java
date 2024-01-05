class Animal{
    public void animal(){
        System.out.println("The animal makes sound like following");
    }
}
class Pig extends Animal{
    public void animal(){
        System.out.println("Pig makes sound 'wee wee' ");
    }
}
class Cow extends Animal{
    public void animal(){
        System.out.println("Cow makes sound 'baa baa' ");
    }
}
public class Polymorphism
{
public static void main(String[] args)
{
    Animal myAnimal=new Animal();
    Pig myPig=new Pig();
    Animal myCow=new Cow();
    myAnimal.animal();
    myPig.animal();
    myCow.animal();
   
//System.out.print();
}
}
