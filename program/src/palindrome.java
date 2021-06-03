
public class palindrome {

	public static void main(String[] args) {
String arr[]= {"surya","liril","adarsh"};


StringBuffer brr[]=new StringBuffer[arr.length]; //decleration to StringBuffer array


for(int i=0;i<arr.length;i++)
{
	brr[i]=new StringBuffer(arr[i]);    // initializing string array to buffer array;
}



for(int i=0;i<arr.length;i++)        // to find palindrome string
{

	if(brr[i].reverse().toString().equals(arr[i]))
	{
		System.out.println(arr[i]);
	}
	
}

	}

}
