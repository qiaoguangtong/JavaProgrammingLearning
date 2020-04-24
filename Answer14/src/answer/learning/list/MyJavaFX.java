package answer.learning.list;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class MyJavaFX extends Application {
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();// root根容器

		Button btn = new Button("登录"); // 添加按钮
		root.setCenter(btn);
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("MyJavaFX");
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}