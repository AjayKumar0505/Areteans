package com.ABS.ataf.stepdef.Pega;

import groovyjarjarantlr4.v4.parse.ANTLRParser.element_return;

public class Conditional {

	public static void main(String[] args) {
	int num=7,mid1=(num/2)+1,mid2=(num/2)+1;
	
	for(int row=1; row<=7; row++)
	{
		for(int col=1 ; col<=7; col++)
		{
			if(col==mid1)
			{
				System.out.print("*");
				mid1--;
				if(row==1) {mid2++;}
			}
			else if(col==mid2)
			{
				System.out.print("*");
				mid2++;
			}
			else {
				System.out.print(" ");
			}
		}
		
		System.out.println("");	
	}
	

	}

}
