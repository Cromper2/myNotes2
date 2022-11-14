package pl.slowacki.my_notes.services;

import org.springframework.beans.factory.annotation.Autowired;
import pl.slowacki.my_notes.mapper.NoteMapper;
import pl.slowacki.my_notes.model.Note;
import pl.slowacki.my_notes.dto.CreateNoteDto;
import pl.slowacki.my_notes.repositories.NoteRepository;

public class NoteServices {

    private NoteMapper noteMapper;
    private NoteRepository noteRepository;

    @Autowired
    public NoteServices(NoteMapper noteMapper){
        this.noteMapper = noteMapper;
        this.noteRepository = noteRepository;
    }

    public Note createNote(CreateNoteDto noteDto){
        Note note = noteMapper.toEntity(noteDto);
        note = noteRepository.save(note);
        return note;
    }
}
