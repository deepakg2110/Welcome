public class Bubble
{
	static void bubble(int[] arr)
	{
		int n=arr.length;
		int temp=0;
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<(n); j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{	
		int i;
		int arr[]={3, 60, 35, 2, 45, 320, 5};
		System.out.println("Array before Bubble sort");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bubble(arr);
		System.out.println("Array after bubble sort");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}