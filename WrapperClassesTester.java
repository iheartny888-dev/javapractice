public class WrapperClassesTester {
    public static void main(String[] args) {
        
        Wrapper.demoInteger();

    }
}

class Wrapper {
    public static void demoInteger() {
        int primitiveInt = 10;
        Integer myInt = 5;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + myInt);

        System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Min value of Integer: " + Integer.MIN_VALUE);
    }
}