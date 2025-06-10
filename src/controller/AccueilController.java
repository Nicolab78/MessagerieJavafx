package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AccueilController {

    @FXML
    private void handleVoirMessages() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Messages");
        alert.setHeaderText(null);
        alert.setContentText("Liste des messages à venir...");
        alert.showAndWait();
    }

    @FXML
    private void handleEnvoyerMessage() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Envoyer un message");
        alert.setHeaderText(null);
        alert.setContentText("Fonctionnalité à implémenter.");
        alert.showAndWait();
    }

    @FXML
    private void handleDeconnexion() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Déconnexion");
        alert.setHeaderText(null);
        alert.setContentText("Déconnexion réussie !");
        alert.showAndWait();
    }
}
