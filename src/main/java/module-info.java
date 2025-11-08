module br.com.padaria.bakerysystem {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens br.com.padaria.bakerysystem.controller to javafx.fxml;

    opens br.com.padaria.bakerysystem.model to javafx.fxml;

    exports br.com.padaria.bakerysystem.app;
}