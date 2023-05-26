/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author maial
 */
public class ConfirmationWindowController implements Initializable {

    @FXML
    private Label title;
    @FXML
    private Label pNLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private TextField phoneTF;
    @FXML
    private TextField emailTF;
    @FXML
    private Button confirmBooking;
    @FXML
    private Label label2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmAction(ActionEvent event) throws Exception {
        inputValidation();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FinalWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    
    private void inputValidation() throws Exception{
        
        if(!phoneNumber()){            
            JOptionPane.showMessageDialog(null, "invalid phone number, try again","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        if(!validateEmail()){            
            JOptionPane.showMessageDialog(null, "invalid e-mail, try again","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        
    }
    private boolean phoneNumber(){
        return phoneTF.getText().matches("(05)[0-9]{8}");
        
    }
    
    private boolean validateEmail(){
        return emailTF.getText().matches("^(.+)@(.+)$");
        
    }
    
}
