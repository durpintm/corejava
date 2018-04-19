package array;

public class Arraywithmethod {
public static void main(String[] args) {
	int x[]={12,34,343,5,66,3};
	
int smallvalue=	findsmall(x);
	System.out.println(smallvalue);
	//sumofarray(x);
	//sumofarray(new int[]{12,34,343,56,66,76});
	
	
}
static void sumofarray( int data[]){
	
	int s=0;
	for (int i : data) {
		s=s+i;
	}
	
	System.out.println("total: "+s);
}

static int findsmall(int arr[]){
	
	int a=arr[0];
	for (int i = 1; i < arr.length; i++) {
		
		if(a>arr[i]){
			a=arr[i];
			
		}
		
	}
	return a;
}
}
