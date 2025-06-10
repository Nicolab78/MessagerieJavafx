package controller;

import dao.UserDAO; // Remplacer l'import
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import model.User;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        UserDAO userDAO = new UserDAO(); // Utiliser UserDAO directement
        User user = userDAO.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../view/acceuil.fxml"));
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("Accueil");
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
                messageLabel.setText("Erreur de chargement de l'accueil.");
            }
        } else {
            messageLabel.setText("Identifiants incorrects.");
        }
    }
}
