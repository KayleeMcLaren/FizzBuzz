
package fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
           
        for(int i = 1; i <= 100; i++) //use a for loop to iterate through each number from 1 to 100
        {
            if(i % 3 == 0)  //if that number is a multiple of 3, print out Fizz instead of the number 
            {System.out.println("Fizz");
            }
            
            if(i % 5 == 0)  //if that number is a multiple of 5, print out Buzz instead of the number 
            {System.out.println("Buzz");
            }
            
            if(i % 3 == 0 && i % 5 == 0)    //if that number is a multiple of 3 and 5, print out FizzBuzz instead of the number 
            {System.out.println("FizzBuzz");
            }
            
            else if (i % 3 != 0 && i % 5 != 0)  //if that number is neither a multiple of 3 nor 5, print out the number 
                System.out.println(i);
                }
            }
        }


    

