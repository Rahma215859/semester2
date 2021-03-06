module com.example.sundhed {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.hmaar.sundhed to javafx.fxml;
    exports com.hmaar.sundhed;
    exports com.hmaar.sundhed.controller;
    opens com.hmaar.sundhed.controller to javafx.fxml;
    exports com.hmaar.sundhed.model;
    opens com.hmaar.sundhed.model to javafx.fxml;
    exports com.hmaar.sundhed.model.interfaces;
    opens com.hmaar.sundhed.model.interfaces to javafx.fxml;
}