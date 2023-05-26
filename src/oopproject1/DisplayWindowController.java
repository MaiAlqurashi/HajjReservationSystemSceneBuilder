/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maial
 */
public class DisplayWindowController implements Initializable {

    @FXML
    private Label title;
    @FXML
    private TitledPane title4;
    @FXML
    private Label campLabel;
    @FXML
    private Label featuresLabel;
    @FXML
    private Label userCamp;
    @FXML
    private Label userFeatures1;
    @FXML
    private Label feature2;
    @FXML
    private Label feature3;
    @FXML
    private Label feature4;
    @FXML
    private Label addLabel;
    @FXML
    private TitledPane title5;
    @FXML
    private Label amountLabel;
    @FXML
    private Label userAmount;
    @FXML
    private TitledPane title6;
    @FXML
    private Label pilgrimName;
    @FXML
    private Info2 data2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proceedAction(ActionEvent event) throws IOException, ClassNotFoundException {
                       
        writeToFile1(data2);
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PaymentWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
        
    }

    @FXML
    private void cancelAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CampaignWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }                
    }
    
    public void setUserData2(String camp, String amount, String feat1, String feat2, String feat3, String feat4, String aLabel, int pnum){
        
        
        data2 = new Info2(camp, amount, feat1, feat2, feat3, feat4, aLabel, pnum);
        userCamp.setText(camp);
        userAmount.setText(amount);
        userFeatures1.setText(feat1);
        feature2.setText(feat2);
        feature3.setText(feat3);
        feature4.setText(feat4);
        addLabel.setText(aLabel);
        pilgrimName.setText(String.valueOf(pnum));
        
        
        
        
    }
    
    private void writeToFile1(Info2 d){

        try{
            FileOutputStream outStream = new FileOutputStream("data2.txt");
            ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
            objectOutputFile.writeObject(d);
            objectOutputFile.close();
            
        }
        catch(FileNotFoundException ex){
            System.out.println("Error writing to file");
        }
        catch(IOException ex){
            System.out.println("Error writing to file");
        }
    }
   
    
}
