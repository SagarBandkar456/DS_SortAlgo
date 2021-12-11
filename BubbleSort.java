
public class BubbleSort {

	static void sort(int a[])
	{
		int i,j=0;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
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
