public class WrapperClassesTester {
    public static void main(String[] args) {
        
        Wrapper.demoInteger();
        Wrapper.demoBoolean();

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

        int parsed = Integer.parseInt("25");
        System.out.println("Parsed integer from string: " + parsed);
    }

    public static void demoBoolean() {
        boolean primitiveBool = true;
        Boolean myBool = Boolean.valueOf(true);

        System.out.println("Primitive boolean: " + primitiveBool);
        System.out.println("Wrapper Boolean: " + myBool);

        System.out.println("Value of Boolean.TRUE: " + Boolean.TRUE);
        System.out.println("Value of Boolean.FALSE: " + Boolean.FALSE);

        boolean parsed = Boolean.parseBoolean("true");
        System.out.println("Parsed boolean from string: " + parsed);
    }
}