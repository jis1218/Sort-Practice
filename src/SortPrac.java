
public class SortPrac {
	public static void main(String args[]){
		int arr[] = {3, 4, 5, 2, 6, 1, 9, 8};
		SortPrac sortPrac = new SortPrac();
		sortPrac.insertSort(arr);
		for(int i: arr){
			System.out.print(i+", ");
		}
	}
	
	//선택정렬 : 가장 작은 수를 찾아 지정된 수와 바꿔준다. O(n^2)
	public void selectionSort(int arr[]){
		for(int i=0; i<arr.length-1; i++){
			int min = arr[i];
			int index = i;
			for(int j=i+1; j<arr.length; j++){
				if(min>arr[j]){
					min=arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
			
		}
	}
	
	//삽입정렬 : 자기보다 큰수는 다 오른쪽으로 밀어버린다. O(n^2)
	public void insertSort(int arr[]){ 
		for(int i=1; i<arr.length; i++){
			int value = arr[i];
			int index;
			for(index=i-1; index>=0 && arr[index]>value /*arr[i]이면 arr[i]값이 계속 바뀌므로 이렇게 하면 안된다*/; index--){
				arr[index+1] = arr[index];
							
			}
			arr[index+1] = value;
		}		
	}

}
