
public class HeapSortC {
	// 堆排序算法，按从小到大排的
	// 初始建立一个大顶堆，因为数组中的最大元素总在根节点A[0]中，通过把它与A[n]进行互换，可以把它放在正确的位置
	// 这时从数组中去除第n个节点，这时只有根节点可能是违背最大堆的性质，这时调用一次堆调整方法就可以了，此时堆的规模减少了1
	public static void heapSort(int[] numbers) {
		int len = numbers.length;
		buildMaxHeap(numbers);
		for (int i = len; i >= 1; --i) {

			int temp = numbers[i - 1];
			numbers[i - 1] = numbers[0];
			numbers[0] = temp;
			maxHeapify(numbers, 0, i - 1);// 调用堆调整算法
		}
	}

	/**
	 * 
	 * @param numbers
	 *            待调整数组
	 * @param i
	 *            待调整节点
	 * @param len堆的大小
	 */
	public static void maxHeapify(int[] numbers, int i, int len) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = i;
		if (l < len && numbers[i] < numbers[l]) {
			largest = l;
		}
		if (r < len && numbers[largest] < numbers[r]) {
			largest = r;
		}
		if (largest != i) {
			int temp = numbers[i];
			numbers[i] = numbers[largest];
			numbers[largest] = temp;
			maxHeapify(numbers, largest, len);
		}

	}

	// 使用自底向上的方法利用调后调整堆的过程，把一个大小为n的数组转换为最大堆
	// s数组中第n/2+1,n/2+2....n的元素都是完全二叉树的叶子节点.每个叶子节点都可以看成只包含一个元素的堆
	// 可以对其他非叶子节点（1,2...n/2）都调用一次maxHeapify
	public static void buildMaxHeap(int[] numbers) {
		int heapsize = numbers.length;
		for (int i = heapsize / 2 - 1; i >= 0; --i) {
			maxHeapify(numbers, i);
		}
	}

	public static void maxHeapify(int[] numbers, int i) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = i;
		if (l < numbers.length && numbers[i] < numbers[l]) {
			largest = l;
		}
		if (r < numbers.length && numbers[largest] < numbers[r]) {
			largest = r;
		}
		// 如果不符合最大堆的要求
		if (largest != i) {
			int temp = numbers[i];
			numbers[i] = numbers[largest];
			numbers[largest] = temp;
			maxHeapify(numbers, largest);
		}

	}
}
