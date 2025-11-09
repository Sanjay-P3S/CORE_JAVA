class Two extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread secondrun method");
        }
    }
}


public class MultiThrdMethods extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread run method");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        MultiThrdMethods obj=new MultiThrdMethods();
        Two obj2=new Two();
        obj2.setPriority(MAX_PRIORITY);
        obj.setPriority(2);
        obj.start();
        obj2.start();

        System.out.println("MultiThrdMethods main thread started");
        obj.setName("main thread");
        obj2.setName("second thread");
        System.out.println(Thread.activeCount());
        System.out.println(obj2.getName());
        System.out.println(currentThread().getName());
    }
}
