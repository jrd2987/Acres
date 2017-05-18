/*
Programmer: Justin Doggett
Date: 5/3/2017
Description: This program calculates the number of acres in a tract of land with 389,767 square feet.
*One acre of land is equivalent to 43,560 square feet
*/

public class Acres
{
	//Start of program
	public static void main(String [] args)
	{
		double oneAcre = 43560; //sets the value 43560 to the variable oneAcre
		double tractOfLand = 389767; //sets the value 389,767 to the variale tractOfLand
		double numOfAcres = tractOfLand / oneAcre; //calculates the number of acres and stores the value in a varialble named numofAcres

		//displays the number of acres to the console.
		System.out.println("The number of acres in a tract of land with 389,767 square feet is: " + numOfAcres);
	}
}
