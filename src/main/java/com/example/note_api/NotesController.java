package com.example.note_api;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/notes")
public class NotesController {

    private final NoteRepository repository;

    public NotesController(NoteRepository repository) { this.repository = repository; }

    @PostMapping
    public Note create(@RequestBody Note note) {
        return this.repository.save(note);
    }

    @GetMapping("/{id}")
    public Optional<Note> getNoteById(@PathVariable Long id) {

        System.out.println(id);
        return this.repository.findById(id);

    }

    @GetMapping("")
    public List<Note> all(@RequestParam(required = false) String query) {
        System.out.println(query);
        if (query == null) {
            System.out.println("false");
            return this.repository.getAll();
        } else {
            return this.repository.findAllByBody("%" + query + "%");
        }
    }

}
