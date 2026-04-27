public class PracticeProblem {

	public static void main(String args[]) {
		Person main = new Person("John", "Doe", 1, 1, 2000, "123-45-6789");
		Person a = new Person("John", "Doe", 1, 1, 2000, "123-45-6789");
		Person b = new Person("Jim", "Doe", 3, 3, 2003, "345-67-8901");
		main.addSibling(a);
		main.addSibling(b);
	}

}
