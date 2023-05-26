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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author maial
 */
public class VaccineWindowController implements Initializable {

    @FXML
    private Label title;
    @FXML
    private Label label1;
    @FXML
    private Label idlabel;
    @FXML
    private TextField userid;
    @FXML
    private Label namelabel;
    @FXML
    private Label genderlabel;
    @FXML
    private TextField username;
    @FXML
    private RadioButton male;
    @FXML
    private ToggleGroup gengroup;
    @FXML
    private RadioButton female;
    @FXML
    private Label conditionlabel;
    @FXML
    private Label preglabel;
    @FXML
    private RadioButton stable;
    @FXML
    private ToggleGroup medcondition;
    @FXML
    private RadioButton unstable;
    @FXML
    private RadioButton pregnant;
    @FXML
    private ToggleGroup preggroup;
    @FXML
    private RadioButton notpregnant;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private TextField othertext;
    @FXML
    private CheckBox diabetes;
    @FXML
    private CheckBox hemoplilia;
    @FXML
    private CheckBox asthma;
    @FXML
    private CheckBox lungcancer;
    @FXML
    private CheckBox bpressure;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void vaccAction(ActionEvent event) throws Exception {
        inputValidation();
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PersonalInfoWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
        
    }
    
    private void inputValidation() throws Exception{
        
        if(!validateID()){
            JOptionPane.showMessageDialog(null, "Please enter a valid ID","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        
        if(!validateName()){
            JOptionPane.showMessageDialog(null, "Please enter a name","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        
        if(!male.isSelected() && !female.isSelected()){
             JOptionPane.showMessageDialog(null, "Please choose your gender","Error", JOptionPane.ERROR_MESSAGE);
             throw new Exception();
         }
        if(!stable.isSelected() && !unstable.isSelected()){
             JOptionPane.showMessageDialog(null, "Please choose your medical condition","Error", JOptionPane.ERROR_MESSAGE);
             throw new Exception();
         }
        if(!pregnant.isSelected() && !notpregnant.isSelected()){
             JOptionPane.showMessageDialog(null, "Please choose if you're pregnant or not","Error", JOptionPane.ERROR_MESSAGE);
             throw new Exception();
         }
        
        
    }
    
   
    @FXML
    private void cancelAction(ActionEvent event) {
        System.exit(0);
    }
    private boolean validateID(){
        return userid.getText().matches("\\d{10}");
    }
    
    private boolean validateName(){
        return username.getText().matches("([a-zA-Z}]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
   
    
}
