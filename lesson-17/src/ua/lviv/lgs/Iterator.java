package ua.lviv.lgs;

public interface Iterator {

	boolean hasNext();

	Integer next();

	class Collection {
		private static Integer[] arr;

		Collection(Integer[] arr) {
			Collection.arr = arr;

		}

		public class Forward implements Iterator {
			private int count = 0;

			@Override
			public boolean hasNext() {

				return count < arr.length;
			}

			@Override
			public Integer next() {
				return arr[count++];
			}

		}

		public Forward createForward() {
			return new Forward();
		}

		public class Backward implements Iterator {
			private int count = arr.length - 1;

			@Override
			public boolean hasNext() {
				return count >= 0;
			}

			@Override
			public Integer next() {
				count = count - 2;
				return arr[count + 2];
			}

		}

		public Backward createBackward() {
			return new Backward();
		}

		public Iterator checkThirdElement() {
			return new Iterator() {
				private int count = arr.length - 1;

				@Override
				public boolean hasNext() {
					return count >= 0;
				}

				@Override
				public Integer next() {
					count = count - 3;
					return arr[count + 3];
				}

			};
		}

		public Iterator checkFifthElement() {
			class localClass implements Iterator {
				int count = 0;

				@Override
				public boolean hasNext() {
					return count < arr.length;
				}

				@Override
				public Integer next() {
					count = count + 4;
					return arr[count++];
				}

			}
			return new localClass();
		}

		public static class staticClass implements Iterator {
			int count = 0;

			@Override
			public boolean hasNext() {
				return count < arr.length;
			}

			@Override
			public Integer next() {
				count = count + 1;
				return arr[count++];
			}

		}

		public Iterator createStaticClass() {
			return new staticClass();
		}
	}

}
