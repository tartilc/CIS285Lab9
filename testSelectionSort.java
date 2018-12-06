/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
    }
    
    public void testPositive()	{
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        
        assertArrayEquals("Positive Test Fails", Sortedarr, arr);
        
        //edited by ricky
        
    }
    
    public void testNegative()	{
        
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        
        assertArrayEquals("Negative Test Fails",Sortedarr,arr);
        
        //edited by ricky
    }
    
    public void testMixed()	{
        
    	int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = -2;
        arr[2] = 3;
        arr[3] = 0;
        arr[4] = -4;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -4;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 3;
        Sortedarr[4] = 5;
        
        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        
        assertArrayEquals("Mixed Test Fails",Sortedarr,arr);
        
        //edited by Bobby
    }
    
    public void testDuplicates(){
        
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 9;
        arr[4] = 8;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 7;
        Sortedarr[1] = 8;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 9;
        
        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        
        assertArrayEquals("Duplicates Test Fails",Sortedarr,arr);
        
        //edited by Bobby
    }
    
}
