package main.expacecat.patterns.behavioralpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        for(User u:users) {
            if(u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }


}
