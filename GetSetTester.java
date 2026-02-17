public class GetSetTester {
    public static void main(Strin[] args) {
        GetSet name = new GetSet();

        System.out.println(name.username);
    }
}

class GetSet {
    private String username = "pineappleghost333";

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        username = name;
    }
}