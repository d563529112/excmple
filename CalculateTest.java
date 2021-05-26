package junitfirst2020;

import static org.junit.Assert.*;
import org.junit.Test;

/**
* junit的测试方法必须使用@Test注解
* 一个@Test后面跟一个测试用例
* 测试方法必须以public void修饰，并且不包含参数
*/

public class CalculateTest {
	@Test
	public void testAdd() {
	/**
	 * assertEquals这个方法是一个断言方法
	 * 第一个参数表示预期的结果
	 * 第二个参数表示程序的执行结果
	 * 当预期结果与执行结果是一致的时候，则表示单元测试成功
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