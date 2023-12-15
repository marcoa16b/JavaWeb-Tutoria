package clases;

import java.sql.Date;

public class Task {
    private int taskId;
    private int projectId;
    private int userId;
    private String title;
    private String description;
    private String status;
    private Date dueDate;

    public Task() {
    }

    public Task(int taskId, int projectId, int userId, String title, String description, String status, Date dueDate) {
        this.taskId = taskId;
        this.projectId = projectId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }

    // GETTERS

    public int getTaskId() {
        return taskId;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    // SETTERS

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

}
