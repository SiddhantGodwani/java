public class Nestedwhileloop 
    {
        public static void main(String srgs[])
        {
            int i = 1;
            // Prints 5 times:
            while(i<=5)
                {
                  System.out.println("Hi---->"+i);

                    int j = 1;  
                    while(j<=3)  //Nested While
                    {
                      System.out.println("YO"+ j);
                      j++;
                    }
                  
                  i++;

                }
            // Comes out of loop
            System.out.println("Bye"+i);    // i+1 = 11 > 10 so (end of looploop) 

            
        }

    }
