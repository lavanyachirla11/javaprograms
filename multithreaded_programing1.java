 class newthread extends Thread

    {

	Thread t;

	String name;

	newthread(String threadname)

        {

	    name = threadname;

	    t = new Thread(this,name);

	    t.start();

	}

	public void run()

        {

        }

 

    }

    class multithreaded_programing1

    {

        public static void main(String args[])

        {

	    newthread obj1 = 	 new newthread("one");

	    newthread obj2 =	 new newthread("two");

            try

            {

                obj1.t.wait();	

                System.out.print(obj1.t.isAlive());

            }

            catch(Exception e)

            {

	    System.out.print("Main thread interrupted");

            }

        }

    }