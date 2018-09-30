/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import bowling.MultiPlayerGame;
import bowling.SinglePlayerGame;
import java.util.HashMap;



public class MultiplayerGame implements MultiPlayerGame{
    
    private HashMap<String,SinglePlayerGame> partie = new HashMap<String,SinglePlayerGame>() ;
    private String[] joueur ;
    private int frameNumber;
            
    @Override
    public String startNewGame(String[] playerName) throws Exception{
        if(playerName.length==0)throw new UnsupportedOperationException("pas de joueur");
        for(int i=0;i<playerName.length;i++){
            partie.put(playerName[i], new SinglePlayerGame());;
            
        }
        this.joueur=playerName;
        return "Prochain tir : joueur " + this.joueur[0] + "tour n °1 , boule n°1 "  ;
    
    
    }

    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        if(nombreDeQuillesAbattues>10)throw new UnsupportedOperationException("invalide"); //To change body of generated methods, choose Tools | Templates.
        
        if (this.joueur.get(currentPlayer)).getCurrentFrame().isFinished() ){
        	this.currentPlayer=(this.currentPlayer+1) & name.size();
        }
    
        if (this.joueur.get(name.get(this.currentPlayer)).getCurrentFrame() ) {
        	this.joueur.get(name.get(this.currentPlayer)).lancer(nombreDeQuillesAbattues);
        	
        }
        else {
        	throw new UnsupportedOperationException("jeu terminer");
        	
        	
        }
        return affichage(this.currentplayer,this.joueur.get(name.het(this.currentPlayer)).getCirrentFrame().getFrameNumber().this.jeu.get(this.currentPlayer));
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        if(!this.partie.containsKey(playerName))throw new UnsupportedOperationException("pas de joueur"); //To change body of generated methods, choose Tools | Templates.
    
        return this.partie.get(playerName).score();
    }
    
}
