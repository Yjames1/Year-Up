import java.util.Scanner;


public class DayofWeek {

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a Day of the Week");
		String Day= scanner.next();
		System.out.println("I read this day of the week:\n " + Day);
		DayofWeek dayofWeekEvaluator = new DayofWeek();
		dayofWeekEvaluator.EvaluateDayofWeek(Day);
		
		
		scanner.close();
		

	}
	
	void EvaluateDayofWeekUsingSwitchStatements(String DayofWeek)
	{
		if(DayofWeek !=null)
		{
			String lowerCaseDayofWeek = DayofWeek.toLowerCase();
			switch(DayofWeek)
			{
			case("monday"):
				case("tuesday"):
				case("wednesday"):
				case("thurdsday"):
				case("friday"):
				{
					System.out.println("Its is a weekday, I have to go to work :( "); break;
				}
				case("saturday"):
				case("sunday"):
				{
					System.out.println("Its the weekend, YAY!!!"); break;
				}
				default:
				{
					System.out.println("This is a invalid day, retry!"); break;
				}
			}
		}
	}
    void EvaluateDayofWeek(String DayofWeek)
{
	if (DayofWeek != null)
	{
		if (DayofWeek.equalsIgnoreCase("saturday")
		|| DayofWeek.equalsIgnoreCase("sunday"))
		{
			System.out.println(DayofWeek + " is the weekend!!");
		}
		else if (DayofWeek.equalsIgnoreCase("monday")
				||DayofWeek.equalsIgnoreCase("tuesday")
				||DayofWeek.equalsIgnoreCase("wednesday")
				||DayofWeek.equalsIgnoreCase("thursday")
				||DayofWeek.equalsIgnoreCase("friday"))
				{
			System.out.println(DayofWeek + " is a weekday, I have to go to work!!");
				}
		else
		{
			System.out.println(DayofWeek + " is not even a valid day!!");
		}
	}
}
    
    
    
    
}
