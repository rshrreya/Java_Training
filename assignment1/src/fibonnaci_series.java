public class fibonnaci_series {
	
	static int fibonacci(int n)
    {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

	public static void main(String[] args) {
		
		 int n ;
		 for(n=0;n<=10;n++)
		 {
			 
			 System.out.println(fibonacci(n));
			 
		 }
		
	}

}
