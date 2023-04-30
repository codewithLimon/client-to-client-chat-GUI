module com.example.demochat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires MaterialFX;


    opens com.example.demochat to javafx.fxml;
    exports com.example.demochat;
}