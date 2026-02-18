import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername());
        player1.setUsername("pineappleghost333");
        System.out.println(player1.getUsername());

        System.out.println(player2.getUsername());
        player2.setUsername("ironmouse6741");
        System.out.println(player2.getUsername());

        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String user = input.nextLine();
        player3.setUsername(user);

        
    }
}

class GetSet {
    private String username = "No user name";

    public String getUsername(){
        return username;
    }
    
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
}