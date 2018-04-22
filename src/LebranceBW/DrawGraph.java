package LebranceBW;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DrawGraph extends Application 
{
	private double xbias, ybias; // 按钮按下时相对窗体的偏移
	public static void main(String[] args)
	{
		DrawGraph.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Scene root = new Scene(FXMLLoader.load(getClass().getResource("main.fxml")));
		root.getRoot().setOnMouseDragged(e->{
			primaryStage.setX(e.getScreenX() - xbias);
			primaryStage.setY(e.getScreenY() - ybias);
		});
		root.getRoot().setOnMousePressed(e->{
			xbias = e.getScreenX() - primaryStage.getX();
			ybias = e.getScreenY() - primaryStage.getY();

		});
		primaryStage.setScene(root);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
	}
	
}
