module com.example.bibliotecados {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bibliotecados to javafx.fxml;
    exports com.example.bibliotecados;
}