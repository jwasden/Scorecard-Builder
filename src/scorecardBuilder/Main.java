package scorecardBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Load the font
        Font.loadFont(getClass().getResource("/fonts/Lato-Regular.ttf").toExternalForm(), 12);
        Font.loadFont(getClass().getResource("/fonts/Teko-Regular.ttf").toExternalForm(), 12);

        Parent root = FXMLLoader.load(getClass().getResource("BuilderView.fxml"));
        primaryStage.getIcons().add(new Image("/icons/icon.png"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Scorecard Builder");

        primaryStage.setScene(new Scene(root, 1090, 750));
        primaryStage.show();


    }


}

//TODO: use the created data stores t opolulate the columns.