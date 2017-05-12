/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class UtenteFactory {

    private static UtenteFactory singleton;

    public static UtenteFactory getInstance() {
        if (singleton == null) {
            singleton = new UtenteFactory();
        }
        return singleton;
    }

    private ArrayList<Utente> listaUtenti = new ArrayList<Utente>();

    private UtenteFactory() {
        //Creazione utenti

        //Paolo Bonolis
        Utente utente1 = new Utente();
        utente1.setId(0);
        utente1.setNome("Paolo");
        utente1.setCognome("Bonolis");
        utente1.setUrlFotoProfilo("foto/bonolis-rid.jpg");
        utente1.setFrasePresentazione("Sì, sono logorroico. Parlo tantissimo, perché non ho niente da dire.");
        utente1.setPassword("123");

        //Barbara D'Urso
        Utente utente2 = new Utente();
        utente2.setId(1);
        utente2.setNome("Barbara");
        utente2.setCognome("D'Urso");
        utente2.setUrlFotoProfilo("foto/barbara.jpg");
        utente2.setFrasePresentazione("Voglio salutare l'Istituto dei ciechi di Milano, so che mi stanno guardando.");
        utente2.setPassword("123");

        //Maurizio Costanzo
        Utente utente3 = new Utente();
        utente3.setId(2);
        utente3.setNome("Maurizio");
        utente3.setCognome("Costanzo");
        utente3.setUrlFotoProfilo("foto/costanzo-rid.jpg");
        utente3.setFrasePresentazione("Io non odio. È troppo faticoso ricordarsi giorno dopo giorno chi e perché.");
        utente3.setPassword("123");

        listaUtenti.add(utente1);
        listaUtenti.add(utente2);
        listaUtenti.add(utente3);
    }
    
    public Utente getUtenteById(int id){
        for(Utente utente : this.listaUtenti){
            if(utente.getId() == id){
                return utente;
            }
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String user, String password){
        for(Utente utente : this.listaUtenti){
            if(utente.getNome().equals(user) && utente.getPassword().equals(password)){
                return utente.getId();
            }
        }
        return -1;
    }
}
