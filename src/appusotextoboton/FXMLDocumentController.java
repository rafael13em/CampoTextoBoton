/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import campotextoboton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author rafae
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private CampoTextoBoton txtbtnUP;
    @FXML
    private CampoTextoBoton txtbtnDOWN;
    @FXML
    private Label lbResult;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lbResult.setText("");
        
        txtbtnDOWN.addEventHandler(EventType.ROOT, new EventHandler<Event>() {
            @Override
            public void handle(Event eventHandler) {
                if (eventHandler.getEventType().getName().equalsIgnoreCase("Action")) {
                    lbResult.setText(txtbtnDOWN.getText() + " guardado");
                }
            }
        });
        
        txtbtnUP.addEventHandler(EventType.ROOT, new EventHandler<Event>() {
            @Override
            public void handle(Event eventHandler) {
                if (eventHandler.getEventType().getName().equalsIgnoreCase("Action")) {
                    lbResult.setText(txtbtnUP.getText() + " guardado");
                }
            }
        });
    } 
}
