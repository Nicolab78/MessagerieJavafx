package model;

import java.time.LocalDateTime;

public class Message {
    private int id;
    private String auteur;
    private String contenu;
    private LocalDateTime dateEnvoi;

    public Message(int id, String auteur, String contenu, LocalDateTime dateEnvoi) {
        this.id = id;
        this.auteur = auteur;
        this.contenu = contenu;
        this.dateEnvoi = dateEnvoi;
    }

    public Message(String auteur, String contenu) {
        this.auteur = auteur;
        this.contenu = contenu;
    }

    public int getId() { return id; }
    public String getAuteur() { return auteur; }
    public String getContenu() { return contenu; }
    public LocalDateTime getDateEnvoi() { return dateEnvoi; }
}
