package static_keyword;

public class Friends {
    String name;
    static int countFriends;
    Friends(String name){
        this.name = name;
        countFriends++;
        System.out.println("their name "+name);
    }
    static void displayNameFriend(){
        System.out.println("you have "+countFriends+" friends");
    }
}
