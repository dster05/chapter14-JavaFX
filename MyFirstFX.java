

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class MyFirstFX extends Application {
	Pane parent = new Pane();
	Pane centerParent = new StackPane();
	Pane flowParent = new FlowPane();
	GridPane gridPane = new GridPane();
	BorderPane borderPane = new BorderPane();
	HBox hbox = new HBox();
	VBox vbox = new VBox();
	@Override
	public void start(Stage primaryStage) throws Exception{
	Circle[] circle = new Circle[2];
		for(int i =0; i<circle.length; i++) {
			circle[i]= new Circle();
			circle[i].setRadius(100);
			circle[i].setFill(Color.BEIGE);
			circle[i].setStroke(Color.BLUE);
			flowParent.getChildren().add(circle[i]);
		}
		
		Circle[] circle1 = new Circle[3];
		for(int i =0; i<circle1.length; i++) {
			circle1[i]= new Circle();
			circle1[i].setRadius(100);
			circle1[i].setFill(Color.BEIGE);
			circle1[i].setStroke(Color.BLUE);
			flowParent.getChildren().add(circle1[i]);
		}
		
		
		
		
		
		Circle c = new Circle();
		c.setCenterX(150);
		c.setCenterY(150);
		c.setRadius(100);
		c.setFill(Color.BEIGE);
		c.setStroke(Color.BLUE);
		parent.getChildren().add(c);
		
		Button button = new Button("OK");
		gridPane.add(circle1[0], 0, 0);
		gridPane.add(circle1[1], 1, 1);
		gridPane.add(circle1[2], 2, 2);
		gridPane.add(button, 0, 0);
		
		centerParent.getChildren().addAll(circle[3]);
		flowParent.getChildren().addAll(circle[4], circle[5]);
		vbox.getChildren().addAll(circle[6], circle[7], circle[8]);
		
		borderPane.setTop(parent);
		borderPane.setLeft(flowParent);
		borderPane.setCenter(gridPane);
		borderPane.setAlignment(parent, Pos.CENTER);
		borderPane.setBottom(centerParent);
		borderPane.setRight(vbox);

		Scene scene = new Scene(gridPane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("My First JavaFx");
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);

	}

}
