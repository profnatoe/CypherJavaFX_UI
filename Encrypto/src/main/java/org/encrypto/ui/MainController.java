package org.encrypto.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }
    @FXML
    private Label computation_output;
    @FXML
    private Button caesar;

    @FXML
    private Button vigenere;

    @FXML
    private Button otpcypher;

    @FXML
    private Button hillCypher;

    @FXML
    private TextField text_input;
    @FXML
    private CheckBox encryption_checkbox;

    static String option = null;

    @FXML
    private CheckBox decryption_checkbox;


    @FXML
    void caesar_btn(ActionEvent event) {

        option = CypherOption();

        ///Make A call to your caesar Algorithm class as follows

        //Caesar algo = new Caesar(option, text_input)

        //======The Following must be in your Caesar Class, the one you sent me

        //create a method that takes the option and text_input and compute a desired computation (encryption / decryption)
        //Your method for example ShowOutput() should return a string with the output
        //method signature is as follows
        // public String ShowOutput(String option, String text_input)
        //=========The class ends here============

        //Call the method here like this

        //computation_output = algo.ShowOutput();
    }

    @FXML
    void hill_btn(ActionEvent event) {
        option = CypherOption();

        ///Make A call to your hill Algorithm class as follows

        //Hill algo = new Hill(option, text_input)

        //======The Following must be in your Hill Class, the one you sent me

        //create a method that takes the option and text_input and compute a desired computation (encryption / decryption)
        //Your method for example ShowOutput() should return a string with the output
        //method signature is as follows
        // public String ShowOutput(String option, String text_input)
        //=========The class ends here============

        //Call the method here like this

        //computation_output = algo.ShowOutput();
    }

    @FXML
    void otp_btn(ActionEvent event) {
        //do like the other methods
    }

    @FXML
    void vigenere_btn(ActionEvent event) {
        //do like the other methods
    }

    public String CypherOption(){
        if(encryption_checkbox.isSelected()){
           return "encryption";
        }
        else if(decryption_checkbox.isSelected())
        {
            return "decryption";
        }
        return null;
    }
}
