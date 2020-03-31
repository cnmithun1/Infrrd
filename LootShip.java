import java.util.Arrays;

public class LootShip{

	public static void main (String[] args){

		int[] firstArray = {7,6,5,8,4,7,10,9};
		//int[] firstArray = {547,1,12,5,10,8,14,58,10,47																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						};
		System.out.println("All Ships" + Arrays.toString(firstArray));

		int[] newArray = new int[firstArray.length -1];
		int days = 0;

		for(int i=0,k=0;i<firstArray.length;i++){
			
			
		if(i>0){
		if(firstArray[i] > firstArray[i-1]){
		continue;
		}
		}	
														
		newArray[k++]= firstArray[i];
		
		}
		days = days+1;
		
		for(int j=0,m=0 ; j<newArray.length;j++) {
			if(j>0){																																																																																														
				if(newArray[j] > newArray[j-1]){
				continue;
				}
				}	
			
			newArray[m++]= newArray[j];
		}
		days = days+1;

		System.out.println("Ships left after destroying" + Arrays.toString(newArray));
		System.out.println("No of Days "+ days);


	}

}
