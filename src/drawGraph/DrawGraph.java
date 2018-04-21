package drawGraph;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DrawGraph extends Application 
{
	public static void main(String[] args)
	{
		DrawGraph.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("»æÖÆ·ÖÐÎ");
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();

		
	}
	
}
