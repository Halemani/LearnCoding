package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here man
        int[] myArray = {10, -45, 15, 2, 3, -3, 79};
        for(int unSortedIndex=myArray.length-1; unSortedIndex>0; unSortedIndex--){
            for(int i=0; i<unSortedIndex; i++){
                if(myArray[i] > myArray[i+1]){
                    int temp = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = temp;
                }
            }
        }

        for(int i=0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
