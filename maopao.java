class maopao{
	public static void bubbleSort(int [] arr)
	{
	       for(int x=0;x<arr.length-1;x++)
		{
		      for(int y=0;y<arr.length-x-1;y++)
			if(arr[y]>arr[y+1])
			{
			       int temp = arr[y];
			       arr[y]  =  arr[y+1];
			       arr[y+1] =  temp;
			}
		}
	}
	
	public static void main(String[] args)
	{
		int [] arr = {5,7,3,8,9,2,1};
		//����ǰ
		printArray(arr);
		//����
		bubbleSort(arr);
		//�����
		printArray(arr);
	}

	public static void printArray(int [] arr)
	{
		System.out.print("[");
		for(int x=0;x<arr.length;x++)
		{
		       if(x!=arr.length-1)
			System.out.print(arr[x]+",");
		       else
			System.out.println(arr[x]+"]");
		}
	}
}