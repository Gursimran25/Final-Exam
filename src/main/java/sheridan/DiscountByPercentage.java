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
 
import java.util.Scanner;
import static sheridan.Factory.amount;

public class DiscountByPercentage
{

 
	double  dis,amount,markedprice,s;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter markedprice ");	
               
	markedprice=sc.nextDouble();
 
        System.out.println("enter discount percentage ");	
               
	dis=sc.nextDouble();			
	
        s=100-dis;
 
	amount= (s*markedprice)/100;
 
	System.out.println("amount after discount="+amount);
 
	}



