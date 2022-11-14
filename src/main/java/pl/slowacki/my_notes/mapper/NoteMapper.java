package pl.slowacki.my_notes.mapper;

import org.springframework.stereotype.Component;
import pl.slowacki.my_notes.dto.CreateNoteDto;
import pl.slowacki.my_notes.model.Note;
import pl.slowacki.my_notes.model.NoteDetails;
import pl.slowacki.my_notes.model.Status;

@Component
public class NoteMapper {
    public Note toEntity(CreateNoteDto createNoteDto) {
        return new Note(createNoteDto.getDescription(), createNoteDto.getUserName(), Status.NEW, 1, createNoteDto.getDueDate(), null);
    }

    public NoteDetails toDetails(Note note){
        return new NoteDetails(note.getId(), note.getDescription(), note.getUserName(), note.getStatus(),note.getWeight(), note.getDueDate());
    }
}
