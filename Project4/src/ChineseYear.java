import javax.swing.JOptionPane;


public class ChineseYear 
{

	public static void main(String[] args) 
	{
	int year =Integer.parseInt(JOptionPane.showInputDialog("Enter the year you where born"));
	System.out.println("You were born in " + year);

	int Yeardiff= year-1900;
	int remainder = Yeardiff/12;
	System.out.println("The remainder of the years is " + remainder);
	
	

	switch (remainder)
	{
			case 0 :
				{
					JOptionPane.showMessageDialog( null, "You were born in " + year + " which is the Year of the Rat!");break;
				}
				case 1:
				{
					JOptionPane.showMessageDialog(null, "You were born in " + year + " which is the Year of the Ox!!");break;
				}
				case 2:
				{
					JOptionPane.showMessageDialog(null,"You were born in " + year + " which is the Year of the Tiger!");break;
				}
				case 3:
				{
					JOptionPane.showMessageDialog(null,"You were born in " + year + " which is the Year of the Rabbit!!");break;
				}
				case 4:
				{
					JOptionPane.showMessageDialog(null,"You were born in " + year + " which is the Year of the Dragon!!");break;
				}
				case 5:
				{
					JOptionPane.showMessageDialog(null,"You were born in " + year + " which is the Year of the Snake!!");break;
				}
				case 6:
				{
					JOptionPane.showMessageDialog(null,"You were born in " + year + " which is the Year of the Horse!!");break;
				}
				case 7:
				{
					JOptionPane.showMessageDialog(null,"You were born in " + year + " which is the Year of the Sheep!!");break;
				}
				case 8:
				{
					JOptionPane.showMessageDialog(null,"You were born in " + year + " which is the Year of the Monkey!!");break;
				}
				case 9:
				{
					JOptionPane.showMessageDialog(null,"You were born in " + year + " which is the Year of the Rooster!!"); break;
				}
				case 10:
				{
					JOptionPane.showMessageDialog(null,"You were born in " + year + " which is the Year of the Dog!!");break;
				}
				case 11:
				{
					JOptionPane.showMessageDialog(null,"You were born in " + year + " which is the Year of the Pig!!"); break;
				}
				default:
				{
					JOptionPane.showMessageDialog(null,"This is a invalid, error retry! "); break;
				}

	
	}
	}
	
}
			

