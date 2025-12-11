import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter your age");
        String age = input.nextLine();

        int ageConverted = Integer.parseInt(age);
        System.out.println("Next year " + name + " will be: " + (ageConverted + 1));

        System.out.println("What is your height in meters?");
        double height = Double.parseDouble(input.nextLine());
        System.out.println("You are " + height + " meters tall.");

        System.out.println("Enter two words and two numbers");
        String[] words = new String[] { input.nextLine(), input.nextLine() };
        int[] nums = new int[] { Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine()) };
        System.out.println("Your email is: " + words[0] + words[1] + nums[0] + nums[1] + "@csaea.com");

        System.out.println("Enter two numbers");
        double[] doubles = new double[] { Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()) };
        System.out.println(doubles[0] / doubles[1]);

    }

}

