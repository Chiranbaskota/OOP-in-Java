//wap to write some information to the file.
import java.io.FileWriter;
import java.io.IOException;
public class fileHandling2
{
public static void main(String[] args)
{
try{
    FileWriter file=new FileWriter("filenameomg.txt");
    file.write("The file handling in java might be tricky but it is little bit of fun.");
    file.close();
    System.out.println("The writing in the file is done");
}
catch(IOException e){
    System.out.println("Some error has been occured.");
}
//System.out.print();
}
}
