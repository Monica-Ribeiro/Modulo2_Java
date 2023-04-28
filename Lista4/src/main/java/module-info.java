module com.example.lista4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.lista4 to javafx.fxml;
    exports com.example.lista4;
}