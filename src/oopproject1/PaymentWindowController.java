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
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author maial
 */
public class PaymentWindowController implements Initializable {

    @FXML
    private RadioButton visa;
    @FXML
    private RadioButton mastercard;
    @FXML
    private RadioButton mada;
    @FXML
    private RadioButton americanExpress;
    @FXML
    private RadioButton applepay;
    @FXML
    private TextField holdername;
    @FXML
    private TextField cardnumber;
    @FXML
    private TextField cvv;
    @FXML
    private DatePicker exDate;
    @FXML
    private Button next;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void nextAction(ActionEvent event) throws Exception {
        
        inputValidation();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ConfirmationWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    
    private void inputValidation() throws Exception{
        if(!visa.isSelected() && !mastercard.isSelected() && !mada.isSelected() && !americanExpress.isSelected() && !applepay.isSelected()){
             JOptionPane.showMessageDialog(null, "Please choose a payment method","Error", JOptionPane.ERROR_MESSAGE);
             throw new Exception();
         }
        
        if(!validateName()){
            JOptionPane.showMessageDialog(null, "Please enter a full name: \nMake "
                    + "sure to capitalize the first letter of"
                    + " your first and last name","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        
        if(!cardNumber()){
            
            JOptionPane.showMessageDialog(null, "invalid card number: \nit"
                    + " has to be 16 numbers","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        if(exDate.getValue() == null)
        {
            JOptionPane.showMessageDialog(null, "Please choose an expiration date","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        
        
        if(!cvvValidate()){
            
            JOptionPane.showMessageDialog(null, "invalid cvv: should be 3 digits","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        
    }
    
    private boolean validateName(){
        return holdername.getText().matches("^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$");
    }
    
    private boolean cardNumber(){
        return cardnumber.getText().matches("\\d{16}");
        
    }
    
    private boolean cvvValidate(){
        return cvv.getText().matches("\\d{3}");
    }
    
}
