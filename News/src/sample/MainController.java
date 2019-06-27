package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import sample.models.Article;

import java.util.List;

public class MainController  {

    private List<Article> articles;
    private GraphicsContext context;

    @FXML
    ListView newsList;

    @FXML public void handleMouseClick(MouseEvent args) {
        System.out.println("clicked on " + newsList.getSelectionModel().getSelectedItem());
    }

}