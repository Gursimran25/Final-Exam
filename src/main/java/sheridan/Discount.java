/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheridan;

import static sheridan.Factory.amount;

/**
 *
 * @author User
 */
   public class Discount
{
	
 
	double  dis,amount,markedprice,s;
               
	markedprice=1000;
 
        dis=25;  // 25 mean 25%			

    public Discount() {
        this.s = 100-dis;
    }
	
	System.out.println("markedprice= "+markedprice);
 
	System.out.println("discount rate="+dis);
         
         double s;
 
	amount= (s*markedprice)/100;
 
	System.out.println("amount after discount="+amount);
 
	}



