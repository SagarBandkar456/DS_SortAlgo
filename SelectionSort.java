
public class SelectionSort {

	static void sort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[minIndex])
				{
					minIndex=j;
				}
			}
			
			int temp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
	}
	
	static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,0,5,50,20,100};
		sort(a);
		print(a);
	}

}
