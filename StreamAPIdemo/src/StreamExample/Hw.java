package StreamExample;

public class Hw {

	
	public static void main(String[] args) {
		
		
		int arr []= {10,20,30,40,50,60,70};
		int max=0;
		int secondmax=0;
				
		
//		for(int i:arr) {
//			System.out.print(i + " ");w
//		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {		
				System.out.println(max);
				
				secondmax=max;
				
				max=arr[i];
			}		
						
	}
		
		
		System.out.println(secondmax);

	}
}
