 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject1;

import java.io.*;
import java.io.ObjectOutputStream;
import java.net.URL;
import static java.rmi.server.ObjID.read;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maial
 */
public class PersonalinfodisplayController implements Initializable {

    @FXML
    private Label title;
    @FXML
    private Button back;
    @FXML
    private Button proceed;
    @FXML
    private Label namelabel;
    @FXML
    private Label idlabel;
    @FXML
    private Label countrylabel;
    @FXML
    private Label livinglabel;
    @FXML
    private Label vaccinelabel;
    @FXML
    private Label username;
    @FXML
    private Label userid;
    @FXML
    private Label usercountry;
    @FXML
    private Label userliving;
    @FXML
    private Label uservaccine;
    @FXML
    private bookingInformation d; 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PersonalInfoWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    @FXML
    private void proceedAction(ActionEvent event) throws IOException, ClassNotFoundException{
        writeToFile(d);
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CampaignWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
       
    }
    
    public void setUserData(String name2, String id2, String country2, String status2, String vacc2){
        
        d = new bookingInformation(name2, id2, country2, status2, vacc2);
        
        username.setText(name2);
        userid.setText(id2);
        usercountry.setText(country2);
        userliving.setText(status2);
        uservaccine.setText(vacc2);
        
    }
    private void writeToFile(bookingInformation d){
      
        try{          
            //creating the stream object
            FileOutputStream outStream = new FileOutputStream("data1.txt");
            //to start writing
            ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
            //write "pen"
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
