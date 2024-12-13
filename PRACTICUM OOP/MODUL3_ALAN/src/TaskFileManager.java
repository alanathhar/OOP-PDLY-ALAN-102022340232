import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class TaskFileManager {
    private static final String FILE_PATH = "tasks.txt"; // the file path to save the tasks 

    // method to load tasks from the file 
    public static ArrayList<Task> loadTasks() {
        ArrayList<Task> tasks = new ArrayList<>(); // list of tasks to be loaded from the file 
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    // Splitting the task data from the file into parts 
                    String[] parts = line.split(";");
                    if (parts.length != 4) {
                        continue; // Skip the task if it doesn't have all the required parts 
                    }

                    // Extracting the task data from the parts with parsing 
                    String title = parts[0];
                    String priority = parts[1];
                    LocalDate dueDate = LocalDate.parse(parts[2]);
                    String status = parts[3];

                    // Creating a new task object and adding it to the list
                    Task task = new Task(title, priority, dueDate, status);
                    tasks.add(task);
                } catch (Exception e) {
                    System.err.println("Error parsing task: " + e.getMessage()); // Error parsing task
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Task file not found. A new one will be created.");
        } catch (IOException e) {
            System.err.println("Error reading task file: " + e.getMessage()); 
        }
        return tasks; 
    }

    // Method to save tasks to the file
    public static void saveTasks(ArrayList<Task> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Task task : tasks) {
                // Writing the task data to the file using the format: title;priority;dueDate;status
                writer.write(String.format("%s;%s;%s;%s",
                        task.getTitle(),
                        task.getPriority(),
                        task.getDueDate(),
                        task.getStatus()));
                writer.newLine(); 
            }
        } catch (IOException e) {
            System.err.println("Error writing to task file: " + e.getMessage()); 
        }
    }
}
