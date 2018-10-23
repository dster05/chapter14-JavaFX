/*
 * Daniel J. Gallegos
 * 10/20/2018
 * Used code from on line
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
public class ShowArc extends Application{
	
	public void start(Stage primaryStage)throws Exception{
		//create a pane
		Pane  pane= new Pane();
		
		Arc arc1 = new Arc(150,100,80,80,30,35);//create new arc
		arc1.setFill(Color.RED);//Set fill Color
		arc1.setType(ArcType.ROUND);//set arc type
		pane.getChildren().add(new Text(210,40,"arc1: round"));
		pane.getChildren().add(arc1);
		
		Arc arc2 = new Arc(150,100,80,80,30+90,35);//create new arc
		arc2.setFill(Color.RED);//Set fill Color
		arc2.setType(ArcType.ROUND);//set arc type
		pane.getChildren().add(new Text(20,40,"arc2: open"));
		pane.getChildren().add(arc2);
		
		Arc arc3 = new Arc(150,100,80,80,30+180,35);//create new arc
		arc3.setFill(Color.RED);//Set fill Color
		arc3.setType(ArcType.ROUND);//set arc type
		pane.getChildren().add(new Text(20,170,"arc3: chrod"));
		pane.getChildren().add(arc3);
		
		Arc arc4 = new Arc(150,100,80,80,30+270,35);//create new arc
		arc4.setFill(Color.RED);//Set fill Color
		arc4.setType(ArcType.ROUND);//set arc type
		arc4.setStroke(Color.BLACK);
		pane.getChildren().add(new Text(210,170, "arc4: chord"));
		pane.getChildren().add(arc4);
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300,200);
		primaryStage.setTitle("ShowArc");//Set the stage title
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
	}
	public static void main(String[] args) {
		ShowArc.launch();
	}

}
