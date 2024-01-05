import java.io.File;
public class fileHandling5
{
public static void main(String[] args)
{
   File myObj=new File("D:\\Programming\\Java\\Test");
   if(myObj.delete()){
    System.out.println("The folder " + myObj.getName()+" is deleted.");
   }
   else{
    System.out.println("The folder is unable to delete.");
   }
//System.out.print();
}
}
