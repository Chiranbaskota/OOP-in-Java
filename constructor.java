class A{
  int age;
  String name;
  int rollNo;
  A(){
    System.out.println("I am default constructor.");
    rollNo=18;
  }
  A(int age,String name){
    this();//This function is used to call default constructor from parameterized constructor in java.
    this.age=age;
    this.name=name;
  }
  void display(){
    System.out.print("The name of student is "+name+" and the age is "+age);
    System.out.println();
    System.out.println(rollNo);
  }
}
public class constructor {
    public static void main(String[] args){
       A obj=new A(5,"Chiran");
       obj.display();
    }
    
}
