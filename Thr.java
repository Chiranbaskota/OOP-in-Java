public class Thr extends Thread
{
public static void main(String[] args)
{
    Thr t1=new Thr();
    t1.start();
//System.out.print();
}

public void run(){
    System.out.println("This code is running inside thread.");
}
}

