package Task;

import java.util.ArrayList;
import java.util.List;

class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void updateTask(int index, Task updatedTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, updatedTask);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
