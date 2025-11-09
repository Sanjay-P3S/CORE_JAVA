import java.util.Arrays;

enum  Shape {
    CIRCLE,
    SQUARE,
    TRIANGLE,
    SQUARE_UP,
    SQUARE_DOWN,
    TRIANGLE_UP,
    TRIANGLE_DOWN,
}

public class EnumClass {
    public static void main(String[] args) {
//        System.out.println(Shape.CIRCLE);
//        System.out.println(Arrays.toString(Shape.values()));

        Shape shape = Shape.CIRCLE;
//      if(shape == Shape.SQUARE){
//            System.out.println("SQUARE");
//        }
//          else if(shape == Shape.TRIANGLE){
//            System.out.println("TRIANGLE");
//        }
//        else{
//            System.out.println("NOT SQUARE");
//        }

//        switch (shape) {
//            case CIRCLE:
//                System.out.println("Circle");
//                break;
//            case SQUARE:
//                System.out.println("Square");
//                break;
//            default:
//                System.out.println("Undefined");
//        }

        System.out.println(shape.getClass().getSuperclass());

    }
}
