
import javafx.fxml.FXML;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.input.*;

import javafx.scene.text.*;
public class Controller {
    private Binaerbaum baum;

    @FXML
    Pane ausgabePane;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNummer;

    @FXML
    private TextField txtSuche;

    @FXML
    TextArea ausgabeText;  

    public Controller()
    {
        baum = new Binaerbaum();    
    }

    @FXML
    public void einfuegen(Event event) {
        personEinfuegen();
    }

    @FXML
    public void handleTxtEinfuegen(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER)
        {
            personEinfuegen();
        }

    }

    public void personEinfuegen()
    {
        String name = txtName.getText();
        String nummer = txtNummer.getText();
        Person p = new Person(name,nummer);
        baum.einfuegen(p);
        baum.zeichnen(ausgabePane);
        txtName.setText("");
        txtNummer.setText("");
        txtName.requestFocus();
    }

    @FXML
    public void infosGeben()
    {
        ausgabeText.setText("Hier kann man Informationen über den Baum ausgeben!");
    }

    @FXML
    public void suchen()
    {
        String suchname = txtSuche.getText();
        Person p = new Person(suchname,"");
        Person treffer = baum.suche(p);
        if (treffer != null)
        {
            ausgabeText.setText(treffer.datenwertGeben());
        }
        else
        {
            ausgabeText.setText("Diese Person wurde leider nicht gefunden!");
        }
    }
}