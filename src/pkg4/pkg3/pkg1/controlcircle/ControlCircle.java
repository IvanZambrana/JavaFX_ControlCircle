
package pkg4.pkg3.pkg1.controlcircle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Iván Zambrana Naranjo
 */
public class ControlCircle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       //Setting the tittle of the stage
       primaryStage.setTitle("ControlCircle");
       
       //Creating buttons
       Button btnEnlarge = new Button("Enlarge");
       Button btnShrink = new Button("Shrink");
       btnEnlarge.setAlignment(Pos.CENTER);
       btnShrink.setAlignment(Pos.CENTER);
       
       //Creating a circle
       Circle circle = new Circle();
       circle.setCenterX(300.0); 
       circle.setCenterY(135.0); 
       circle.setRadius(100.0);
       circle.setFill(Color.TRANSPARENT);
       circle.setStroke(Color.web("#0A0A0A"));
       
       //Creating an HBox
       HBox hbox = new HBox(2);
       hbox.getChildren().add(btnEnlarge);
       hbox.getChildren().add(btnShrink);
       HBox.setMargin(btnEnlarge, new Insets(0, 100, 10, 150));
       HBox.setMargin(btnShrink, new Insets(0, 100, 10, 100));
       
              
       //Creating a Borderpane
       BorderPane borderPane = new BorderPane();
       borderPane.setBottom(hbox);
       borderPane.setCenter(circle);
       
       //Button Event
        btnEnlarge.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent e) {
               circle.setRadius(circle.getRadius() + 10);
           }
       });
        
        btnShrink.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent e) {
               circle.setRadius(circle.getRadius() - 10);
           }
       });
       
       //Creating a scene object
       Scene scene = new Scene(borderPane, 600, 350);
       
       
       
       
       //Adding scene to the stage
       primaryStage.setScene(scene);
       
       //Show stage
       primaryStage.show();
       
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
