package Java08;

class CTest {
	void test(int a) {
		System.out.print(a);
		if (a % 2 == 1)
			System.out.println(",���Ƭ��_��");
		else if (a == 0)
			System.out.println(",���Ƭ� 0");
		else
			System.out.println(",���Ƭ�����");

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
