package com.sortingAlgorithm;

public class BubbleSort 
{
	
	public void test()
	{
		int temp=0;
		int arr[]= {50,20,80,40,60};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
					
			}
		}
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

	public static void main(String[] args)
	{
		BubbleSort obj=new BubbleSort();
		obj.test();

	}

}
