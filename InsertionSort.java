
public class InsertionSort {
	
	static void sort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
			int key=a[i];
			while(j>=0 && a[j]>a[i])
			{
				a[j+1]=a[j];
				j=j-1;
						
			}
			
			a[j+1]=key;
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
