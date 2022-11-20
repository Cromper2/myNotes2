package pl.slowacki.my_notes.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.slowacki.my_notes.dto.CreateNoteDto;
import pl.slowacki.my_notes.dto.NoteDetails;
import pl.slowacki.my_notes.mapper.NoteMapper;
import pl.slowacki.my_notes.repositories.NoteRepository;
import pl.slowacki.my_notes.services.NoteServices;

import java.util.Map;

@RestController
@RequestMapping("/notes")
public class NotesController {
    private final NoteServices noteServices;

    @Autowired
    public NotesController(NoteServices noteServices){
        this.noteServices = noteServices;
    }

    @PostMapping
    public NoteDetails createNote (@RequestBody CreateNoteDto noteDto){
        return noteServices.createNote(noteDto);
    }

    //@GetMapping
    //public NoteRepository readAll (Map map1) {return NoteRepository.}

    //@GetMapping
    //public NoteRepository
}
