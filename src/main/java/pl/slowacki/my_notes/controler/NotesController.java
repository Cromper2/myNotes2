package pl.slowacki.my_notes.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.slowacki.my_notes.dto.CreateNoteDto;
import pl.slowacki.my_notes.dto.NoteDetails;
import pl.slowacki.my_notes.services.NoteServices;

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
}
