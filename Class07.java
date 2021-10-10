package Java08;

class CTest {
	void test(int a) {
		System.out.print(a);
		if (a % 2 == 1)
			System.out.println(",计计");
		else if (a == 0)
			System.out.println(",计 0");
		else
			System.out.println(",计案计");

	}
}

public class Class07 {

	public static void main(String[] args) {
		CTest ct = new CTest();
		ct.test(3);
		ct.test(8);
		ct.test(0);

	}

}
