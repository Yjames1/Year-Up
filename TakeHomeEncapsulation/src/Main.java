
public class Main 
{

	public static void main(String[] args) 
	{
		Person mainPerson = new Person(10, "Jeff", "404-569-3028", "FlyDriven Street." );
		mainPerson.GrowsOlder = mainPerson.m_personAge + 1;
		System.out.println(mainPerson.m_personName + " was "+ mainPerson.m_personAge + " last year but is now " + mainPerson.GrowsOlder + " and their number is "  +  mainPerson.m_phoneNumber + " and lives on " + mainPerson.m_address);
		
	}

}
