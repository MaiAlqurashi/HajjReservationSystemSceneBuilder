/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author maial
 */
public class FinalWindowController implements Initializable {

    @FXML
    private Label title;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Button close;
    @FXML
    private VBox vboxPI;
    @FXML
    private Label name;
    @FXML
    private Label id;
    @FXML
    private Label country;
    @FXML
    private Label status;
    @FXML
    private Label vaccine;
    @FXML
    private VBox vBoxCi;
    @FXML
    private Label campChoice;
    @FXML
    private Label amount;
    @FXML
    private Label feature1;
    @FXML
    private Label feature2;
    @FXML
    private Label feature3;
    @FXML
    private Label feature4;
    @FXML
    private Label addFeature;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            readFromFile1();
            readFromFile2();
        } catch (IOException ex) {
            Logger.getLogger(FinalWindowController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FinalWindowController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }    

    
    @FXML
    private void closeAction(ActionEvent event) {
        System.exit(0);
    }
    
    private void readFromFile1() throws IOException, ClassNotFoundException{
        try{
            //two steps in 1
            //its more like what file we're reading from?
            //deserializing object
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("data1.txt"));
            bookingInformation in = (bookingInformation) is.readObject();
            //print the "reading" to display to the user
            name.setText(in.getName()); 
            id.setText(in.getiD());
            country.setText(in.getCountry());
            status.setText(in.getStat());
            vaccine.setText(in.getVaccine());
            is.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Error writing to file");
        }
        catch(IOException ex){
            System.out.println("Error writing to file");
        }
       
    }     
        
    private void readFromFile2() throws IOException, ClassNotFoundException{
        
        
        try{       
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("data2.txt"));
            Info2 in = (Info2) is.readObject();            
            campChoice.setText(in.getCampChoice());
            
            feature1.setText(in.getFeature1());
            feature2.setText(in.getFeature2());
            feature3.setText(in.getFeature3());
            feature4.setText(in.getFeature4());            
            addFeature.setText(in.getAddLabel());    
            amount.setText(in.getAmount());
            is.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Error writing to file");
        }
        catch(IOException ex){
            System.out.println("Error writing to file");
        }
    
    }   
    
    }
