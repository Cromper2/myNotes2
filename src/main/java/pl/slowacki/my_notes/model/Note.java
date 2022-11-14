package pl.slowacki.my_notes.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Note {

    private Long id;
    private String description;
    private String userName;
    private Status status;
    private int weight;
    private LocalDateTime dueDate;

    public Note(String description, String userName, Status status, int weight, LocalDateTime dueDate, Long id) {
        this.description = description;
        this.userName = userName;
        this.status = status;
        this.weight = weight;
        this.dueDate = dueDate;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Note() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", userName='" + userName + '\'' +
                ", status=" + status +
                ", weight=" + weight +
                ", dueDate=" + dueDate +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return weight == note.weight && Objects.equals(description, note.description) && Objects.equals(userName, note.userName) && status == note.status && Objects.equals(dueDate, note.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, userName, status, weight, dueDate);
    }
}
