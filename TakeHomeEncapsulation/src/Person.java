
public class Person 
{
	int m_personAge = -1;
	String m_personName;
	String m_phoneNumber;
	String m_address;
	public int GrowsOlder;


public Person (int personAge, String personName, String phoneNumber, String address)
{
	m_personAge = personAge;
	m_phoneNumber = phoneNumber;
	m_personName = personName;
	m_address = address;
}
public int GetpersonAge()
{
	return m_personAge;
}

private void SetpersonAge(int personAge)
{
	m_personAge = personAge;
}
public String GetpersontName()
{
	return m_personName;
}
private void SetpersonName(String personName)
{
	m_personName = personName;
}
public String GetphoneNumber()
{
	return m_phoneNumber;
}
private void SetphoneNumber(String phoneNumber)
{
	m_phoneNumber = phoneNumber;
}
public String Getaddress()
{
	return m_address;
}
private void Setaddress(String address)
{
	m_address = address;
}
public void GrowsOlder(int GrowsOlder)
{
	GrowsOlder = m_personAge + 1;
	System.out.println(m_personName + " was " + m_personAge + "  last year, he/she is " + GrowsOlder);
}










}