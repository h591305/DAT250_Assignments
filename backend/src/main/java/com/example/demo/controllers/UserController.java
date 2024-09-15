package com.example.demo.controllers;

import com.example.demo.components.PollManager;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Collection;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    private final PollManager pollManager;

    public UserController(@Autowired PollManager pollManager) {
        this.pollManager = pollManager;
    }

    @GetMapping("/all")
    public Collection<User> getAllUsers() {
       return this.pollManager.getAllUsers();

    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        return ResponseEntity.ok(this.pollManager.getUser(username));
    }

    @PostMapping("/create")
    public ResponseEntity<User> CreateUser(@RequestBody User user) {
        this.pollManager.addUser(user);
        return ResponseEntity.created(URI.create("/users/" + user.getUsername())).body(user);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Void> DeleteUser(@PathVariable String username) {

        pollManager.removeUser(username);
        return ResponseEntity.noContent().build();
    }
}
