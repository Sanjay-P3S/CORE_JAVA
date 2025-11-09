class Web{
 synchronized  void show(String name) throws InterruptedException {
        for(int i=0;i<10;i++){
            System.out.println("Web method!!!!"+name);
            Thread.sleep(1000);
            System.out.println("User1"+name);
        }

    }
}

class User1 extends Thread{

    Web ob;
    String name;

    User1(Web ob,String name){
        this.ob=ob;
        this.name=name;
    }
    @Override
    public void run() {
        try {
            ob.show(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
       Web obj=new Web();
       User1 obj3= new User1(obj,"user1");
       User1 obj4 = new User1(obj,"user2");

       obj3.start();
       obj4.start();

    }

}
