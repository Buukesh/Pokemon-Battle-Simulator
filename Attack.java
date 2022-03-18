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
public class Attack {
    String name;
    int atttype;
    int category;
    int power;
    int accuracy;
    String movepic;
        
    Attack(String name, int type, int category, int power, int accuracy, String movepic)
    {
        this.name = name;
        this.atttype = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.movepic = movepic;
    }
    
 public String getName() {
    return name;
  }
  
  public int getCategory() {
    return category;
  }
  
  public int getPower() {
    return power;
  }
  
  public int getAtttype(){
      return atttype;
  }
  
  public int getAccuracy() {
    return accuracy;
  }

  public String getMovepic(){
      return movepic;
  }

}
