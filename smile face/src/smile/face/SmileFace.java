
package smile.face;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;


public class SmileFace extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane roo = new Pane();
        HBox h=new HBox(150); 
        h.setPadding(new Insets(170, 0, 0, 120));
        HBox h1=new HBox(220);
        h1.setPadding(new Insets(200, 0, 0, 155));
        
       
        Circle c  =new Circle(300,300,250);
        c.setFill(Color.GOLD);
        c.setStroke(Color.BLACK);
     
        Circle c1 =new Circle(50);
        c1.setFill(Color.AQUA);
        c1.setStroke(Color.BLACK);
      
      Circle c2 =new Circle(50);
        c2.setFill(Color.AQUA);
        c2.setStroke(Color.BLACK);  
        
        Circle c3 =new Circle(15);
        c3.setFill(Color.BLACK);

        Circle c4 =new Circle(15);
        c4.setFill(Color.BLACK);

        Rectangle r1=new Rectangle(140,144,55,15);
        r1.setFill(Color.BLACK);

        Rectangle r2=new Rectangle(400,144,55,15);
        r2.setFill(Color.BLACK);

        // مثلث  -Polygon عن طريق المضلع 
       Polygon p=new Polygon();
        p.getPoints().addAll(
       250.0,300.0,
       290.0 , 250.0 ,
       330.0 , 300.0
        );
        
  roo.getStylesheets().add(getClass().getResource("k.css").toExternalForm());

       Ellipse e = new Ellipse(300,400,110,25);
        e.setFill(Color.RED);
        e.setStroke(Color.BLACK);

        Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.DEEPPINK)};  
         LinearGradient linear = new LinearGradient(0, 1, 0, 0, true, CycleMethod.NO_CYCLE, stops);  
          e.setFill(linear);
        
        h.getChildren().addAll(c1,c2);
        h1.getChildren().addAll(c3,c4);

        roo.getChildren().addAll(c,h,h1,e,r1,r2,p);

        Scene scene = new Scene(roo, 600, 600);
        
        primaryStage.setTitle("samile face :) ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
