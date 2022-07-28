package controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.effect.SepiaTone;

import java.net.URL;
import java.time.ZoneId;
import java.util.ResourceBundle;
import java.util.Set;

public class LoginScreen implements Initializable {
    public Label location;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // on initialization of the application this code gets the zone id for the system.
        ZoneId z = ZoneId.systemDefault();
        location.setText(String.valueOf(z));
    }
}
