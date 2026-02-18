public class GetSetTester {
    public static void main(String[] args) {

        GetSet player1 = new GetSet();

        System.out.println(player1.getUsername());
        player1.setUsername("pineappleghost333");
        System.out.println(player1.getUsername());
        
    }
}

class GetSet{
    private String username;

    public String getUsername(){
        return username;
    }
    
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

}