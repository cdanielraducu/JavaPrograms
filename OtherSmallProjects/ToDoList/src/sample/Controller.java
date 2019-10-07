package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import sample.datamodel.TodoData;
import sample.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;

    public Controller() {
    }

    public void initialize() {
        this.todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            public void changed(ObservableValue<? extends TodoItem> observable, TodoItem oldValue, TodoItem newValue) {
                if (newValue != null) {
                    TodoItem item = (TodoItem)Controller.this.todoListView.getSelectionModel().getSelectedItem();
                    Controller.this.itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    Controller.this.deadlineLabel.setText(df.format(item.getDeadline()));
                }

            }
        });
        this.todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        this.todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        this.todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleClickListView() {
        TodoItem item = (TodoItem)this.todoListView.getSelectionModel().getSelectedItem();
        this.itemDetailsTextArea.setText(item.getDetails());
        this.deadlineLabel.setText(item.getDeadline().toString());
    }
}
