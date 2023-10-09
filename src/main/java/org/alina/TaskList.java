package org.alina;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks = new ArrayList<>();
    private Task inputTitle;

    public void addTask(Task task) {
        tasks.add(task);

    }

    public void deleteTask(int index) {
        tasks.remove(index);
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }

    public Task updateTask(Task inputTask, int index) {
        Task task = tasks.get(index);
        task.updatingDescription(inputTask.getDescription());
        task.updatingTitle(inputTask.getTitle());
        task.changePriority(inputTask.getPriority());
        task.changeStatus(inputTask.getStatus());
        return task;
    }

}


