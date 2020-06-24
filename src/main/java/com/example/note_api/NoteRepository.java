package com.example.note_api;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NoteRepository extends CrudRepository<Note, Long> {

//    List<Note> findAllByBodyLike(String body);

//    @Query(value = "SELECT * FROM  NOTES WHERE (body like '?1'", nativeQuery = true)
//    @Query(value = "SELECT * FROM  NOTES", nativeQuery = true)
//@Query(value = "SELECT * FROM  notes WHERE (body like '?1')", nativeQuery = true)
    @Query(value = "SELECT * FROM  notes WHERE body like %?1", nativeQuery = true)
    List<Note> findAllByBody(@Param("word") String word);



}
