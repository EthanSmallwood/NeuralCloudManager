module com.example.finalyearproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalyearproject to javafx.fxml;
    exports com.example.finalyearproject;
}