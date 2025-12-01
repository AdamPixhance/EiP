
public class LinkedQueue implements Queue {
	// The Entry class for each object
	public static class Entry {
		Entry next;
		int value;

		Entry(int value) {
			this.value = value;
		}
	}

	// my first element
	private Entry head;
	// my last element
	private Entry tail;

	// my empty constructor;
	public LinkedQueue() {
	}

	@Override
	public void append(int value) {
		Entry newEntry = new Entry(value);
		if (isEmpty()) {
			head = newEntry;
			tail = newEntry;
		} else {
			tail.next = newEntry;
			tail = newEntry;
		}
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void remove() {
		if (!isEmpty()) {
			head = head.next;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public int peek() {
		if (!isEmpty()) {
			return head.value;
		}
		return EMPTY_VALUE;
	}

	// a private size counter;
	private int size() {
		int size = 0;
		if (isEmpty()) {
			return 0;
		}
		Entry currentEntry = head;
		while (currentEntry != null) {
			size++;
			currentEntry = currentEntry.next;
		}
		return size;
	}

	@Override
	public int[] toArray() {
		if (isEmpty()) {
			int[] emptyArray = new int[0];
			return emptyArray;
		}
		int[] resArray = new int[size()];
		Entry currentEntry = head;
		for (int i = 0; i < resArray.length; i++) {
			resArray[i] = currentEntry.value;
			currentEntry = currentEntry.next;
		}
		return resArray;
	}
}
