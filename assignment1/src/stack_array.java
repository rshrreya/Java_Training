public class stack_array {
	static  int arr[]=new int[30], top = 0;
	
    static void display(){
		for(int i=0;i<top;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	 static void push(int a)
	{
		arr[top++]=a;
	}
	
	static void pop()
	{
		top--;
	}
	
	public static void main(String[] args) {
	
		push(10);
		push(20);
		push(78);
		display();
		System.out.println("--------------------");
		pop();
		pop();
		display();
		System.out.println("--------------------");
		push(2772);
		display();

	}

}
