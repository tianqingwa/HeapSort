
public class PriorityQueue {

	public Heap heap = new Heap();

	// 返回最大元素
	public int heapMax() {
		if (!heap.isEmpty()) {
			return heap.get(0);
		}
		return -1;
	}

	// 返回并删除最大元素
	public int heapExtractMax() {
		if (!heap.isEmpty()) {
			int temp=heap.remove(0);
			heap.maxHeapify(0, heap.size());
			return temp;
		}
		return -1;
	}

	// 插入一个元素
	public void insert(int num) {
		heap.insert(num);
	}

}
