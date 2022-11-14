package pl.slowacki.my_notes.repositories;

import pl.slowacki.my_notes.model.Note;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class NoteRepository {

    AtomicLong idSequence = new AtomicLong(0);
    Map<Long, Note> noteDB = new HashMap<>();

    public Note save(Note note){
        note.setId(idSequence.incrementAndGet());
        noteDB.put(note.getId(), note);
        return note;

    }
}
