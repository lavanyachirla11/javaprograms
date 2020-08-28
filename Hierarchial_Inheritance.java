package pack1;
class Student3
{
	String name;
	int roll;
    Student3(String name , int rollno)  // constructor
    {
    	this.name = name;
    	roll = rollno;
    }
    void show()
    {
    	System.out.println("Name   = "+name+ "\nRollno = "+roll);
    }
}

class Marks3 extends Student3
{
	int m1, m2;
	Marks3(String name,int rn,int m1,int m2)
	{
	  super(name,rn);
	  this.m1 = m1;
	  this.m2 = m2;
	}
	void showmarks()
	{
		System.out.println("m1 = "+m1+ " m2 = "+m2);
	}
}

class Result extends Student3
{
	int m3, m4;
	Result(String name,int rn, int m3,int m4)
	{
	  super(name,rn);
	  this.m3 = m3;
	  this.m4 = m4;
	}
	void showResult()
	{
		System.out.println("m3 = "+m3+ " m4 = "+m4);
	}
}

public class Hierarchial_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Marks3 obj = new Marks3("Nandhini",15,78,69);
	       obj.show();
	       obj.showmarks();
	       System.out.println("-------------------------");
	       Result obj2 = new Result("Lavanya",17,99,75);
	       obj2.show();
	       obj2.showResult();

	}

}
