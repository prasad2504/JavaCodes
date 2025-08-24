package example;



public class SecondHighest {

	public static void main(String[] args) {
		int[] arr= {2,3,1,60,5,9,-80,-1,6 ,11 ,65 ,78 ,-100};
		int sh=0,max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				sh=max;
//				System.out.println(sh);
				max=arr[i];
//				System.out.println(max);
			}
			if(arr[i]>sh && arr[i]!=max ) {
				sh=arr[i];
			}
		}
		System.out.println(sh);
//		System.out.println(max);
		
	}

}
