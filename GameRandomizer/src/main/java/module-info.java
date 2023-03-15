module com.vaermi.gamerandomizer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.vaermi.gamerandomizer to javafx.fxml;
    exports com.vaermi.gamerandomizer;
    exports model;
    opens model to javafx.fxml;
}