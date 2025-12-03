//Java is STRONGLY TYPED - you have to declare a variables data type when you define it

class DataTypeExamples {
    int myInt = 42;
    double myDouble = 182.75;
    char myChar = 'Q';
    boolean myBool = false;
}

public class DataTypes {
    public static void main(String[] args) {
        DataTypeExamples dt = new DataTypeExamples();
        System.out.println("myInt: " + dt.myInt);
    }
}