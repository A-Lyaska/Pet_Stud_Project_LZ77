module com.artyomov {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lz77 to javafx.fxml;
    exports com.lz77;
}
