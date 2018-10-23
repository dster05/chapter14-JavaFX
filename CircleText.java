import java.awt.Font;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class CircleText extends Application{
	
	public void start(Stage primaryStage) throws Exception{
		//create the pane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		
		Group textGroup = new Group();
		
		//Font class instance
		javafx.scene.text.Font font = javafx.scene.text.Font.font("Times New roman", FontWeight.BOLD, FontPosture.REGULAR, 35);
		
		//Welcom to Java String
		String welcome ="Welcom to Java";
		double rotation = 90;
		
		double radius = 100d;
		
		//Loop
		
		for(char c: welcome.toCharArray()) {
			//ignore white space,
			if(!Character.isWhitespace(c)) {
			Text text = new Text(Character.toString(c));
			text.setFont(font);
			
			Rotate rotationMatrix = new Rotate(rotation, 0, radius);
			text.getTransforms().add(rotationMatrix);
			
			textGroup.getChildren().add(text);
			
		}
		rotation+=22.5;
		
		}
		pane.getChildren().add(textGroup);
		//Create the scene for the application
		Scene scene = new Scene(pane, 500, 500);
		
		primaryStage.setTitle("Characters around Circle");
		primaryStage.setScene(scene);
		//display
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
