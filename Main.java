package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	    int[] myArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 целых чисел");
        for (int i = 0; i < 10; i++)
        {
            myArray[i] = scanner.nextInt();
        }

        int[] copyOfMyArray = new int[10];
        int[] arrayOfIndex = new int[10];
        for (int i = 0; i < 10; i++)
        {
            arrayOfIndex[i] = -1;
        }

        for (int i = 0; i < 10; i++)
        {
            int min = myArray[i];
            copyOfMyArray[i] = min;
            boolean a = false;
            for (int item:arrayOfIndex)
            {
                if (i == item )
                {
                    a = true;
                    break;
                }
            }
            if (a)
            {
                for (int j = 0; j<10; j++)
                {
                    if (j==i)
                    {
                        continue;
                    }

                    boolean b = false;

                    for (int item:arrayOfIndex)
                    {
                        if (j == item )
                        {
                            b = true;
                            break;
                        }
                    }

                    if (b)
                    {
                        continue;
                    }
                    min = myArray[j];
                    arrayOfIndex[i] = j;
                    copyOfMyArray[i] = min;
                    break;
                }
            }
            else
            {
                arrayOfIndex[i] = i;
            }
            for (int j = 0; j < 10; j++)
            {
                if (j==i)
                {
                   continue;
                }

                boolean b = false;

                for (int item:arrayOfIndex)
                {
                    if (j == item )
                    {
                        b = true;
                        break;
                    }
                }

                if (b)
                {
                    continue;
                }
                if (min>myArray[j])
                {
                    min = myArray[j];
                    copyOfMyArray[i] = myArray[j];
                    arrayOfIndex[i] = j;
                }
            }
        }

        for (int item: copyOfMyArray)
        {
            System.out.print(item +" ");
        }
    }
}
