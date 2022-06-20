package mediator.tryTwo;

public class ClientMediator {
    public static void main(String[] args) {
        ChatRoom chatroom = new ChatRoom();

        User user1 = new ChatUser(chatroom, "1", "pepe");
        User user2 = new ChatUser(chatroom, "2", "juan");

        chatroom.addUser(user1);
        chatroom.addUser(user2);

        user1.send("Hello juan", "2");
        user2.send("Hey buddy", "1");

    }
}
