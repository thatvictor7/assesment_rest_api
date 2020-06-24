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

//    @GetMapping("?query={word}")
////    @RequestMapping(method = RequestMethod.GET, value = "?query={searchWord}")
//    public Integer allBySearchQuery(@PathVariable String word) {
//        System.out.println(word);
//
//        return 3;
//    }
//    @GetMapping("?query={id}")


//    @GetMapping("")
//    public Iterable<Note> all() {
//
//        System.out.println("get all");
//
//        return this.repository.findAll();
//    }


//    @RequestMapping("?query={word}")
//    public List<Note> byWord(@PathVariable(value = "word") String word) {
////    public List<Note> byWord(@Que(value = "word") String word) {
//        System.out.println(word);
////        return this.repository.findAllByBody("%" + word + "%");
//        return this.repository.findAllByBody(word);
//    }

    @GetMapping("")
    public List<Note> getParam(@RequestParam String query) {
        System.out.println("by query");
//        return this.repository.findAllByBody(query);
        return this.repository.findAllByBody("%" + query + "%");
    }


}
