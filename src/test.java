
public class test {

	public static void main(String[] args) {
		int []numbers={1,3,5,2,4,7,6,9,10};
		HeapSortC.buildMaxHeap(numbers);
		for(int i=0;i<numbers.length;++i){
			System.out.println(numbers[i]);
		}
		HeapSortC.heapSort(numbers);
		System.out.println("=======");
		for(int i=0;i<numbers.length;++i){
			System.out.println(numbers[i]);
		}
	}
}
