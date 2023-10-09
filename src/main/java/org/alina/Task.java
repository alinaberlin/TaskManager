package org.alina;

public class Task implements Taskble{
    private String title;
    private String description;
    private String priority;
    private String status;

    public Task(String title, String description, String priority, String status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;

    }

    public Task() {

    }

    public  String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public void changeStatus(String status) {
        this.status=status;
    }

    @Override
    public void changePriority(String priority) {
      this.priority= priority;
    }

    @Override
    public void updatingDescription(String description) {
        this.description =description;

    }

    @Override
    public void updatingTitle(String title) {
        this.title = title;

    }
}
