module com.example.lista3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lista3 to javafx.fxml;
    exports com.example.lista3;
}