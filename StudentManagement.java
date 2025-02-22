import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;

public class StudentManagement extends Application {
    private Connection connect() {
        String url = "jdbc:sqlite:students.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name TEXT, age INTEGER)";
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void start(Stage primaryStage) {
        createTable();
        VBox root = new VBox();
        TextField nameField = new TextField();
        nameField.setPromptText("Enter Student Name");
        TextField ageField = new TextField();
        ageField.setPromptText("Enter Age");
        Button addButton = new Button("Add Student");

        addButton.setOnAction(e -> addStudent(nameField.getText(), Integer.parseInt(ageField.getText())));
        root.getChildren().addAll(nameField, ageField, addButton);
        
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Student Management");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addStudent(String name, int age) {
        String sql = "INSERT INTO students(name, age) VALUES(?, ?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
