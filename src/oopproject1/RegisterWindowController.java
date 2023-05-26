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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author maial
 */
public class RegisterWindowController implements Initializable {

    @FXML
    private AnchorPane anc2;
    @FXML
    private Label termsLabel;
    @FXML
    private Label tL1;
    @FXML
    private Label tL2;
    @FXML
    private Label tL3;
    @FXML
    private Label tL4;
    @FXML
    private Label tL5;
    @FXML
    private Label tL6;
    @FXML
    private Label tL7;
    @FXML
    private Label tL8;
    @FXML
    private Button next;
    @FXML
    private RadioButton termsRadioButton;
    @FXML
    private AnchorPane anc1;
    @FXML
    private RadioButton signIn;
    @FXML
    private ToggleGroup genderGroup;
    @FXML
    private RadioButton register;
    @FXML
    private Label emailLabel;
    @FXML
    private TextField emailTextBox;
    @FXML
    private Label passwordLabel;
    @FXML
    private PasswordField passwordTextBox;
    @FXML
    private Menu file;
    @FXML
    private MenuItem close;
    @FXML
    private Menu edit;
    @FXML
    private MenuItem changeBackground;
    @FXML
    private MenuItem returnBackground;
    @FXML
    private MenuItem changeFont;
    @FXML
    private MenuItem returnFont;
    @FXML
    private MenuItem clear;
    @FXML
    private Menu help;
    @FXML
    private MenuItem about;
    @FXML
    private Label title;
    @FXML
    private MenuBar menubar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        //terms and conditions radiobutton is not selected
        if(!(termsRadioButton.isSelected())){
            next.setDisable(true);
        }
        
    } 
    
    @FXML   
    private void termsRadioAction(ActionEvent event) {
        //terms and conditions radiobutton is selected
        if(termsRadioButton.isSelected()){
            next.setDisable(false);
        }
    }
    
    @FXML
    private void nextAction(ActionEvent event) throws Exception {        
        inputValidation();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PersonalInfoWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException e) {
            System.out.println("FXML Loading Error");
        }
        
    }
    
    private void inputValidation() throws Exception{
        if(!signIn.isSelected() && !register.isSelected()){
             JOptionPane.showMessageDialog(null, "Please register or sign in","Error", JOptionPane.ERROR_MESSAGE);
             throw new Exception();
         }
        
        if(!validateEmail()){
            
            JOptionPane.showMessageDialog(null, "invalid e-mail","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        if(!validatePassoword()){
            JOptionPane.showMessageDialog(null, "invalid: password must contain:\nAt least 8 chars\n" +
        "Contains at least one digit\n" +
        "Contains at least one lower alpha char and one upper alpha char\n" +
        "Contains at least one char within a set of special chars (@#%$^ etc.)\n" +
        "Does not contain space, tab, etc.","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        
             
    }
    
    
    private boolean validateEmail(){
        return emailTextBox.getText().matches("^(.+)@(.+)$"); 
        
    }
    
    private boolean validatePassoword(){
        /*At least 8 chars
        Contains at least one digit
        Contains at least one lower alpha char and one upper alpha char
        Contains at least one char within a set of special chars (@#%$^ etc.)
        Does not contain space, tab, etc.*/
        return passwordTextBox.getText().matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
    }

  
    
    @FXML
    private void closeAction(ActionEvent event) {
        System.exit(0); 
    }
    
    @FXML
        private void changeBackgroundAction(ActionEvent event) {
            anc1.setStyle("-fx-background-color: #E1D8C4");
            anc2.setStyle("-fx-background-color: #F4F0DB");
    }
        
    @FXML    
    private void returnBackgroundAction(ActionEvent event) {
        anc1.setStyle("-fx-background-color: #F4F0DB"); 
        anc2.setStyle("-fx-background-color: #E1D8C4");  
    }    
    
    
    @FXML
    private void clearAction(ActionEvent event) {
        emailTextBox.setText("");
        passwordTextBox.setText("");
        signIn.setSelected(false);
        register.setSelected(false);
        termsRadioButton.setSelected(false);
        
    }

    

    @FXML
    private void changeFontAction(ActionEvent event) {
        title.setFont(Font.font("Verdana", 36));
    }

    @FXML
    private void returnFontAction(ActionEvent event) {
        title.setFont(Font.font("Andalus", 36));
               
    } 
    

    

    @FXML
    private void aboutAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("aboutWindow.fxml"));
            Stage stage = (Stage) menubar.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException e) {
            System.out.println("FXML Loading Error");
        }
        
    }
    
}
