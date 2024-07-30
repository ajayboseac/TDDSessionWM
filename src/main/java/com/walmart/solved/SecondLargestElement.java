package com.walmart.solved;


public class SecondLargestElement {

    public int findSecondLargest(int [] arr){
      if(arr.length ==0){
        throw new IllegalArgumentException("Array Length should at least be 1");
      }
      int largest = arr[0];
      int secondLargest = arr[0];
      for(int element : arr){
        if(element> largest){
          secondLargest = largest;
          largest = element;
        }else if(element > secondLargest){
          secondLargest = largest;
        }
      }
      return secondLargest;
    }

}
