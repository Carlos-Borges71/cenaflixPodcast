/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cenaflix.cenaflixpodcast;

import com.cenaflix.cenaflixpodcast.view.TelaLogin;




/**
 *
 * @author Carlos Borges
 */
public class CenaflixPodCast {

    public static void main(String[] args) {
       
        
        javax.swing.SwingUtilities.invokeLater(() -> {         
        TelaLogin view = new TelaLogin();
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        view.setTitle("LOGIN");
        
        
        });
    }
}
