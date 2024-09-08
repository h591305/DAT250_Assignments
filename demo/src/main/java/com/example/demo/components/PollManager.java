package com.example.demo.components;

import com.example.demo.domain.Poll;
import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;

@Component
public class PollManager {

private HashMap<String, User> users;
private HashMap<String, Poll> polls;

public PollManager() {
    this.users = new HashMap<>();
    this.polls = new HashMap<>();
}

public User addUser(User user) {
    users.put(user.getUsername(), user);
    return user;
}

public User getUser(String username) {
    return users.get(username);
}
public Collection<User> getAllUsers (){
    return users.values();
}

public void removeUser(String username) {
    users.remove(username);
}

public void addPoll(Poll poll) {
    polls.put(poll.getQuestion(), poll);
}
public Poll getPoll(String question) {
     return polls.get(question);
}

public void removePoll(String question) {
    polls.remove(question);
}



}

