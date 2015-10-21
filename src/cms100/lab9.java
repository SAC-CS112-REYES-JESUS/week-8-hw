package cms100;
import java.util.Scanner;
import java.util.*;



public class lab9 {

	public static void main(String[] args)
	{
		int x = 1;
		int y=2;
		int z=3;//declare variables r1,p2,s3
		int tie = 0,win=0,lose=0;
		int []myArray = new int[9];
		
		for(int i= 0;i<myArray.length;i++)
		{
		int myNumber;
		Random computerRand = new Random();
		int randomNumber=computerRand.nextInt(4-1)+1;	
		//int randomNumber=3;
		
		Scanner input= new Scanner (System.in);
		//System.out.println("Here we go, choose one");
		System.out.println("Rock(1), Paper(2), Scissors(3)");
		myNumber = input.nextInt();
		
		
		if((x==randomNumber))//computer got rock
		{	
			if((myNumber == randomNumber))//rock vs rock
			{
				System.out.println("Sucker , tie(rock)");
				tie++;
				
			}
			else if ((myNumber <=y)&& (y ==2))//my papers vs rock
			{
				System.out.println("Win");
				win++;
			}
			
			else
			{
				System.out.println("lose(rock)");
				lose++;
			}
		}
		if((y==randomNumber)) //computer got paper
		{
			if((myNumber == randomNumber))
			{
				System.out.println("Sucker , tie(paper)");//same
				tie++;
			}
			else if ((myNumber <=x) && (x==1))
					{
				System.out.println("Lose");//my rock vs paper
				lose++;
					}
			else
			{
				System.out.println("Win");
				win++;
			}
		}
		if((z==randomNumber)) //computer got scissorts
		{
			if((myNumber == randomNumber))
			{
				System.out.println("Sucker , tie(scissors)");
				tie++;//same
			}
			else if ((myNumber <=x) && (x==1))
			{
				System.out.println("Win"); //myrock vs scissorts
				win++;
			}
			else
			{
				System.out.println("lose");
				lose++;
			}
		}
		
		
		
		
		System.out.printf("The computer choose %d\n", randomNumber);
		
		
		}	
		
		
	System.out.printf("\nThe number of times\nWon:%d\nLost:%d\nTie:%d\n",win,lose,tie);
	
		
		
	}
}
