package com.example.demo.controllers;

import com.example.demo.components.PollManager;
import com.example.demo.domain.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Collection;

@RestController
@RequestMapping("/polls")
public class PollController {

    private final PollManager pollManager;

    public PollController(@Autowired PollManager pollManager) {
        this.pollManager = pollManager;
    }


    @GetMapping("/{question}")
    public ResponseEntity<Poll> getPoll(@PathVariable String question) {
        return ResponseEntity.ok(this.pollManager.getPoll(question));
    }

    @PostMapping("/create")
    public ResponseEntity<Poll> CreateUser(@RequestBody Poll poll) {
        this.pollManager.addPoll(poll);
        return ResponseEntity.created(URI.create("/polls/" + poll.getQuestion())).body(poll);
    }

    @DeleteMapping("/{question}")
    public ResponseEntity<Void> DeleteUser(@PathVariable String question) {

        pollManager.removeUser(question);
        return ResponseEntity.noContent().build();
    }
}
