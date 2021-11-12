module com.example.gui_assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires org.testng;
    requires org.junit.jupiter.api;

    opens com.example.gui_assignment to javafx.fxml;
    exports com.example.gui_assignment;
}