package myPracticeProg;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num=new int[5];
		int []num1={10,20,34,56,123,52,45};
		for(int i=0;i<num.length;i++)
		{
			num[i]=10*i;
		}
		for(int i=0;i<=num.length;i++)
		{
			System.out.println(num[i]);
			
		}
		System.out.println("#################################");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("Using toString > "+Arrays.toString(num));
	
	for(int i:num1)
	{
		System.out.println(i);
	
	}
	System.out.println("######################");
	for(int i: num){
		System.out.println(i);
	}
}
}