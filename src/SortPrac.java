
public class SortPrac {
	public static void main(String args[]){
		int arr[] = {3, 4, 5, 2, 6, 1, 9, 8};
		SortPrac sortPrac = new SortPrac();
		sortPrac.insertSort(arr);
		for(int i: arr){
			System.out.print(i+", ");
		}
	}
	
	//�������� : ���� ���� ���� ã�� ������ ���� �ٲ��ش�. O(n^2)
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
	
	//�������� : �ڱ⺸�� ū���� �� ���������� �о������. O(n^2)
	public void insertSort(int arr[]){ 
		for(int i=1; i<arr.length; i++){
			int value = arr[i];
			int index;
			for(index=i-1; index>=0 && arr[index]>value /*arr[i]�̸� arr[i]���� ��� �ٲ�Ƿ� �̷��� �ϸ� �ȵȴ�*/; index--){
				arr[index+1] = arr[index];
							
			}
			arr[index+1] = value;
		}		
	}

}
