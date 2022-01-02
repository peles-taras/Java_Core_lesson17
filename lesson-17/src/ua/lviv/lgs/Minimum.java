package ua.lviv.lgs;


import ua.lviv.lgs.Iterator.Collection;

public class Minimum {
	public static void main(String[] args) {

		Integer[] mas = { 5, 11, 12, 16, 22, 37, 13, 9, 32, 28 };
		Collection collection = new Collection(mas);
		Iterator iterForward = collection.createForward();

		System.out.println("����� �� ������ �������� �����:");
		while (iterForward.hasNext()) {
			Integer next = iterForward.next();
			if (next % 2 != 0) {
				System.out.println(0);
			}
			else {
				System.out.println(next);
			}
		}

		System.out.println();
		System.out.println("³� ���������� �� ������� �������� ����� ���� �����:");

		Iterator iterBackward = collection.createBackward();

		while (iterBackward.hasNext()) {
			System.out.println(iterBackward.next());
		}
	}
}
