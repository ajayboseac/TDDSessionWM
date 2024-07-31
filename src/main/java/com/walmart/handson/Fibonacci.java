package com.walmart.handson;

public class Fibonacci {

    int secondLast = 0;
    int last = 1;
    int counter =0;

    int getNext(){
        if(counter++==0){
            return 0;
        }
        else if(counter++ == 1){
            return 1;
        }
        int nextValue = this.last+this.secondLast;
        this.secondLast = this.last;
        this.last = nextValue;
        counter++;
        return nextValue;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int counter =0;
        while (counter ++ < 100){
            System.out.println(fibonacci.getNext());
        }
    }

}
