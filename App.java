package instruments;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * The main class for the application. It displays buttons representing different
 * musical instruments, and when clicked, shows the instrument's information.
 * 
 * @author angel
 */
public class App extends Application {

    // GUI component to display instrument information
    private TextArea outputArea;

    /**
     * The entry point for the application.
     * 
     * @param primaryStage the window for the application
     */
    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        // ArrayList to hold instrument instances
        ArrayList<Instruments> instruments = new ArrayList<>();

        // Adding five different instances using the factory method
        instruments.add(Factory.createInstrument("Violin"));
        instruments.add(Factory.createInstrument("Flute"));
        instruments.add(Factory.createInstrument("Drum"));
        instruments.add(Factory.createInstrument("Guitar"));
        instruments.add(Factory.createInstrument("Saxophone"));

        // GUI Setup: Create a vertical box layout for buttons and output area
        VBox vbox = new VBox(10); // VBox layout with 10px spacing

        // TextArea to display output, set to non-editable
        outputArea = new TextArea();
        outputArea.setEditable(false);
        outputArea.setWrapText(true);

        // Creating buttons dynamically for each instrument
        for (Instruments instrument : instruments) {
            Button button = new Button(instrument.name);
            // Set action for each button to display the instrument's info
            button.setOnAction(e -> displayInstrumentInfo(instrument));
            vbox.getChildren().add(button); // Add button to the VBox
        }

        vbox.getChildren().add(outputArea); // Add output area to VBox

        // Scene and Stage setup
        Scene scene = new Scene(vbox, 300, 400); // Scene with VBox layout
        primaryStage.setTitle("Musical Instruments"); // Set the window title
        primaryStage.setScene(scene); // Set the scene to the stage
        primaryStage.show(); // Display the window
    }

    /**
     * Displays the instrument's information in the output area.
     * 
     * @param instrument the instrument whose information will be displayed
     */
    private void displayInstrumentInfo(Instruments instrument) {
        // Clear the output area and display formatted instrument information
        outputArea.clear();
        outputArea.setText(instrument.getDescription());
    }

    /**
     * Main method to launch the application.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        launch(args); // Launch the application
    }
}