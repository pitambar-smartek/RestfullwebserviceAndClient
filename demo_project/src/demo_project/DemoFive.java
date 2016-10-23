package demo_project;

public class DemoFive {
	
	public int[] getSortedArray(int arr[]){
		  for(int i=0; i<arr.length;i++){
		     for(int j=1;j<(arr.length);j++){
			   int temp=
			   if(arr[i]>arr[j]){
			   arr[i]=temp-arr[i];
			   arr[j]=temp-arr[j];
			   }
			 }
		  }
		  return arr;
		  
		}
	public static void main(String[] args) {
		int arr[]={5,10,6,11,3};
		DemoFive demo=new DemoFive();
		int res[]=demo.getSortedArray(arr);
		for(int i:res){
			System.out.println(i);
		}
	}
	}