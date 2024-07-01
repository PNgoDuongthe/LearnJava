package static_keyword;

public class Main {
    public static void main(String[] args) {
        Friends friend1 = new Friends("Tuan");
        Friends friend2 = new Friends("Dang");
        Friends friend3 = new Friends("Hau");
        Friends friend4 = new Friends("Paul");
        System.out.println(Friends.countFriends);
        Friends.displayNameFriend();
    }
}
