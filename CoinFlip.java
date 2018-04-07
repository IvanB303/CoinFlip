/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CoinFlip
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int flips,tails=0,heads=0,bstreak=1,cstreak=1;
	 ArrayList<Character> coinarray=new ArrayList<>();
	 ArrayList<Integer> arraymap=new ArrayList<>();
	 char face,streak,nextchar;
	 double r,hratio,tratio,bstrprob;
	 Scanner sc=new Scanner(System.in);
	 flips=sc.nextInt();
	 for(int i=0;i<flips;i++){
	 	r=Math.random();
	 	if(r>0.5){
	 		face='h';
	 	  coinarray.add(face);
	 	  heads++;
	 		}
	 	if(r<0.5){
	 		face='t';
	 		coinarray.add(face);
	 		tails++;
	 		}
	 	}
	 	streak=(char) coinarray.get(0);
	 	for(int j=1;j<coinarray.size()-1;j++){
	 		  nextchar=(char) coinarray.get(j);
	 		  arraymap.add(cstreak);
	 		  if(cstreak>bstreak){
	 		  	bstreak=cstreak;
	 		  	}
	 		  if(streak==nextchar){
	 		  	cstreak++;
	 		  	}
	 		  if(streak!=nextchar){
	 		  	streak=nextchar;
	 		  	cstreak=1;
	 		  	}
	 		
	 		}
	 	hratio=(double) heads/coinarray.size();
	 	tratio=(double) tails/coinarray.size();
	 	bstrprob=Math.pow(2.0,(double) bstreak);
	 	//System.out.println(coinarray);
	 	//System.out.println(arraymap);
	 	System.out.println("Flips "+coinarray.size());
	 	System.out.println(heads+" ratio " +hratio);
	 	System.out.println(tails+ " ratio " +tratio);
	 	System.out.println(bstreak);
	 	System.out.println("Probability 1/"+bstrprob);
	 	System.out.println(streak);
	}
}
