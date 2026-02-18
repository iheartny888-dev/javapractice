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
        System.out.println(player3.getUsername());

        System.out.print("Enter an ID: ");
        int id = Integer.parseInt(input.nextLine());
        player3.setID(id);
        System.out.println(player3.getID());

        System.out.print("Enter a rank (Noob, Amateur, Pro, Hacker, God): ");
        String rank = input.nextLine();
        player3.setRank(rank);
        System.out.println(player3.getRank());

        if (player1.getUsername().equals("pineappleghost333")) {
            System.out.println("You are an admin");
        } else {
            System.out.println("Access denied");
        }

        if (player3.getRank().equals("Noob")) {
            System.out.println("You are a Noob");
        }
        if (player3.getRank().equals("Amateur")) {
            System.out.println("You are an Amateur");
        }
        if (player3.getRank().equals("Pro")) {
            System.out.println("You are a Pro");
        }
        if (player3.getRank().equals("Hacker")) {
            System.out.println("You are a Hacker");
        }
        if (player3.getRank().equals("God")) {
            System.out.println("You are a God");
        }

    }
}

class GetSet {
    private String username = "No user name";
    private int ID = 0;
    private String rank = "No rank";

    public String getUsername() {
        return username;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public int getID() {
        return ID;
    }

    public void setID(int newID) {
        this.ID = newID;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String newRank) {
        this.rank = newRank;
    }
}