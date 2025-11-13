package CSC400_work;

import java.util.Arrays;

public class radixsort {
	

    static int Max(int arr[], int n)
    {
        int m = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > m)
                m = arr[i];
        return m;
    }

    static void count(int arr[], int n, int e)
    {
        int o[] = new int[n];
        int i;
        int c[] = new int[10];
        Arrays.fill(c, 0);

        for (i = 0; i < n; i++)
            c[(arr[i] / e) % 10]++;

        for (i = 1; i < 10; i++)
            c[i] += c[i - 1];

        for (i = n - 1; i >= 0; i--) {
            o[c[(arr[i] / e) % 10] - 1] = arr[i];
            c[(arr[i] / e) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = o[i];
    }


    static void radix(int arr[], int n)
    {

        int m = Max(arr, n);

        for (int e = 1; m / e > 0; e *= 10)
            count(arr, n, e);
    }

    static void p(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        int arr[] = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};
        int n = arr.length;

        
        System.out.print("Before sort: ");
        p(arr, n);
        
        radix(arr, n);
        
        System.out.print("\nAfter sort: ");
        p(arr, n);
    }
}