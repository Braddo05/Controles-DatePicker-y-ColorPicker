package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label fechalbl = new Label("Selecciona la fecha:");
        DatePicker fechapk = new DatePicker();
        
        Button guardarbt = new Button("Guardar");
        
        Label colorlbl = new Label("Selecciona el color:");
        ColorPicker colorpk = new ColorPicker();
        
        Label label1 = new Label();
        
        // Acción del botón
        guardarbt.setOnAction(e -> {
            String fecha = fechapk.getValue().toString();
            Color color = colorpk.getValue();
            
            String colorHex = String.format("#%02X%02X%02X", 
                    (int)(color.getRed()*255),
                    (int)(color.getGreen()*255),
                    (int)(color.getBlue()*255));
            
            label1.setText("Fecha : " + fecha + ", Color: " + colorHex);
            label1.setTextFill(color);
        });
        
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(fechalbl, fechapk, colorlbl, colorpk, guardarbt, label1);
        
        
        Scene scene = new Scene(vbox, 400, 400);
        primaryStage.setTitle("Fecha con color xd");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
