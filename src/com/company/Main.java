package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a = {2, 6, 7, 6, 2};
        int[] a_reversed = reverse(a);
        System.out.println(equal(a, a_reversed));//checking if input array is a palindrome
    }

    static int[] reverse(int[] a)
    {
        int[] a_reversed = new int[a.length];
        for (int i = 0; i < a.length; i++)
        {
            a_reversed[a.length - 1 - i] = a[i];
        }
        return a_reversed;
    }

    static boolean equal(int[] a, int[] b)
    {
        boolean result = a.length == b.length;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
            {
                result = false;
                break;
            }
        return result;
    }
}
