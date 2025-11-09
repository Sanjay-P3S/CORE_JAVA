public class ExceptionHandling {
    public static void main(String[] args) {
//        try{
//            int a=5/1;
//            throw new ArithmeticException();
//
//        }
//        catch(ArithmeticException e){
//            e.printStackTrace();
//        }
//        finally{
//            System.out.println("finally");
//        }
//    }

        ExceptionHandling obj = new ExceptionHandling();
        obj.slave();



    }

    public void throwDemo() throws NullPointerException {
      String str= null;
      System.out.println(str.length());

    }

    public void  slave(){
        try {
            throwDemo();
        }
        catch (NullPointerException e){
            System.out.println("Exception--> "+e);


        }
    }
}
