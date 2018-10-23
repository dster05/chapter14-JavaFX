/*
 * Daniel J. Gallegos
 * 10/19/2018
 * 2013
 */
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class GridDisplayZeroOrOne extends Application{

		@Override
		public void start(Stage primaryStage) throws Exception {
			// TODO Auto-generated method stub
			//create a Gridpane Object
			GridPane gridPane = new GridPane();
			int width = 4;
			int height = 4;
			double vgap = 0.4;//sets the vertical gap
			double hgap= 0.4;//sets the horizontal gap
			gridPane.setHgap(hgap);
			gridPane.setVgap(vgap);
			gridPane.setPrefSize(width, height);
			
			for(int i = 1; i <= 8; i++) {
				for(int j = 1; j <= 8; j++) {
					Rectangle rectangle = new Rectangle(100, 100);
					rectangle.setStroke(Paint.valueOf("yellow"));
					Label label = new Label("0");
					label.setStyle("-fx-font-size: 20");
					
					if((i+j) %2 == 0) {
					rectangle.setFill(Paint.valueOf("gold"));//sorry I used laker colors
					
					}else {
					rectangle.setFill(Paint.valueOf("purple"));//fills the color purple
					}gridPane.add(rectangle, i, j);
					 gridPane.add(label, i, j);//adds the label contents i couldnt figure out how
					 //to add the 1 to every other color
				}
				}
			
			//Creates a Scene and place it in the stage
			Scene scene = new Scene(gridPane);
			primaryStage.setTitle("GridPane Example");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
			
			
		}
		
		public static void main(String[] args) {
			Application.launch(args);
		}
		
		
		

	}


