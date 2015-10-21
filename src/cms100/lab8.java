package cms100;


import java.util.Arrays;

public class lab8 {
	
	public static void main(String[] args){
	
	
	
	int[] myArray = new int[6];
	myArray[0]=123;
	myArray[1]=456;
	myArray[2]=479;
	myArray[3]=135;
	myArray[4]=246;
	myArray[5]=135;
	
	int sum = 0;
	
	Arrays.sort(myArray);
	
	for(int i= 0;i<myArray.length;i++)
	{
	System.out.printf("The number is %d\n", myArray[i]);
		sum = sum + myArray[i];
			
	}
	
	
	
	
	float average = (float) (sum /myArray.length);
	System.out.printf("The average of the numbers is %.2f",average);

	
	}
}
