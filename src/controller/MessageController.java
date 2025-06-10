package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.io.IOException;

public class MessageController {

    @FXML
    private TextField destinataireField;

    @FXML
    private TextArea contenuField;

    // Méthode pour envoyer un message
    @FXML
    private void handleEnvoyerMessage(ActionEvent event) {
        String destinataire = destinataireField.getText();
        String contenu = contenuField.getText();

        // Affichage pour vérification
        System.out.println("Message envoyé à : " + destinataire);
        System.out.println("Contenu : " + contenu);

        // TODO : Ajouter ici l'insertion en base de données
    }

    // Méthode pour revenir à l'accueil
    @FXML
    private void handleRetourAccueil(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/accueil.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Accueil");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erreur lors du retour à l'accueil.");
        }
    }
}
