package sample.datamodel;

import javafx.collections.FXCollections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

public class TodoData {
    private static TodoData instance = new TodoData();
    private static String filename = "TodoListItems.txt";
    private List<TodoItem> todoItems;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static TodoData getInstance() {
        return instance;
    }

    private TodoData() {
    }

    public List<TodoItem> getTodoItems() {
        return this.todoItems;
    }

    public void loadTodoItems() throws IOException {
        this.todoItems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);

        String input;
        try {
            while((input = br.readLine()) != null) {
                String[] itemPieces = input.split("\t");
                String shortDescription = itemPieces[0];
                String details = itemPieces[1];
                String dateString = itemPieces[2];
                LocalDate date = LocalDate.parse(dateString, this.formatter);
                TodoItem todoItem = new TodoItem(shortDescription, details, date);
                this.todoItems.add(todoItem);
            }
        } finally {
            if (br != null) {
                br.close();
            }

        }

    }

    public void storeTodoItems() throws IOException {
        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);

        try {
            Iterator iter = this.todoItems.iterator();

            while(iter.hasNext()) {
                TodoItem item = (TodoItem)iter.next();
                bw.write(String.format("%s\t%s\t%s", item.getShortDescription(), item.getDetails(), item.getDeadline().format(this.formatter)));
                bw.newLine();
            }
        } finally {
            if (bw != null) {
                bw.close();
            }

        }

    }
}
