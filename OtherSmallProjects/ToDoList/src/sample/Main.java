package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.datamodel.TodoData;

import java.io.IOException;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Todo List");
        primaryStage.setScene(new Scene(root, 900.0D, 500.0D));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void stop() throws Exception {
        try {
            TodoData.getInstance().storeTodoItems();
        } catch (IOException var2) {
            System.out.println(var2.getMessage());
        }

    }

    public void init() throws Exception {
        try {
            TodoData.getInstance().loadTodoItems();
        } catch (IOException var2) {
            System.out.println(var2.getMessage());
        }

    }
}
