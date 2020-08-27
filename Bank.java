package pack1;
class Person
{  
	String name;
	int accno;
	Person()
	{
		name="Lavanya";
		accno=102836;
	}
	Person(String name)
	{
		this.name=name;
		accno=192879;
	}
	Person(String name,int accno)
	{
		this.name=name;
		this.accno=accno;
	}
	void show()
	{
		System.out.println("Name    = "+name+"\nAccount = "+accno);
	}
}
public class Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person b1 = new Person();
		b1.show();
		Person b2 = new Person("Lavanya");
		b2.show();
		Person b3 = new Person("Anusha",121452);
		b3.show();

	}

}
