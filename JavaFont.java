 import javafx.application.Application;
 import javafx.scene.Scene;
 import javafx.scene.layout.*;
 import javafx.scene.paint.Color;
 import javafx.scene.shape.Circle;
 import javafx.scene.text.*;
 import javafx.scene.control.*;
 import javafx.stage.Stage;
public class JavaFont extends Application{
	
	@Override  //Override the start Method in the Application Class
	public void start(Stage primaryStage) {
		//create a pane to hold the circle
		Pane pane = new StackPane();
		GridPane gridPane = new GridPane();
		
		//create a label and set its properties
		Label label = new Label("JavaFX");
		label.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 20));
		pane.getChildren().add(label);
		
		//create a grid
		/*gridPane.setHgap(hgap);
		gridPane.setVgap(vgap);
		gridPane.setPrefSize(width, height);
		*/
		
		//Create a Scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Font");
		primaryStage.setScene(scene);
		primaryStage.show();//Display the stage
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	

}
