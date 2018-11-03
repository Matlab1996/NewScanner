package newscanner;

import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	static AnchorPane root1 = new AnchorPane();
	static AnchorPane root2 = new AnchorPane();
	static AnchorPane root3 = new AnchorPane();
	static AnchorPane root4 = new AnchorPane();
	//static AnchorPane root5 = new AnchorPane();
	
	static Scene scene1 = null;
	static Scene scene2 = null;
	static Scene scene3 = null;
	static Scene scene4 = null;
	//static Scene scene5 = null;
	
	static File file1 = new File("src/main/resources/fxml/P1.fxml");
	static File file2 = new File("src/main/resources/fxml/P2.fxml");
	static File file3 = new File("src/main/resources/fxml/P3.fxml");
	static File file4 = new File("src/main/resources/fxml/P4.fxml");
	
	static Stage stage = new Stage();
	//static Stage stage1 = new Stage();

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		root1 = FXMLLoader.load(file1.toURI().toURL());
		root2 = FXMLLoader.load(file2.toURI().toURL());
		root3 = FXMLLoader.load(file3.toURI().toURL());
		root4 = FXMLLoader.load(file4.toURI().toURL());
		//root5 = FXMLLoader.load(getClass().getResource("P5.fxml"));
		
		scene1 = new Scene(root1);
		scene2 = new Scene(root2);
		scene3 = new Scene(root3);
		scene4 = new Scene(root4);
		//scene5 = new Scene(root5);
		
		primaryStage = stage;
		primaryStage.setTitle("CamTouch");
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
