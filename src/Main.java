import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int [] numbersArray = new int[3];
        numbersArray[0] = 1;
        numbersArray[1]  =  2;
        numbersArray[2]  =  3;

        double [] decimalNumbersArray = {1.57, 7.654, 9.986};

        String [] namesArray = {"Alice", "Bob", "Charlie"};

        System.out.println("-----------------\nTask  2");

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]);
            if  (i  <  numbersArray.length - 1)  {System.out.print(",");}
        }
        System.out.println();
        for (int i  =  0; i  < decimalNumbersArray.length; i++)  {
            System.out.print(decimalNumbersArray[i]);
            if   (i   <  decimalNumbersArray.length  -  1)  {System.out.print(",");}
        }
        System.out.println();
        for (int i  =  0; i  < namesArray.length; i++)   {
            System.out.print(namesArray[i]);
            if   (i   <  namesArray.length  -  1)   {System.out.print(",");}
        }

        System.out.println("\n-----------------\nTask  3");
        int numbers = numbersArray.length;
        while  (numbers  >  0)  {
            System.out.print(numbersArray[--numbers]);
            if    (numbers   >  0)   {System.out.print(",");}
        }
        System.out.println();
        numbers  = decimalNumbersArray.length;
        while   (numbers   >  0)   {
            System.out.print(decimalNumbersArray[--numbers]);
            if    (numbers   >  0)   {System.out.print(",");}
        }
        System.out.println();
        numbers  = namesArray.length;
        while    (numbers    >  0)    {
            System.out.print(namesArray[--numbers]);
            if    (numbers    >  0)    {System.out.print(",");}
        }
        System.out.println("\n-----------------\nTask  4");

        for  (int i  =  0; i  < numbersArray.length; i++)  {
            if (numbersArray[i]  %  2  !=  0)   {
                numbersArray[i]  ++;
            }
        }
        System.out.println(Arrays.toString(numbersArray));

    }
}