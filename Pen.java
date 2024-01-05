class Pen1{
     String color;
    public void printColor(){
        System.out.println(this.color);
    }
}
public class Pen
{
public static void main(String[] args)
{
     Pen1 p1=new Pen1();
     Pen1 p2=new Pen1();
     Pen1 p3=new Pen1();
     p1.color="blue";
     p2.color="green";
     p3.color="red";
     p1.printColor();
     p2.printColor();
     p3.printColor();
//System.out.print();
}
}
