package drawGraph;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.PixelWriter;

public class DrawGraphController implements Initializable
{
	@FXML private Canvas dst_canvas;
	@FXML private Button sure_btn, quit_btn;
	@FXML private Slider slider;
	
	private PixelWriter pw = null;
	private EventHandler<Event> newGraphHandler = new EventHandler<Event>()
	{
		@Override
		public void handle(Event event) 
		{
			System.out.println("Sure button clicked;");
		}
	}; 
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		quit_btn.setOnMouseClicked(e->{Platform.exit();});
		sure_btn.setOnMouseClicked(newGraphHandler);
		pw=dst_canvas.getGraphicsContext2D().getPixelWriter();//获取Canvas的按照像素点绘图函数
	}
	
	private void drawgraph(PixelWriter pw, int counts)
	{
		/* 输入pw与迭代次数，绘制图形 */
		
		
	}

}
