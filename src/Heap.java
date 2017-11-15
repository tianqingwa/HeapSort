import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Heap {
	ArrayList<Integer> list = new ArrayList<>();

	// ����i�ڵ�
	public void maxHeapify(int i, int len) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = i;
		if (l < len && list.get(i) < list.get(l)) {
			largest = l;
		}
		if (r < len && list.get(largest) < list.get(r)) {
			largest = r;
		}
		// ������������ѵ�Ҫ��
		if (largest != i) {
			int temp = list.get(i);
			list.set(i, list.get(largest));
			list.set(largest, temp);

			maxHeapify(largest, len);
		}

	}

	public void buildMaxHeap() {
		int heapsize = list.size();
		for (int i = heapsize / 2 - 1; i >= 0; --i) {
			maxHeapify(i, heapsize);
		}
	}

	public boolean isEmpty() {

		return list.isEmpty();
	}

	public int size() {
		return list.size();
	}

	public int get(int i) {
		return list.get(i);
	}

	// ������͵���ˣ����������ظ�����buildmaxheap
	// ��Ԫ��׷�ӵ�
	public void insert(int num) {
		list.add(num);
		buildMaxHeap();

	}

	public int remove(int i) {
		int temp = list.remove(0);
		buildMaxHeap();
		return temp;

	}

	// public void insert(int num) {
	// list
	//
	// }

}
