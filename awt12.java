import java.awt.*;
import java.awt.event.*;
class awt12 extends Frame implements ActionListener
{
	Label Choose_Education, Choose_City;
	Choice ch1;
	List list1;
	Button b1,b2;
	
	awt12()
	{
		Choose_Education=new Label("Choose_Education");
		Choose_Education.setBounds(50,50,150,20);
		
		ch1=new Choice();// for giving choice in the form.
		ch1.setBounds(210,50,100,20);
		ch1.add("Matric");
		ch1.add("Intermediate");
		ch1.add("Graduation ");
		ch1.add("Post Graduation");
		ch1.add("Doctorate");
		ch1.add("Post-Doctorate");
		
		
		Choose_City=new Label("Choose_City");
		Choose_City.setBounds(50,150,150,50);
		
		list1=new List();// for creating list in the form.
		
		list1.setBounds(210,150,100,80);
		list1.add("Dehradun");
		list1.add("Nainital");
		list1.add("Moosoorie ");
		list1.add("Rishikesh");
		list1.add("Haridwra");
		list1.add("Pauri");

		add(list1);
			
		b1=new Button("");
		b1.setBounds(50,420,150,50);
		b1.addActionListener(this);
		
		b2=new Button("");
		b2.setBounds(250,420,150,50);
		b2.addActionListener(this);
		
		add(Choose_Education);
		add(ch1);
		add(Choose_City);
		add(b1);
		add(b2);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			System.out.println("Selected Value is "+ch1.getSelectedItem());// all the methods of list and choice are same.
			System.out.println("Selected Index is "+ch1.getSelectedIndex());//to select the index
			System.out.println("Items in List "+ch1.getItemCount());// to count the total items in the list. 
			System.out.println("Value at 2nd Index "+ch1.getItem(2));// to give the data of a particular person /thing.
		}
		if(ae.getSource()==b2)
		{
			System.out.println("Selected Value is "+list1.getSelectedItem());
			System.out.println("Selected Index is "+list1.getSelectedIndex());
			System.out.println("Items in List "+list1.getItemCount());
			System.out.println("Value at 2nd Index "+list1.getItem(2));
		}
	}
	public static void main(String[] args)
	{
		new awt12();
	}
}
		
