module com.example.lista1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lista1 to javafx.fxml;
    exports com.example.lista1;
}