package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;


public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Label label1 = new Label("Welcome to the First Scene");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - children are laid out in vertical colum
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        Button button2 = new Button("Go back to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 300, 300);

        window.setScene(scene1);
        window.setTitle("Title Here");
        window.show();

    }



    public static void main(String[] args) {
        //launch(args);

        BReventList eventList = new BReventList();

        BRevent KMWG = new BRevent("Knowledge Management Working Group",
                "1330",
                "BiWeekly",
                "Classroom 2",
                "Determine policy recommendations, conduct KM assessment, and monitor implementation of KM policy.",
                "BDE XO",
                new ArrayList<String>(Arrays.asList("KMO", "KMRs", "Brigade S6")),
                new ArrayList<String>(Arrays.asList("KMSOP", "Running Estimates", "KM Assessment", "Commander's Guidance", "S6 Assessment")),
                new ArrayList<String>(Arrays.asList("KMSOP", "KM Implementation Plan", "Battle Rhythm/Seven Minute Drill")),
                new ArrayList<String>(Arrays.asList("Agenda", "Outstanding Issues", "Assessment", "SOP Updates", "Final Comments"))
        );

        BRevent RWG = new BRevent("Roof Working Group",
                "1030",
                "Daily",
                "On the Roof2",
                "Determine and recommend policy pertaining to roof  design, construction, inspection, and maintenance",
                "BDE Roofmeister",
                new ArrayList<String>(Arrays.asList("S3", "S4", "Brigade Engineer", "HHC Commander", "Roof minions by invite")),
                new ArrayList<String>(Arrays.asList("Roofing SOP", "Running Estimates", "Roofing Assessment", "Commander's Guidance", "Engineer Assessment")),
                new ArrayList<String>(Arrays.asList("Roofing SOP", "Roof Maintenance Plan", "Color swatches for remodelling")),
                new ArrayList<String>(Arrays.asList("Agenda", "Outstanding Issues", "Assessment", "SOP Updates", "Final Comments"))
        );


        eventList.add(KMWG);
        eventList.add(RWG);

        ArrayList<String> el = eventList.getEvents();
        for(String s : el){
            System.out.println(s);
        }




        }


    }

