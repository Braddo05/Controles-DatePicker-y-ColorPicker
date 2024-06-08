module Tarea2 {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.base;
	
	opens app to javafx.graphics, javafx.fxml;
}
