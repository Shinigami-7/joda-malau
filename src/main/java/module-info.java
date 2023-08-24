module com.example.joda_milau {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.joda_milau to javafx.fxml;
    exports com.example.joda_milau;
}