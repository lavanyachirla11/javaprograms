class exception_handling 

    {

        public static void main(String args[]) 

        {

            try 

            {

                int a, b;

                b = 0;

		System.out.print("A");

                a = 5 / b;

                

            }

            catch(ArithmeticException e) 

            {

        	System.out.print("B");        	

            }

            finally 

            {

    	        System.out.print("C");

            }

        }

    }