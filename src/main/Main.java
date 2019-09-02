package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private TextField ipAddress;
    private TextField password;
    private TextArea textArea;

    @Override
    public void start(Stage primaryStage){

        primaryStage.setTitle("Log-Jam");

        Button connectButton = new Button("Connect");
        ipAddress = new TextField("IP Address");
        ipAddress.setPrefWidth(120);
        password = new TextField("password");

        textArea = new TextArea();

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(15));
        pane.setVgap(10);
        pane.setHgap(10);

        pane.add(ipAddress, 0,0);
        pane.add(password,1,0);
        pane.add(connectButton, 2,0);

        pane.add(textArea, 0,1,3,2);
        textArea.prefHeightProperty().bind(pane.heightProperty());
        textArea.prefWidthProperty().bind(pane.widthProperty());

        primaryStage.setScene(new Scene(pane, 420, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
