package uebungMVC;
import javafx.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Main extends Application {
	public static void main(String args[]) {
	 launch(args);	
	}
	public void start(Stage st) {
		AnwendersystemControl anwControl = new AnwendersystemControl(st);

	}
}
