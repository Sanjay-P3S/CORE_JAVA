class CakeCounter{
    int cakeCount=0;

    synchronized void increment(){
        cakeCount++;
    }
}

class Team implements Runnable{
    CakeCounter counter;
    Team(CakeCounter counter){
        this.counter=counter;
    }
    public void run(){
        for(int i=0;i<1000;i++){
             counter.increment();

        }
    }
}

public class Synchronized {
    public static void main(String[] args) {
        CakeCounter counter=new CakeCounter();

        Thread t1= new Thread(new Team(counter));
        Thread t2= new Thread(new Team(counter));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){

        }

        System.out.println(counter.cakeCount);
    }

}
