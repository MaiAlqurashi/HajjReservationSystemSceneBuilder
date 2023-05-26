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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author maial
 */
public class PersonalInfoWindowController implements Initializable {

    @FXML
    private AnchorPane anc;
    @FXML
    private TitledPane CLSPane;
    @FXML
    private RadioButton resident;
    @FXML
    private ToggleGroup rOrVgroup;
    @FXML
    private RadioButton visitor;
    @FXML
    private ImageView rOrVPic;
    @FXML
    private TitledPane PIPane;
    @FXML
    private Label nameLabel;
    @FXML
    private TextField nameTextField;
    @FXML
    private Label iDLabel;
    @FXML
    private TextField iDTextField;
    @FXML
    private Label countryLabel;
    @FXML
    private ComboBox<String> countryBox;
    @FXML
    private Label welcomeLabel;
    @FXML
    private Button next;
    @FXML
    private Tooltip tooltip;
    @FXML
    private Label label2;
    @FXML
    private TitledPane VSPane;
    @FXML
    private RadioButton vaccinated;
    @FXML
    private ToggleGroup vaccinegroup;
    @FXML
    private RadioButton notVaccinated;
    @FXML
    private ImageView vaccinePic;
    @FXML
    private MenuBar menubar;
    @FXML
    private Menu file;
    @FXML
    private MenuItem close;
    @FXML
    private Menu edit;
    @FXML
    private MenuItem backg;
    @FXML
    private MenuItem retBackground;
    @FXML
    private MenuItem font;
    @FXML
    private MenuItem returnFont;
    @FXML
    private MenuItem clear;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //countries combobox
        countryBox.getItems().addAll("Afghanistan","Albania","Algeria","American Samoa","Andorra",
	"Angola","Anguilla","Antarctica","Antigua and Barbuda","Argentina","Armenia","Aruba","Australia","Austria",
	"Azerbaijan","Bahamas (the)","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin",
	"Bermuda","Bhutan","Bolivia (Plurinational State of)","Bonaire, Sint Eustatius and Saba","Bosnia and Herzegovina","Botswana",
        "Bouvet Island","Brazil","British Indian Ocean Territory (the)","Brunei Darussalam","Bulgaria","Burkina Faso","Burundi",
	"Cabo Verde","Cambodia","Cameroon","Canada","Cayman Islands (the)","Central African Republic (the)","Chad","Chile","China",
	"Christmas Island","Cocos (Keeling) Islands (the)","Colombia","Comoros (the)","Congo (the Democratic Republic of the)",
	"Congo (the)","Cook Islands (the)","Costa Rica","Croatia","Cuba","Curaçao","Cyprus","Czechia","Côte d'Ivoire","Denmark",
	"Djibouti","Dominica","Dominican Republic (the)","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia",
	"Eswatini","Ethiopia","Falkland Islands (the) [Malvinas]","Faroe Islands (the)","Fiji","Finland","France","French Guiana",
	"French Polynesia","French Southern Territories (the)","Gabon","Gambia (the)","Georgia","Germany","Ghana","Gibraltar",
	"Greece","Greenland","Grenada","Guadeloupe","Guam","Guatemala","Guernsey","Guinea","Guinea-Bissau","Guyana","Haiti",
	"Heard Island and McDonald Islands","Holy See (the)","Honduras","Hong Kong","Hungary","Iceland","India","Indonesia",
        "Iran (Islamic Republic of)","Iraq","Ireland","Isle of Man","Italy","Jamaica","Japan","Jersey","Jordan","Kazakhstan",
	"Kenya","Kiribati","Korea (the Democratic People's Republic of)","Korea (the Republic of)","Kuwait","Kyrgyzstan",
	"Lao People's Democratic Republic (the)","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania",
	"Luxembourg","Macao","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands (the)",
        "Martinique","Mauritania","Mauritius","Mayotte","Mexico","Micronesia (Federated States of)","Moldova (the Republic of)",
	"Monaco","Mongolia","Montenegro","Montserrat","Morocco","Mozambique","Myanmar","Namibia","Nauru","Nepal","Netherlands (the)",
	"New Caledonia","New Zealand","Nicaragua","Niger (the)","Nigeria","Niue","Norfolk Island","Northern Mariana Islands (the)",
	"Norway","Oman","Pakistan","Palau","Palestine, State of","Panama","Papua New Guinea","Paraguay","Peru","Philippines (the)","Pitcairn",
	"Poland","Portugal","Puerto Rico","Qatar","Republic of North Macedonia","Romania","Russian Federation (the)","Rwanda","Réunion",
        "Saint Barthélemy","Saint Helena, Ascension and Tristan da Cunha","Saint Kitts and Nevis","Saint Lucia","Saint Martin (French part)",
	"Saint Pierre and Miquelon","Saint Vincent and the Grenadines","Samoa","San Marino","Sao Tome and Principe","Saudi Arabia","Senegal",
	"Serbia","Seychelles","Sierra Leone","Singapore","Sint Maarten (Dutch part)","Slovakia","Slovenia","Solomon Islands","Somalia",
	"South Africa","South Georgia and the South Sandwich Islands","South Sudan","Spain","Sri Lanka","Sudan (the)","Suriname",
        "Svalbard and Jan Mayen","Sweden","Switzerland","Syrian Arab Republic","Taiwan","Tajikistan","Tanzania, United Republic of",
	"Thailand","Timor-Leste","Togo","Tokelau","Tonga","Trinidad and Tobago","Tunisia","Turkey","Turkmenistan","Turks and Caicos Islands (the)",
	"Tuvalu","Uganda","Ukraine","United Arab Emirates (the)","United Kingdom of Great Britain and Northern Ireland (the)",
	"United States Minor Outlying Islands (the)","United States of America (the)","Uruguay","Uzbekistan","Vanuatu",
        "Venezuela (Bolivarian Republic of)","Viet Nam","Virgin Islands (British)","Virgin Islands (U.S.)","Wallis and Futuna","Western Sahara",
	"Yemen","Zambia","Zimbabwe","Åland Islands");
    }    

    @FXML
    private void nextAction(ActionEvent event) throws Exception{
        
        next.setTooltip(tooltip);
        
        String status;
        String vacc;
        inputValidation();
        
        
        try {
            ((Node)event.getSource()).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("personalinfodisplay.fxml"));
            Parent root = loader.load();
            
            PersonalinfodisplayController controller = loader.getController();
            
            if(resident.isSelected())
                status = "Resident";
            else
                status = "Visitor";
            
            if(vaccinated.isSelected())
                vacc = "Vaccinated";
            else
                vacc = "Not vaccinated";
            
            controller.setUserData(nameTextField.getText(),iDTextField.getText(),countryBox.getValue(),status,vacc);
            
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void notVaccinated(ActionEvent event) throws Exception{
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VaccineWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    private void inputValidation() throws Exception{
        if(!validateName()){
            JOptionPane.showMessageDialog(null, "Please enter a full name: \nMake "
                    + "sure to capitalize the first letter of"
                    + " your first and last name","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        if(!validateID()){
            JOptionPane.showMessageDialog(null, "Please enter a valid ID","Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        if(!resident.isSelected() && !visitor.isSelected()){
             JOptionPane.showMessageDialog(null, "Please choose your living status","Error", JOptionPane.ERROR_MESSAGE);
             throw new Exception();
         }
        if(!vaccinated.isSelected() && !notVaccinated.isSelected()){
             JOptionPane.showMessageDialog(null, "Please choose your vaccine status","Error", JOptionPane.ERROR_MESSAGE);
             throw new Exception();
         }
        
    }
    
    private boolean validateName(){
        return nameTextField.getText().matches("^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$");
    }
   
    private boolean validateID(){
        return iDTextField.getText().matches("\\d{10}");
    }
    
    
    @FXML
    private void closeAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void backgroundAction(ActionEvent event) {
        anc.setStyle("-fx-background-color: #D2B48C");
    }

    @FXML
    private void retBackgroundColor(ActionEvent event) {
        anc.setStyle("-fx-background-color: #E1D8C4");
    }

    @FXML
    private void fontAction(ActionEvent event) {
        welcomeLabel.setFont(Font.font("Verdana", 36));
    }

    @FXML
    private void retFont(ActionEvent event) {
        welcomeLabel.setFont(Font.font("Andalus", 36));
    }

    @FXML
    private void clearAction(ActionEvent event) {
        nameTextField.setText("");
        iDTextField.setText("");
        resident.setSelected(false);
        visitor.setSelected(false);
        vaccinated.setSelected(false);
        notVaccinated.setSelected(false);
        countryBox.getSelectionModel().clearSelection();
    }

    
    
}
