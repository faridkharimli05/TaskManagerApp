import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\n====== TASK MANAGER ======");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Update task");
            System.out.println("4. Mark task completed");
            System.out.println("5. Show all tasks");
            System.out.println("6. Search tasks");
            System.out.println("7. Clear all tasks");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter description: ");
                    String description = sc.nextLine();

                    taskManager.addTask(title, description);
                    break;

                case 2:
                    System.out.print("Enter task ID: ");
                    Integer removeId = Integer.parseInt(sc.nextLine());

                    taskManager.removeTask(removeId);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    Integer updateId = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter new title: ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter new description: ");
                    String newDescription = sc.nextLine();

                    taskManager.updateTask(updateId, newTitle, newDescription);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    Integer doneId = Integer.parseInt(sc.nextLine());

                    taskManager.markCompleted(doneId);
                    break;

                case 5:
                    taskManager.getAllTasks();
                    break;

                case 6:
                    System.out.print("Enter keyword: ");
                    String keyword = sc.nextLine();

                    taskManager.search(keyword);
                    break;

                case 7:
                    System.out.print("Are you sure? (yes/no): ");
                    String answer = sc.nextLine();

                    if (answer.equalsIgnoreCase("yes")) {
                        taskManager.clearAll();
                    } else {
                        System.out.println("Canceled.");
                    }
                    break;

                case 8:
                    System.out.println("Bye");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
