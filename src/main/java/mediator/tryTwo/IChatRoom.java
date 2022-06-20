package mediator.tryTwo;

// Mediator Interface
public interface IChatRoom {
    void sendMessage(String msg, String userId);
    void addUser(User user);
}
