package com.myLearning.arrayBasic;

import java.util.Scanner;

public class SecondMaximum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the size of array:");
	    int len=sc.nextInt();
	    int a[]=new int[len];
	    System.out.print("Enter the array elements:");
	    for(int i=0;i<len;i++)
	    	a[i]=sc.nextInt();
	    sc.close();
        int max=a[0],max2=a[0];
       
        for(int i=1;i<a.length;i++){
            if(max<a[i]) {
            	max=a[i];
            }   
        }
        for(int i=0;i<len;i++) {
        	if(max2<a[i] && a[i]<max)
        		max2=a[i];
        }
        System.out.print("Second maximum element is: "+max2);
        sc.close();
    }
}
