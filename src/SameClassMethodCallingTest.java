public class SameClassMethodCallingTest {
    public static void main(String[] args) {
        SameClassMethodCallingTest test = new SameClassMethodCallingTest();
        test.name();

        A obj = new A();
        obj.say();

    }

    public  void name(){
        System.out.println("Hello World");
    }
}

class A{
    public  void names(){
        System.out.println("Hello Worlds");
    }

    void say(){
        names();
    }


}
