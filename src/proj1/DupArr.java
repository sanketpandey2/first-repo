package proj1;

public class DupArr {


	public static void main(String[] args) 

	{
		// TODO Auto-generated method stub



		int[] arr= {1,5,6,8,5,1,3,3};






		for(int i=0;i<arr.length;i++)



		{
			boolean flag= false;
			for(int j=0;j<i;j++)
			{
				if (arr[i]==arr[j]) {
					flag=true;
					break;

				}
			}
				if(flag==false) {
					System.out.println(arr[i]);
				}
			

		} 
	}


}

