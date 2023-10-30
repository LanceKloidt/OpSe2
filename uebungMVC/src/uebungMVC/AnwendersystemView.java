package uebungMVC;

import javafx.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AnwendersystemView {
	private AnwendersystemModel anwModel;
	private AnwendersystemControl anwControl;
	
	public AnwendersystemView(AnwendersystemControl anwControl,Stage primaryStage, AnwendersystemModel anwModel) {
		this.anwControl = anwControl;
		this.anwModel = anwModel;
		
		Button speicherknopf = new Button("Speichern");
		TextField tfield = new TextField();
		primaryStage.setTitle(anwModel.getUeberschrift());
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		BorderPane root = new BorderPane();
		HBox hbox = new HBox();
		speicherknopf.setOnAction(e ->{
			
			anwControl.dateiSchreiben(tfield.getText());
		});
		
		hbox.getChildren().add(tfield);
		hbox.getChildren().add(speicherknopf);
		hbox.setAlignment(Pos.CENTER);
		root.setCenter(hbox);
		
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
