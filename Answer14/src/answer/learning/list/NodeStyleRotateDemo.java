package answer.learning.list;
/**
 * @author Master_Joe
 *
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application{
	@Override
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		StackPane pane = new StackPane();
		Button btOk = new Button("OK");
		btOk.setStyle("-fx-border-color: blue;");
		pane.getChildren().add(btOk);
		
		pane.setRotate(45);
		pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray");
		
		Scene scene = new Scene(pane,200,500);
		primaryStage.setTitle("NodeStyleRotateDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
