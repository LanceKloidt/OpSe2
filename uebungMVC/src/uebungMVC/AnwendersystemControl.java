package uebungMVC;
import java.io.*;
import javafx.stage.Stage;

public class AnwendersystemControl {
	private AnwendersystemModel anwModel;
	private AnwendersystemView anwView;
	
	public AnwendersystemControl(Stage primaryStage) {
		anwModel = new AnwendersystemModel();
		anwView = new AnwendersystemView(this, primaryStage, anwModel);
	}
	
	public void dateiSchreiben(String inhalt){
		try {
			anwModel.schreibeDatei(inhalt);
		}
		catch(IOException e) {
			
		}
	}
		
	
}
