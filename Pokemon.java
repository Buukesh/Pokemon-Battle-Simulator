/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Sukesh
 */
public class Pokemon{
    String name;
    int type1;
    int type2;
    public Attack[]attacks = new Attack[4];
    double hp;
    int def;
    int att;
    int spdef;
    int spatt;
    int spe;
    String full;
    String face;
            
    public void setAttack(int index, Attack atk) {
        attacks[index] = atk;
    }         

    public Attack getAttack(int index){
        return attacks[index];
    }
    public String getName() {
        return name;
    }
  
    public int getDefense(){
        return def;
    } 

    public double getHp(){
        return hp;
    }
    
    public int getSpe(){
        return spe;
    }
    
    public int getType1(){
        return type1;
    }
    
    public int getType2(){
        return type2;
    }
    
    public void setHp(double h){
    hp = h;
    if (hp < 0) {
        hp = 0;
    }
  }
   
    public String getFull(){
        return full;
    }
    
    public String getFace(){
        return face;
    }
}

