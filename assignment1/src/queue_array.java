
public class queue_array {
	
	static int arr[]=new int[30], r=0,f=0;
	
	
	static void enqueue(int a){
		
		arr[r++]=a;
		if(r==30) r=0;
	}
	
	static void dequeue(){
		
		f++;
		if(f==30) f=0;
		
	}
	
	static void display()
	{
		int i;
		for(i=f;i<r;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		enqueue(63);
		enqueue(87);
		enqueue(90);
		display();
		System.out.println("--------------------");
		dequeue();
		dequeue();
		display();
		System.out.println("--------------------");
		enqueue(87);
		dequeue();
		display();
		
		

	}

}
