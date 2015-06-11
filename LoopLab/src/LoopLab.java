
public class LoopLab {

public static void main(String[] args)
			{
				int[] array = {10,2,6,10,2,3,7,9,2,1,8};
				int foundNumber;
				
				
				LoopLab newLoop = new LoopLab();
				
				newLoop.searchNumber(array, 10);
				newLoop.countNumber(array, 2);
			}
			
			
			public static void searchNumber(int[] array, int foundNumber)
			{
				
				for (int i = 0; i < array.length; i++)
				{
					
					if (array[i] == foundNumber)
					{
						
						System.out.println("the number that was found was: " + foundNumber);
						break;
					}
				}
			}

			
			public static void countNumber(int[] array, int foundNumber)
			{
				
				int numberOfOccurences = 0;
			
				for (int i = 0; i < array.length; i++)
				{
					
					if (array[i] == foundNumber)
					{
						numberOfOccurences++;				
					}
				}
				System.out.println("The number shows about " + numberOfOccurences + " times.");
	}
}



