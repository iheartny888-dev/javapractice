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

        System.out.println("# of chars in string: " + name1.length());
        System.out.println("Index select: " + name2.indexOf("o"));
        System.out.println("Character select: " + name2.charAt(2));

        String quote = "Talk is cheap, show me the code.";
        String result1 = quote.substring(15);

        System.out.println("Full quote: " + quote);
        System.out.println("Substring 1: " + result1);

    }
}