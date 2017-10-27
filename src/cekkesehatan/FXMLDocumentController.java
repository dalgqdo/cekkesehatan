/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author aldimakarim
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXTextField editnama;

    @FXML
    private JFXTextField editberat;

    @FXML
    private JFXTextField edittinggi;

    @FXML
    private RadioButton laki;

    @FXML
    private RadioButton cewe;

    @FXML
    private JFXButton editproses;

    @FXML
    private JFXButton editreset;

    @FXML
    private JFXTextArea edithasil;

    @FXML
    private JFXTextArea editsaran;

    @FXML
    void proses(ActionEvent event) {
        
    }

    @FXML
    void reset(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
