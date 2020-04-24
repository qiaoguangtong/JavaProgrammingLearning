package answer.learning.list;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * @author Master_Joe
 *
 */
public class MultipleStageDemo extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		Button buttonOK = new Button("OK");
		BorderPane root = new BorderPane();
		root.setCenter(buttonOK);

		Scene scene = new Scene(root, 200, 250);
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
		BorderPane root2 = new BorderPane();
		Stage stage = new Stage();
		stage.setTitle("Second statge");
		stage.setScene(new Scene(root2, 100, 100));
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
