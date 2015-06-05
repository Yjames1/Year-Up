
public class LargeNumber 
{

			public static void main(String[] args)
			{
				int[] array1 = {4, 9, 2};
				int[] array2 = {};
				int[] array3 = null;
				int[] array4 = {11, 52, 76};
				int[] array5 = {};
				int[] array6 = null;
				LargestNumberUsingForLoop(array1);
				LargestNumberUsingForLoop(array2);
				LargestNumberUsingForLoop(array3);
				LargestNumberUsingWhileLoop(array4);
				LargestNumberUsingWhileLoop(array5);
				LargestNumberUsingWhileLoop(array6);
				
			}
			 public static void LargestNumberUsingWhileLoop(int[] inputArray)
			 {
				if (inputArray != null)
				{
					if (inputArray.length > 0)
					{
						int LargestNumber = inputArray[0];
						int i = 0;
						
						while (i < inputArray.length)
						{
							if (LargestNumber < inputArray[i])
							{
								LargestNumber = inputArray[i];
							}
							/*printed outside to keep the method from repeating continuously and
							 * not print the print statement every time 
							 */
							i++;
						}
						System.out.println("The largest number is " + LargestNumber);
						System.out.println("_________________________");
					}
					else
					{
						System.out.println("This has no number");
						System.out.println("____________________");
					}
				}
				else
				{
					System.out.println("This is an array");
					System.out.println("____________________");
				}
			 }
			 
			 
			public static void LargestNumberUsingForLoop(int[] inputArray)
			{
				/*do null check to "not null" so it wont have null exception
				/null is like a black hole, nothing is there
				 */
				if (inputArray != null)
				{
					if (inputArray.length > 0) 
					{
						// initializes the number variable to help find the largest number
						int largestNumber = inputArray[0];
						
						//semicolons are at the end of statements
						/*start from i=0 to i =array,length with increments of 1. Assigns i to 0 and check
						 * if it is smaller than array length while incrementing by 1
						 */
						for (int i = 0; i < inputArray.length; i++)
						{
							/*if the value is less than the index, it sets it aside and moves on to find
							 * if the next number is larger 
							 */
							if(largestNumber < inputArray[i])
							{
								largestNumber = inputArray[i];
							}
						}
						//prints the finding of the largest number
						System.out.println("The largest number found is " + largestNumber);
						System.out.println("_____________________________");
					}
					else
					{
						//if the value is equal to the index (0) 
						System.out.println("This array does not have any numbers");
						System.out.println("____________________________________");
					}
				}
				else
				{
					System.out.println("You have a null array");
					System.out.println("____________________");
					System.out.println("");
					System.out.println("");
				}
			}

		

	}


