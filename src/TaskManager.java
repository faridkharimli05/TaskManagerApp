import java.util.ArrayList;

public class TaskManager {

    private final ArrayList<Task> tasks = new ArrayList<>();

    private Integer nextId = 0;

    public void addTask(String title, String description) {
        Task task = new Task(nextId, title, description, false);
        tasks.add(task);
        nextId++;
        System.out.println(" Task added ");
    }


    public Task findById(Integer id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }


    public void removeTask(Integer id) {
        Task task = findById(id);


        if (task == null) {
            System.out.println("Task not found");
            return;
        }


        tasks.remove(task);
        System.out.println("Task removed");


    }


    public void updateTask(Integer id, String newTitle, String newDescription) {
        Task task = findById(id);

        if (task == null) {
            System.out.println("Task not found");
            return;
        }

        task.setTitle(newTitle);
        task.setDescription(newDescription);
        System.out.println("Task updated");
    }



    public void markCompleted(Integer id) {
        Task task = findById(id);

        if (task == null) {
            System.out.println("Task not found");
            return;
        }

        task.markAsCompleted();
        System.out.println("Task completed");
    }


    public void getAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }


    public void search(String keyword) {
        boolean found = false;
        String key = keyword.toLowerCase();

        for (Task task : tasks) {
            if (task.getTitle().toLowerCase().contains(key)
                    || task.getDescription().toLowerCase().contains(key)) {
                System.out.println(task);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching tasks found.");
        }
    }

    public void clearAll() {
        tasks.clear();
        System.out.println("All tasks cleared");
    }







}
