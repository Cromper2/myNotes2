package pl.slowacki.my_notes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.slowacki.my_notes.mapper.NoteMapper;
import pl.slowacki.my_notes.model.Note;
import pl.slowacki.my_notes.dto.CreateNoteDto;
import pl.slowacki.my_notes.dto.NoteDetails;
import pl.slowacki.my_notes.repositories.NoteRepository;

@Service
public class NoteServices {

    private final NoteMapper noteMapper;
    private final NoteRepository noteRepository;

    @Autowired
    public NoteServices(NoteMapper noteMapper, NoteRepository noteRepository){
        this.noteMapper = noteMapper;
        this.noteRepository = noteRepository;
    }

    public NoteDetails createNote(CreateNoteDto noteDto){
        Note note = noteMapper.toEntity(noteDto);
        note = noteRepository.save(note);
        return noteMapper.toDetails(note);
    }

    //public NoteDetails readNote(NoteRepository noteRepository){
    //    return
    //}
}
