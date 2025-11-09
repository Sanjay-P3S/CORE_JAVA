
class Cake implements Runnable  {
    public void run() {
        System.out.println("Mixing Ingredients for cake"+Thread.currentThread().getId());
        System.out.println("Baking cake "+Thread.currentThread().getId());
        System.out.println("Decorating Cake  "+Thread.currentThread().getId());
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        int cakecount=4;
        for(int i=0;i<cakecount;i++){
            Cake cake = new Cake();
            Thread thread = new Thread(cake);
            thread.start();
        }



    }
}
