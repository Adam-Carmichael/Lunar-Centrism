/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.util.Random;

/**
 *
 * @author user
 */
public class Gear
{
   private String itemName = "";
   private double weight = 0;
   private String rarity = "";
   
   private Random rand = new Random();

  
  
   public Gear(int playerLvl)
   {
       if(rand.nextInt(3) > 0)
      {
         weight = rand.nextInt(10) + 3;
      }
      else
      {
         weight = rand.nextInt(5) + 12;
      }
   }
   
   public void setRarity(String r)
   {
      rarity = r;
   }
   
   public void setItemName(String nm)
   {
      itemName = nm;
   }
   
   public void setWeight(double wt)
   {
      weight = wt;
   }
   
   public String getItemName()
   {
      return itemName;
   }
   
   public String getRarity()
   {
      return rarity;
   }
   
   public double getWeight()
   {
      return weight;
   }

}
