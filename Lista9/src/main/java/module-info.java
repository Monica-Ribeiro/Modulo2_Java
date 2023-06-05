module com.example.lista9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lista9 to javafx.fxml;
    exports com.example.lista9;
}