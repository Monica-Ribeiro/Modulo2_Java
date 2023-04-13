module com.example.lista2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lista2 to javafx.fxml;
    exports com.example.lista2;
}