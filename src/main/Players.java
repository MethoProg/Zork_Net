/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Druit
 */
 class Player{
    String username;
    int score;
    int lvl;
    int moves;
    
    public Player(String username,int score,int lvl,int moves){
        
    }
    
    public String getUsername(String username){
        return this.username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public int getScore(int score){
        return this.score;
    }
    public void setScore(int score){
        this.score=score;
    }
    public int getLvl(int lvl){
        return this.lvl;
    }
    public void setLvl(int lvl){
        this.lvl=lvl;
    }
    public int getMoves(int moves){
        return this.moves;
    }
    public void setMoves(int moves){
        this.moves=moves;
    }
    
}
public class Players{
     public static void build(Player[] player, final int size_players){
         for (int i = 0; i < size_players; i++) {
            
                player[i] = new Player("",0,0,0);
            
        }
               player[0].setUsername("George");
               player[0].setLvl(15);
               player[0].setMoves(3);
               player[0].setScore(15);
               
               player[1].setUsername("Nick");
               player[1].setLvl(1);
               player[1].setMoves(1);
               player[1].setScore(25);
               
               player[2].setUsername("Cathrin");
               player[2].setLvl(5);
               player[2].setMoves(10);
               player[2].setScore(105);
               
               player[3].setUsername("John");
               player[3].setLvl(23);
               player[3].setMoves(13);
               player[3].setScore(0);

         
     }

}

