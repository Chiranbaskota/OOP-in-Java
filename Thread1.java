class MyThread1 extends Thread{
    
    @Override
public void run(){
   int i=0;
    while(i<4000){
   System.out.println("I am cooking myThread1");
   System.out.println("I am sad");
    }
}
}
class MyThread2 extends Thread{

    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("I am chatting with her myThread2");
            System.out.println("I am happy");
        }
    }
}
public class Thread1
{
public static void main(String[] args)
{
     MyThread1 m1=new MyThread1();
     MyThread2 m2=new MyThread2();
     m1.start();
     m2.start();
//System.out.print();
}
}
