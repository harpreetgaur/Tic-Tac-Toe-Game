package edu.citytech.games.video;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

public class GamesController {

    @FXML
    private FlowPane fpPane;

    @FXML
    private Label lblTitle;
    
    @FXML
    private Label lblMessage;

    @FXML
    private Button btnReset;
 

    //Label ID's
    @FXML
    private Label lb1;

    @FXML
    private Label lb2;

    @FXML
    private Label lb3;
    
    @FXML
    private Label lb4;

    @FXML
    private Label lb5;

    @FXML
    private Label lb6;
    
    @FXML
    private Label lb7;

    @FXML
    private Label lb8;

    @FXML
    private Label lb9;
    
    @FXML
    private Label lbauthor;

    
    private boolean isX = true;

    
    
    @FXML
    void onMouseClicked(MouseEvent event) {

    	Label l = (Label)event.getSource();
    	lblMessage.setText(" ");
    	
    	if(!l.getText().equals("?")) {
    	String message="Illegal move";
    	lblMessage.setText(message);
    	return;
    }
    	
    	String whichMove = (isX = !isX) ? "X" : "O";
    	l.setText(whichMove);
    	

    	if(lb1.getText().equals("X")&& lb2.getText().equals("X") && lb3.getText().equals("X")) {
    	
    	String message1 = "The Winner is: "+ whichMove;
    	lblMessage.setText(message1);
    	lb1.setStyle("-fx-text-fill: red;");
    	lb2.setStyle("-fx-text-fill: red;");
    	lb3.setStyle("-fx-text-fill: red;");
    	return;
	
    	}
    
    if(lb4.getText().equals("X")&& lb5.getText().equals("X") && lb6.getText().equals("X")) {
    	
    	String message1 = "The Winner is: "+whichMove;
    	lblMessage.setText(message1);
    	lb4.setStyle("-fx-text-fill: red;");
    	lb5.setStyle("-fx-text-fill: red;");
    	lb6.setStyle("-fx-text-fill: red;");
    	return;
	
    }
    
    
    if(lb7.getText().equals("X")&& lb8.getText().equals("X") && lb9.getText().equals("X")) {
    
    String message1 = "The Winner is: "+whichMove;
    lblMessage.setText(message1);
    lb9.setStyle("-fx-text-fill: red;");
    lb8.setStyle("-fx-text-fill: red;");
    lb7.setStyle("-fx-text-fill: red;");
    return;
    }	
    
    
    
    if(lb1.getText().equals("X")&& lb5.getText().equals("X") && lb9.getText().equals("X")) {
    
    String message1 = "The Winner is: "+whichMove;
    lblMessage.setText(message1);
    lb1.setStyle("-fx-text-fill: red;");
    lb5.setStyle("-fx-text-fill: red;");
    lb9.setStyle("-fx-text-fill: red;");
    return;
    }
    
    if(lb3.getText().equals("X")&& lb5.getText().equals("X") && lb7.getText().equals("X")) {
    
    String message1 = "The Winner is: "+whichMove;
    lblMessage.setText(message1);
    lb3.setStyle("-fx-text-fill: red;");
    lb5.setStyle("-fx-text-fill: red;");
    lb7.setStyle("-fx-text-fill: red;");
    return;
    }
    
    if(lb1.getText().equals("X")&& lb4.getText().equals("X") && lb7.getText().equals("X")) {
    
    String message1 = "The Winner is: "+whichMove;
    lblMessage.setText(message1);
    lb1.setStyle("-fx-text-fill: red;");
    lb4.setStyle("-fx-text-fill: red;");
    lb7.setStyle("-fx-text-fill: red;");
    return;
    
    }
    
    if(lb2.getText().equals("X")&& lb5.getText().equals("X") && lb8.getText().equals("X")) {
    
    String message1 = "The Winner is: "+whichMove;
    lblMessage.setText(message1);
    lb2.setStyle("-fx-text-fill: red;");
    lb5.setStyle("-fx-text-fill: red;");
    lb8.setStyle("-fx-text-fill: red;");
    return;
    
    }
    
    if(lb3.getText().equals("X")&& lb6.getText().equals("X") && lb9.getText().equals("X")) {
    
    String message1 = "The Winner is: "+whichMove;
    lblMessage.setText(message1);
    lb3.setStyle("-fx-text-fill: red;");
    lb6.setStyle("-fx-text-fill: red;");
    lb9.setStyle("-fx-text-fill: red;");
    return;
    
    
    
    }
	
    }
    

