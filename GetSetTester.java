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
        int id = input.nextInt();
        player3.setID(id);
        System.out.println(player3.getID());

        System.out.print("Enter a rank (Noob, Amateur, Pro, Hacker, God): ");
        String rank = input.nextLine();
        player3.setRank(rank);
        System.out.println(player3.getRank());

        
    }
}

class GetSet {
    private String username = "No user name";
    private int ID = 0;
    private String rank = "No rank";

    public String getUsername(){
        return username;
    }
    
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public int getID(){
        return ID;
    }
    
    public void setID(int newID){
        this.ID = newID;
    }

    public String getRank(){
        return rank;
    }
    
    public void setRank(String newRank){
        this.rank = newRank;
    }
}