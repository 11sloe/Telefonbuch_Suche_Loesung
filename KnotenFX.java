import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.paint.Color;
/**
 *   Klasse zur Darstellung einer Person im Baum
 */
public class KnotenFX extends StackPane
{
    private Rectangle rect;
    private Text text;

    public KnotenFX(String text_, int breite,int hoehe)
    {
        rect = new Rectangle();
        rect.setWidth(breite);
        rect.setHeight(hoehe);
        rect.setArcWidth(10);
        rect.setArcHeight(10);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.DARKGRAY);
        text = new Text(text_);
        getChildren().addAll(rect,text);

    }

}
