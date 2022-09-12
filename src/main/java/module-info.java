module com.example.gus2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.gus2 to javafx.fxml;
    exports com.example.gus2;
}