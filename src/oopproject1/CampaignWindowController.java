/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject1;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maial
 */
public class CampaignWindowController implements Initializable {

    @FXML
    private TitledPane title2;
    @FXML
    private Label l12;
    @FXML
    private RadioButton radio1;
    @FXML
    private ToggleGroup camp;
    @FXML
    private RadioButton radio2;
    @FXML
    private RadioButton radio3;
    @FXML
    private Label l11;
    @FXML
    private Slider slider;
    @FXML
    private TitledPane title3;
    @FXML
    private CheckBox combo1;
    @FXML
    private CheckBox combo2;
    @FXML
    private CheckBox combo3;
    @FXML
    private CheckBox combo4;
    @FXML
    private TextField textbox1;
    @FXML
    private ImageView transport;
    @FXML
    private ImageView wheel;
    @FXML
    private ImageView umbrella;
    @FXML
    private ImageView food;
    @FXML
    private Label title;
    @FXML
    private Button next;
    @FXML
    private TitledPane title1;
    @FXML
    private Label label1;
    @FXML
    private Label l2;
    @FXML
    private Label l5;
    @FXML
    private Label l6;
    @FXML
    private Label l3;
    @FXML
    private Label l4;
    @FXML
    private Label l7;
    @FXML
    private Label l8;
    @FXML
    private Label l9;
    @FXML
    private Label l10;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
        

    @FXML
    private void nextAction(ActionEvent event) {
        String campChoice = null;
        String amount = null;
        String feature1 = null, feature2 = null, feature3 = null, feature4 = null;
        String sRandom = null;
        try {
            ((Node)event.getSource()).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DisplayWindow.fxml"));
            Parent root = loader.load();
            
            DisplayWindowController controller2 = loader.getController();
            
            if(radio1.isSelected()){
                campChoice = "Campaign A";
                amount = "Ten Thousand SR.";
            }
            else if(radio2.isSelected()){
                campChoice = "Campaign B";
                amount = "Twenty Thousand SR";
            }
            else if(radio3.isSelected()){
                campChoice = "Campaign C";
                amount = "Fifty Thousand SR";
            }
            
            if(combo1.isSelected())
                feature1 = "Specific Meals";
            if(combo2.isSelected())
                feature2 = "Transportation";
            if(combo3.isSelected())
                feature3 = "Wheelchair";
            if(combo4.isSelected())
                feature4 = "Waterspray + Umbrella";
            
            Random rand = new Random();
            int n =  rand.nextInt(500000);

            
            controller2.setUserData2(campChoice,amount,feature1,feature2,feature3,feature4, textbox1.getText(), n);
            
            
            
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        
        } catch (IOException e) {
            e.printStackTrace();
        }

    
    }
    
}
