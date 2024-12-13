import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainAppController {

    @FXML
    private TableView<Task> taskTable; // Table for displaying tasks
    @FXML
    private TableColumn<Task, String> titleCol, priorityCol, statusCol; // Columns for task title, priority, and status
    @FXML
    private TableColumn<Task, LocalDate> dueDateCol; // Column for task due date
    @FXML
    private TextField titleField; // TextField for task title 
    @FXML
    private ComboBox<String> priorityBox; // ComboBox for task priority 
    @FXML
    private DatePicker dueDatePicker; // DatePicker for task due date 

    private ObservableList<Task> taskList; // List of tasks 

    @FXML
    public void initialize() {
        taskList = FXCollections.observableArrayList(TaskFileManager.loadTasks());

        // TODO: Set cell value factory for each column in order to display the correct attribute
        // hint: use setCellValueFactory and PropertyValueFactory method
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        priorityCol.setCellValueFactory(new PropertyValueFactory<>("priority"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        dueDateCol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        // TODO: Set the width of each column 
        // hint: use setPrefWidth
        titleCol.setPrefWidth(100);
        priorityCol.setPrefWidth(100);
        statusCol.setPrefWidth(100);
        dueDateCol.setPrefWidth(100);
        taskTable.setItems(taskList);

        // TODO: Add options to the priorityBox 
        priorityBox.getItems().addAll("High", "Medium", "Low");
    }

    @FXML
    private void addTask() {
        try {
        
            if (titleField.getText().isEmpty() || priorityBox.getValue() == null || dueDatePicker.getValue() == null) {
                // TODO: Throw new MissingFieldException with the appropriate message 
                throw new MissingFieldException("Missing");
            }

            if (dueDatePicker.getValue().isBefore(LocalDate.now())) {
                // TODO: Throw new InvalidDateException with the appropriate message 
                throw new InvalidDateException("Invalid");
            }

            // TODO: Create a new Task object with the values from the form 
            // hint: use getText() for TextField, getValue() for ComboBox, and DatePicker, also add "Incomplete" as the default status
            Task task = new Task(
                titleField.getText(),
                priorityBox.getValue(),
                dueDatePicker.getValue(),
                "Incomplete"
            );

            // TODO: Add the new task to the taskList
            // hint: use add method from ObservableList
            taskList.add(task);

            clearData();
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        }
        
        // example of the catch and throw error 
        catch (MissingFieldException | InvalidDateException e) {
            showError(e.getMessage());
        }

    }

    // TODO: clear the data in the form after adding a task
    // hint: use function getSelectionModel().clearSelection() for ComboBox dan getEditor().clear() for DatePicker

    private void clearData(){
        titleField.clear();
        priorityBox.getSelectionModel().clearSelection();
        dueDatePicker.getEditor().clear();
    }

    @FXML
    private void deleteTask() {
        try {
    
            Task selected = taskTable.getSelectionModel().getSelectedItem();
            if (selected == null) {
                // TODO: Throw new TaskNotSelectedException with the appropriate message 
                throw new TaskNotSelectedException("Task Selected");
            }

            taskList.remove(selected);
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        }
        
        // TODO: Catch TaskNotSelectedException and call showError (Look up at the example in addTask)
        catch (TaskNotSelectedException e){
            showError(e.getMessage());
        }

    }

    @FXML
    private void markTaskComplete() {
        try {
            Task selected = taskTable.getSelectionModel().getSelectedItem();
            if (selected == null) {
                // TODO: Throw new TaskNotSelectedException with the appropriate message 
                throw new TaskNotSelectedException("Task Not Selected");
            }
            // TODO: Set the status of the selected task to "Complete"
            // hint: gunakan function setStatus dari kelas Task
            selected.setStatus("Complete");

            taskTable.refresh();
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        }

        // TODO: Catch TaskNotSelectedException and call showError once again 
        catch (TaskNotSelectedException e){
            showError(e.getMessage());
        }
        

    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.showAndWait();
    }

    // TODO: create MissingFieldException exception
    public class MissingFieldException extends Exception {
        public MissingFieldException(String Message){
            super(Message);
        }
    }
    // TODO: create TaskNotSelectedException exception
    public class TaskNotSelectedException extends Exception {
        public TaskNotSelectedException(String Message){
            super(Message);
        }
    }
    // TODO: create kelas InvalidDateException exception 
    public class InvalidDateException extends Exception {
        public InvalidDateException(String Message){
            super(Message);
        }
    }
    // TODO: create kelas MissingDateException exception
    public class MissingDateException extends Exception {
        public MissingDateException(String Message){
            super(Message);
        }
    }
}