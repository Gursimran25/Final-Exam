/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheridan;

/**
 *
 * @author User
 */
   public class Discount
{
	
 
	double  dis,amount,markedprice,s;
               
	markedprice=1000;
 
        dis=25;  // 25 mean 25%			
	
	System.out.println("markedprice= "+markedprice);
 
	System.out.println("discount rate="+dis);
         
        s=100-dis;
 
	amount= (s*markedprice)/100;
 
	System.out.println("amount after discount="+amount);
 
	}



