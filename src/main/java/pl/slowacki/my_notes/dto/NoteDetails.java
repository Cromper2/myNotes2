package pl.slowacki.my_notes.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import pl.slowacki.my_notes.model.Status;

import java.time.LocalDateTime;
import java.util.Objects;

public class NoteDetails {

    private final Long id;
    private final String description;
    private final String userName;
    private final Status status;
    private final int weight;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "UTC")
    private final LocalDateTime dueDate;

    public NoteDetails(Long id, String description, String userName, Status status, int weight, LocalDateTime dueDate) {
        this.id = id;
        this.description = description;
        this.userName = userName;
        this.status = status;
        this.weight = weight;
        this.dueDate = dueDate;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteDetails that = (NoteDetails) o;
        return weight == that.weight && Objects.equals(id, that.id) && Objects.equals(description, that.description) && Objects.equals(userName, that.userName) && status == that.status && Objects.equals(dueDate, that.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, userName, status, weight, dueDate);
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getUserName() {
        return userName;
    }

    public Status getStatus() {
        return status;
    }

    public int getWeight() {
        return weight;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "NoteDetails{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", userName='" + userName + '\'' +
                ", status=" + status +
                ", weight=" + weight +
                ", dueDate=" + dueDate +
                '}';
    }
}

