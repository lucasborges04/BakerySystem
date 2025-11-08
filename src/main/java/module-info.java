module br.com.padaria.bakerysystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.padaria.bakerysystem to javafx.fxml;
    exports br.com.padaria.bakerysystem;
    exports br.com.padaria.bakerysystem.app;
    opens br.com.padaria.bakerysystem.app to javafx.fxml;
}