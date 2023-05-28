module com.example.lista8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lista8 to javafx.fxml;
    exports com.example.lista8;
}