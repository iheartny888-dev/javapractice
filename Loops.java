public class Loops {
    public static void main(String[] args) {

        //break - stops the loop entirely
        //continue - continues to the next iteration of the loop
        //return - inside nested loop, ends ALL loops that are occuring, ends the whole function

        for (int i = 0; i < 5; i += 2) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }


        int m = 0;
        while (m < 5) { 
            System.out.println(m);
            
            m++;
        }

        boolean isContinuing = true;

        while (isContinuing) {
            isContinuing = false;
        }

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print("foo");
            }
            if (i % 5 == 0) {
                System.out.print("bar");
            }
        }
    }
}