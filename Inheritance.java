class Vehicle{
    protected String brand="Ford";
    public void honk(){
          System.out.println("Peep...Peep....");
      }

}



 class Inheritance extends Vehicle
{
    private String modelName="Mustang";
public static void main(String[] args)
{
     Inheritance car1=new Inheritance();
     car1.honk();
     System.out.println(car1.modelName);
     System.out.println(car1.brand);
//System.out.print();
}
}
