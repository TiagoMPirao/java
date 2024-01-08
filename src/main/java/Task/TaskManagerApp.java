package Task;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter task category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter task priority: ");
                    int priority = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter task deadline: ");
                    String deadline = scanner.nextLine();
                    Task newTask = new Task(description, category, priority, deadline);
                    taskManager.addTask(newTask);
                }
                case 2 -> {
                    System.out.print("Enter the index of the task to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String updatedDescription = scanner.nextLine();
                    System.out.print("Enter task category: ");
                    String updatedCategory = scanner.nextLine();
                    System.out.print("Enter task priority: ");
                    int updatedPriority = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter task deadline: ");
                    String updatedDeadline = scanner.nextLine();
                    Task updatedTask = new Task(updatedDescription, updatedCategory, updatedPriority, updatedDeadline);
                    taskManager.updateTask(updateIndex, updatedTask);
                }
                case 3 -> {
                    System.out.print("Enter the index of the task to delete: ");
                    int deleteIndex = scanner.nextInt();
                    taskManager.deleteTask(deleteIndex);
                }
                case 4 -> {
                    List<Task> tasks = taskManager.getTasks();
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ". " + tasks.get(i));
                    }
                }
                case 5 -> {
                    System.out.println("Exiting the Task Manager.");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

