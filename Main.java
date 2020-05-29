public class Main {

	private String name; // atrribute
	private int age;

	public Main() {
		this.name = "";
		this.age = 0;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public static void main(String args[]) {
		Main m = new Main();

		String name = "Yash";
		int age = 26;
		m.setName(name);
		m.setAge(age);

		System.out.println(m.getName());
		System.out.println(m.getAge());

	}
}


