module com.example.mtgcounter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mtgcounter to javafx.fxml;
    exports com.example.mtgcounter;
}