    @FXML
    void onReset(ActionEvent event) {

    	ObservableList<Node> items = this.fpPane.getChildren();
    
    	items.forEach(e -> {
    		Label l = (Label)e;
    		l.setText("?");
    	});
    
    
    }
}



//
//Label label = (Label)event.getSource();
//lblMessage.setText(" ");
//
//if(!label.getText().equals("?")) {
//	String message="Illegal move";
//	lblMessage.setText(message);
//	return;
//}
//
//
//
//String whichMove= isX ? "X" : "O";
//
//label.setText(whichMove);
//isX = !isX;
//
//
//
//if(lb1.getText().equals("X")&& lb2.getText().equals("X") && lb3.getText().equals("X")) {
//	
//	String message1 = "The Winner is: "+whichMove;
//	lblMessage.setText(message1);
//	lb1.setStyle("-fx-text-fill: red;");
//	lb2.setStyle("-fx-text-fill: red;");
//	lb3.setStyle("-fx-text-fill: red;");
//	return;
//	
//}
//
//if(lb4.getText().equals("X")&& lb5.getText().equals("X") && lb6.getText().equals("X")) {
//	
//	String message1 = "The Winner is: "+whichMove;
//	lblMessage.setText(message1);
//	lb4.setStyle("-fx-text-fill: red;");
//	lb5.setStyle("-fx-text-fill: red;");
//	lb6.setStyle("-fx-text-fill: red;");
//	return;
//	
//}
//
//
//if(lb7.getText().equals("X")&& lb8.getText().equals("X") && lb9.getText().equals("X")) {
//
//String message1 = "The Winner is: "+whichMove;
//lblMessage.setText(message1);
//lb9.setStyle("-fx-text-fill: red;");
//lb8.setStyle("-fx-text-fill: red;");
//lb7.setStyle("-fx-text-fill: red;");
//return;
//}	
//
//
//
//if(lb1.getText().equals("X")&& lb5.getText().equals("X") && lb9.getText().equals("X")) {
//
//String message1 = "The Winner is: "+whichMove;
//lblMessage.setText(message1);
//lb1.setStyle("-fx-text-fill: red;");
//lb5.setStyle("-fx-text-fill: red;");
//lb9.setStyle("-fx-text-fill: red;");
//return;
//}
//
//if(lb3.getText().equals("X")&& lb5.getText().equals("X") && lb7.getText().equals("X")) {
//
//String message1 = "The Winner is: "+whichMove;
//lblMessage.setText(message1);
//lb3.setStyle("-fx-text-fill: red;");
//lb5.setStyle("-fx-text-fill: red;");
//lb7.setStyle("-fx-text-fill: red;");
//return;
//}
//
//if(lb1.getText().equals("X")&& lb4.getText().equals("X") && lb7.getText().equals("X")) {
//
//String message1 = "The Winner is: "+whichMove;
//lblMessage.setText(message1);
//lb1.setStyle("-fx-text-fill: red;");
//lb4.setStyle("-fx-text-fill: red;");
//lb7.setStyle("-fx-text-fill: red;");
//return;
//
//}
//
//if(lb2.getText().equals("X")&& lb5.getText().equals("X") && lb8.getText().equals("X")) {
//
//String message1 = "The Winner is: "+whichMove;
//lblMessage.setText(message1);
//lb2.setStyle("-fx-text-fill: red;");
//lb5.setStyle("-fx-text-fill: red;");
//lb8.setStyle("-fx-text-fill: red;");
//return;
//
//}
//
//if(lb3.getText().equals("X")&& lb6.getText().equals("X") && lb9.getText().equals("X")) {
//
//String message1 = "The Winner is: "+whichMove;
//lblMessage.setText(message1);
//lb3.setStyle("-fx-text-fill: red;");
//lb6.setStyle("-fx-text-fill: red;");
//lb9.setStyle("-fx-text-fill: red;");
//return;
//
//
//
//}

