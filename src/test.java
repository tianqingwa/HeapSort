
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

		// 测试heap
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

		// 测试优先队列
		int[] numbers3 = { 1, 3, 5, 2, 4, 7, 6, 9, 10 };
		PriorityQueue queue = new PriorityQueue();
		for (int i = 0; i < numbers3.length; ++i) {
			queue.insert(numbers3[i]);
		}
		//输入最大值
		System.out.println("输出最大值并删除："+queue.heapExtractMax());
		//输出最大值
		System.out.println("输出最大值："+queue.heapMax());
		
	}
}
