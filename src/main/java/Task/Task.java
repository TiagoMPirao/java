package Task;

class Task {
    private String description;
    private String category;
    private int priority;
    private String deadline;

    public Task(String description, String category, int priority, String deadline) {
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public int getPriority() {
        return priority;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task " + description + ", Category: " + category + ", Priority: " + priority + ", Deadline: " + deadline;
    }
}
