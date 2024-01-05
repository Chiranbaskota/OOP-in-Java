class A{
    String name;
     A(A a){
    this.name=a.name;
     }
     A(String name){
        this.name=name;
     }
     public void display(){
        System.out.println("The name of student is "+name);
     }
}
public class copyConstructor
{
public static void main(String[] args)
{
    A obj1=new A("Chiran");
    A obj2=new A(obj1);
    obj2.display();

//System.out.print();
}
}
