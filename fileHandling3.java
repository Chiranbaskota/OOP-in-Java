import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class fileHandling3
{
public static void main(String[] args)
{
    try{
        File myObj=new File("filename.txt");
        Scanner sc=new Scanner(myObj);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            System.out.print(str);
        }
        sc.close();
    }
    catch(FileNotFoundException e){
        System.out.println("Something error has been occured.");
    }
//System.out.print();
}
}
