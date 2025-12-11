public class Strings {
    public static void main(String[] args) {
        
        String nameObj = new String("Didi");
        String name1 = "Didi";
        String name2 = "Gogo";
        String name3 = "Gogo";

        System.out.println("Name1 and NameObj: " + (name1 == nameObj));
        System.out.println("Name2 and Name3: " + (name2 == name3));
        System.out.println("Name1 and NameObj: " + name1.equals(nameObj));

        System.out.println("Compare: " + name1.compareTo(name2));

    }
}