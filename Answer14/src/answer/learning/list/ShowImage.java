package answer.learning.list;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author Master_Joe
 *
 */
public class ShowImage extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5));
		Image image = new Image("E:\\panda.png");
		pane.getChildren().add(new ImageView(image));
		
		ImageView imageView2 = new ImageView(image);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100);
		pane.getChildren().add(imageView2);
		
		ImageView imageView3 = new ImageView(image);
		imageView3.setRotate(90);
		pane.getChildren().add(imageView3);
		
		// Create a scene and palace it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowImage");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
