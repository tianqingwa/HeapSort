
public class HeapSortC {
	// �������㷨������С�����ŵ�
	// ��ʼ����һ���󶥶ѣ���Ϊ�����е����Ԫ�����ڸ��ڵ�A[0]�У�ͨ��������A[n]���л��������԰���������ȷ��λ��
	// ��ʱ��������ȥ����n���ڵ㣬��ʱֻ�и��ڵ������Υ�����ѵ����ʣ���ʱ����һ�ζѵ��������Ϳ����ˣ���ʱ�ѵĹ�ģ������1
	public static void heapSort(int[] numbers) {
		int len = numbers.length;
		buildMaxHeap(numbers);
		for (int i = len; i >= 1; --i) {

			int temp = numbers[i - 1];
			numbers[i - 1] = numbers[0];
			numbers[0] = temp;
			maxHeapify(numbers, 0, i - 1);// ���öѵ����㷨
		}
	}

	/**
	 * 
	 * @param numbers
	 *            ����������
	 * @param i
	 *            �������ڵ�
	 * @param len�ѵĴ�С
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

	// ʹ���Ե����ϵķ������õ�������ѵĹ��̣���һ����СΪn������ת��Ϊ����
	// s�����е�n/2+1,n/2+2....n��Ԫ�ض�����ȫ��������Ҷ�ӽڵ�.ÿ��Ҷ�ӽڵ㶼���Կ���ֻ����һ��Ԫ�صĶ�
	// ���Զ�������Ҷ�ӽڵ㣨1,2...n/2��������һ��maxHeapify
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
		// ������������ѵ�Ҫ��
		if (largest != i) {
			int temp = numbers[i];
			numbers[i] = numbers[largest];
			numbers[largest] = temp;
			maxHeapify(numbers, largest);
		}

	}
}
