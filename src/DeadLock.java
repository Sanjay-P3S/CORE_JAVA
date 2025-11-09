
class Ones{
    synchronized public void method1(Twos ob){
    System.out.println("Method 1 started");
        ob.method4();
    }
    synchronized public void method2(){
        System.out.println("Method 2 started");
    }
}

class Twos{
    synchronized public void method3(Ones ob){
        System.out.println("Method 3 started");
        ob.method2();



    }
    synchronized public void method4(){

        System.out.println("Method 4 started");
    }
}

class Thrd extends Thread{
    Ones ob;
    Twos obj;

    Thrd(Ones ob,Twos obj2){
        this.ob = ob;
        this.obj=obj2;
    }

    public void run(){
        obj.method3(ob);

    }

}
public class DeadLock extends Thread {
    Ones ob;
    Twos obj;

   DeadLock(Ones ob,Twos obj2){
       this.ob = ob;
       this.obj=obj2;
   }

    public void run(){
        ob.method1(obj);

    }
    public static void main(String[] args) throws InterruptedException {
           Ones ob1 = new Ones();
           Twos ob2 = new Twos();
            Thrd t = new Thrd(ob1,ob2);
            DeadLock t1= new DeadLock(ob1,ob2);
            t.start();
            t1.start();
    }
}
