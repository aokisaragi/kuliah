/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asrofiapp1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 *
 * @author Aliensky asrofi
 */
public class Asrofiapp1 extends Application {
    
@Override            
  
public void start(Stage stage) {

Text t1 = new Text("Nama     :");
Text t2 = new Text("Telepon  :");
Text t3 = new Text("Alamat   :");
TextField tField1 = new TextField();
TextField tField2 = new TextField();
TextArea tArea1 = new TextArea();

Button btn1 = new Button("Kirim");
Button btn2 = new Button("Hapus");
        
GridPane gridPane = new GridPane();
gridPane.setMinSize(400, 200);
gridPane.setPadding(new Insets(50,50,50,50));
gridPane.setVgap(7);
gridPane.setHgap(9);
gridPane.setAlignment(Pos.CENTER);

gridPane.add(t1, 0, 0);
gridPane.add(tField1, 1, 0);
gridPane.add(t2, 0, 1);
gridPane.add(tField2, 1, 1);
gridPane.add(t3, 0, 2);
gridPane.add(tArea1, 1, 2);
gridPane.add(btn1, 0, 3);
gridPane.add(btn2, 1, 3);

Scene scene1 = new Scene(gridPane);

stage.setTitle("Lomba Balap lari");
    stage.setScene(scene1);
        stage.show();
}
public static void main(String args[]){
launch(args);
    }
}