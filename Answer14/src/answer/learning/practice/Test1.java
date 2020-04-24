package answer.learning.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author Master_Joe
 *
 */
public class Test1 extends Application {
	public Test1() {
		System.out.println("The constructor has been invoked");
	}
	
	@Override
	public void start(Stage primaryStage) {
		System.out.println("start method has been invoked");
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setTitle("A simple scene");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		System.out.println("launch invoked");
		Application.launch(args);
	}
	
	
}
