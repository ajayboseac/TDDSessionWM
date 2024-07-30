package com.walmart.solved;

import junit.framework.TestCase;
import org.junit.Test;

import com.walmart.solved.SecondLargestElement;

import static junit.framework.Assert.assertEquals;


public class SecondLargestElementTest {


    @Test
    public void shouldReturnSecondLargestElementOnValidArray(){
        int[] arr = new int[]{1,2,3};
        int result = new SecondLargestElement().findSecondLargest(arr);
        assertEquals(result, 2);
    }

    @Test
    public void shouldWorkWhenSizeIsOne(){
        int[] arr = new int[]{1};
        int result = new SecondLargestElement().findSecondLargest(arr);
        assertEquals(result, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldWorkWhenSizeIsZero(){
        int[] arr = new int[]{};
        new SecondLargestElement().findSecondLargest(arr);
    }

}
