package pack1;
interface A1
{
	void show();
}
interface B
{
	void show2();
}
class C implements A1,B
{
	public void show()
	{
		System.out.println("Interface-A");
	}
	public void show2()
	{
		System.out.println("Interface-B");
	}
}

public class MultipleInheritance_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.show();
		obj.show2();

	}

}
