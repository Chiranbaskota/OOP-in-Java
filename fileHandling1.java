import java.io.File;
import java.io.IOException;
public class fileHandling1
{
public static void main(String[] args)
{
try{
    File myObj=new File("D:\\Programming\\Java\\filename.txt");
    if(myObj.createNewFile()){
        System.out.println("The file is sucessfully created and the name of file is "+myObj.getName());
 }
    else{
        System.out.println("The file already exists");
    }
}
catch(IOException e){
System.out.println("Something error has been occured.");
}
//System.out.print();
}
}
