package ua.edu.ucu.apps.adapter.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MessageSender {
    private List<Client> receivers;

    public MessageSender(){
        receivers = new ArrayList<>();
    }

    public void addReceiver(Client user){
        receivers.add(user);
    }

    public void removeReceiver(Client user){
        receivers.remove(user);
    }

    public void send(String text, Client user, Country country){
        if (user.getCountry() == country.toString() && user.getLastActiveTime() == LocalDate.now()){
            user.receiveMessage(text);
        }
    }

    public void sendAll(String text, Country country){
        for (Client user: receivers){
            send(text, user, country);
        }
    }
}
