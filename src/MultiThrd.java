class MultiThrd2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable interface");
        }
    }
}


public class MultiThrd extends Thread{

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i+" is running");
        }
    }
    public static void main(String[] args) {
           MultiThrd thrd=new MultiThrd();
           MultiThrd2 thrd2=new MultiThrd2();
           Thread obj=new Thread(thrd2);
           obj.start();
           thrd.start();

           for(int i=1;i<=5;i++){
               System.out.println("main is running");
           }

    }
}
