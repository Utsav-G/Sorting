import java.util.Scanner;
public class BubbleSort {
	
	
	static void bsort(int[] arr) {
		int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
        	for(int j=1; j < (n-i); j++){  
        		if(arr[j-1] > arr[j]){    
        			temp = arr[j-1];  
        			arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
                          
            }  
         }  
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		bsort(arr);
		for(int i=0; i < arr.length; i++){  
			System.out.print(arr[i] + " ");  
		} 
		

	}

}
