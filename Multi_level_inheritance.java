package pack1;
class Student4
{
	String name;
	int roll;
    Student4(String name , int rollno)  // constructor
    {
    	this.name = name;
    	roll = rollno;
    }
    void showStudent()
    {
    	System.out.println("Name   = "+name+ "\nRollno = "+roll);
    }
}

class Marks4 extends Student4
{
	int m1, m2;
	Marks4(String name,int rn,int m1,int m2)
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

class Result1 extends Marks4
{
	int m3, m4;
	Result1(String name,int rn, int m1, int m2,int m3,int m4)
	{
	  super(name,rn,m1,m2);
	  this.m3 = m3;
	  this.m4 = m4;
	}
	void showResult()
	{
		System.out.println("m3 = "+m3+ " m4 = "+m4);
	}
}

public class Multi_level_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result1 obj2 = new Result1("Krithika",21,88,89,98,99);
	       obj2.showStudent();
	       obj2.showmarks();
	       obj2.showResult(); 
		

	}

}
