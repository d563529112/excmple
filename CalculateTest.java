package junitfirst2020;

import static org.junit.Assert.*;
import org.junit.Test;

/**
* junit�Ĳ��Է�������ʹ��@Testע��
* һ��@Test�����һ����������
* ���Է���������public void���Σ����Ҳ���������
*/

public class CalculateTest {
	@Test
	public void testAdd() {
	/**
	 * assertEquals���������һ�����Է���
	 * ��һ��������ʾԤ�ڵĽ��
	 * �ڶ���������ʾ�����ִ�н��
	 * ��Ԥ�ڽ����ִ�н����һ�µ�ʱ�����ʾ��Ԫ���Գɹ�
	 **/
		assertEquals(4, new Calculate().add(1, 3));
	}
	@Test
	public void testSubtract1() {
		assertEquals(4, new Calculate().subtract(9, 5));
		System.out.println("sub2");
	}
	@Test
	public void testSubtract2() {
		assertEquals(5, new Calculate().subtract(10, 5));
		System.out.println("sub2");
	}
	@Test
	public void testMultiply() {
		assertEquals(6, new Calculate().multiply(2, 3));
	}
	@Test
	public void testDivide() {
		assertEquals(3, new Calculate().divide(9, 3));
	}
}