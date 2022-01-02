package ua.lviv.lgs;

import ua.lviv.lgs.Iterator.Collection;

public class Maximum {

	public static void main(String[] args) {

		Integer[] mas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30 };
		Collection collection = new Collection(mas);

		Iterator checkThird = collection.checkThirdElement();
		System.out.println("Кожен третій непарний елмент:");
		while (checkThird.hasNext()) {
			Integer next = checkThird.next();
			if (next % 2 != 0) {
				System.out.println(next);
			}
		}
		System.out.println();
		System.out.println("Кожен парний п'ятий елемент із різницею в 100:");

		Iterator checkFifth = collection.checkFifthElement();
		while (checkFifth.hasNext()) {
			Integer next = checkFifth.next();
			if (next % 2 == 0) {
				next = next - 100;
				System.out.println(next);
			}
		}
		System.out.println();
		System.out.println("Кожен другий елемент із заміною парних на непарні:");

		Iterator checkSecond = collection.createStaticClass();
		while (checkSecond.hasNext()) {
			Integer next = checkSecond.next();
			if (next % 2 == 0) {
				next = next + 1;
				System.out.println(next);
			}
			
		}

	}
}
