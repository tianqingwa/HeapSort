
public class test {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5, 2, 4, 7, 6, 9, 10 };
		HeapSortC.buildMaxHeap(numbers);
		for (int i = 0; i < numbers.length; ++i) {
			System.out.println(numbers[i]);
		}
		// HeapSortC.heapSort(numbers);
		// System.out.println("=======");
		// for(int i=0;i<numbers.length;++i){
		// System.out.println(numbers[i]);
		// }

		// ����heap
		int[] numbers2 = { 1, 3, 5, 2, 4, 7, 6, 9, 10 };
		Heap heap = new Heap();
		for (int i = 0; i < numbers2.length; ++i) {
			heap.insert(numbers2[i]);
		}
		heap.buildMaxHeap();
		System.out.println("==========");
		for (int i = 0; i < heap.size(); ++i) {
			System.out.println(heap.get(i));
		}

		// �������ȶ���
		int[] numbers3 = { 1, 3, 5, 2, 4, 7, 6, 9, 10 };
		PriorityQueue queue = new PriorityQueue();
		for (int i = 0; i < numbers3.length; ++i) {
			queue.insert(numbers3[i]);
		}
		//�������ֵ
		System.out.println("������ֵ��ɾ����"+queue.heapExtractMax());
		//������ֵ
		System.out.println("������ֵ��"+queue.heapMax());
		
	}
}
