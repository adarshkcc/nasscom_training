
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {12,5,32,1,45,7};

int min=arr[0];
for(int i=1;i<arr.length;i++)
{
	if(min>arr[i] )
		min=arr[i];
}
System.out.println(min);
	}

}
