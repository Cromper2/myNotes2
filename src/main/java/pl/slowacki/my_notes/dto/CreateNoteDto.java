package pl.slowacki.my_notes.dto;

import pl.slowacki.my_notes.model.Status;

import java.time.LocalDateTime;
import java.util.Objects;

public class CreateNoteDto {

    private String description;
    private String userName;
    private Status status;
    private int weight;
    private LocalDateTime dueDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateNoteDto that = (CreateNoteDto) o;
        return weight == that.weight && Objects.equals(description, that.description) && Objects.equals(userName, that.userName) && status == that.status && Objects.equals(dueDate, that.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, userName, status, weight, dueDate);
    }

    @Override
    public String toString() {
        return "CreateNoteDto{" + "description='" + description + '\'' + ", userName='" + userName + '\'' + ", status=" + status + ", weight=" + weight + ", dueDate=" + dueDate + '}';
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

    public CreateNoteDto() {
    }

    public CreateNoteDto(String description, String userName, Status status, int weight, LocalDateTime dueDate) {
        this.description = description;
        this.userName = userName;
        this.status = status;
        this.weight = weight;
        this.dueDate = dueDate;
    }
}
