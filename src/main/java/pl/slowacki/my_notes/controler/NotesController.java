package pl.slowacki.my_notes.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pl.slowacki.my_notes.services.NoteServices;

@RestController
public class NotesController {
    private NoteServices noteServices;

    @Autowired
    public NotesController(NoteServices noteServices){
        this.noteServices = noteServices;
    }
}
