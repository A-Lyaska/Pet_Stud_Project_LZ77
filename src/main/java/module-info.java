module com.lz77 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lz77 to javafx.fxml;
    exports com.lz77;
}
