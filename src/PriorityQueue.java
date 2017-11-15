
public class PriorityQueue {

	public Heap heap = new Heap();

	// �������Ԫ��
	public int heapMax() {
		if (!heap.isEmpty()) {
			return heap.get(0);
		}
		return -1;
	}

	// ���ز�ɾ�����Ԫ��
	public int heapExtractMax() {
		if (!heap.isEmpty()) {
			int temp=heap.remove(0);
			heap.maxHeapify(0, heap.size());
			return temp;
		}
		return -1;
	}

	// ����һ��Ԫ��
	public void insert(int num) {
		heap.insert(num);
	}

}
