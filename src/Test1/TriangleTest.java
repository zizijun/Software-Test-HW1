package Test1;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mockit.Mock;
import mockit.NonStrictExpectations;
import model.Triangle;
import model.TriangleChecker;


public class TriangleTest {
	
	final Triangle triangle = new Triangle();
	TriangleChecker checker;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testIsTriangle1() {
		boolean result = triangle.isTriangle(-1, -1, -1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle2() {
		boolean result = triangle.isTriangle(-1, -1, 0);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle3() {
		boolean result = triangle.isTriangle(-1, -1, 1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle4() {
		boolean result = triangle.isTriangle(-1, 0, -1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle5() {
		boolean result = triangle.isTriangle(-1, 0, 0);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle6() {
		boolean result = triangle.isTriangle(-1, 0, 1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle7() {
		boolean result = triangle.isTriangle(-1, 1, -1);
		assertEquals(false, result);
	}
	@Test
	public final void testIsTriangle8() {
		boolean result = triangle.isTriangle(-1, 1, 0);
		assertEquals(false, result);
	}
	@Test
	public final void testIsTriangle9() {
		boolean result = triangle.isTriangle(-1, 1, 1);
		assertEquals(false, result);
	}
	@Test
	public final void testIsTriangle10() {
		boolean result = triangle.isTriangle(0, -1, -1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle11() {
		boolean result = triangle.isTriangle(0, -1, 0);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle12() {
		boolean result = triangle.isTriangle(0, -1, 1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle13() {
		boolean result = triangle.isTriangle(0, 0, -1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle14() {
		boolean result = triangle.isTriangle(0, 0, 0);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle15() {
		boolean result = triangle.isTriangle(0, 0, 1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle16() {
		boolean result = triangle.isTriangle(0, 1, -1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle17() {
		boolean result = triangle.isTriangle(0, 1, 0);
		assertEquals(false, result);
	}

	@Test
	public final void testIsTriangle18() {
		boolean result = triangle.isTriangle(0, 1, 1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle19() {
		boolean result = triangle.isTriangle(1, -1, -1);
		assertEquals(false, result);
	}
	@Test
	public final void testIsTriangle20() {
		boolean result = triangle.isTriangle(1, -1, 0);
		assertEquals(false, result);
	}
	@Test
	public final void testIsTriangle21() {
		boolean result = triangle.isTriangle(1, -1, 1);
		assertEquals(false, result);
	}
	
	@Test
	public final void testIsTriangle22() {
		boolean result = triangle.isTriangle(1, 0, -1);
		assertEquals(false, result);
	}
	@Test
	public final void testIsTriangle23() {
		boolean result = triangle.isTriangle(1, 0, 0);
		assertEquals(false, result);
	}
	@Test
	public final void testIsTriangle24() {
		boolean result = triangle.isTriangle(1, 0, 1);
		assertEquals(false, result);
	}
	@Test
	public final void testIsTriangle25() {
		boolean result = triangle.isTriangle(1, 1, -1);
		assertEquals(false, result);
	}
	@Test
	public final void testIsTriangle26() {
		boolean result = triangle.isTriangle(1, 1, 0);
		assertEquals(false, result);
	}
	@Test
	public final void testIsTriangle27() {
		boolean result = triangle.isTriangle(1, 1, 1);
		assertEquals(true, result);
	}

	@Test
	public final void testGetArea1() {
		// 使用 EasyMock 生成 Mock 对象
		checker = EasyMock.createMock(TriangleChecker.class);
		
		//设定 Mock 对象的预期行为和输出
		EasyMock.expect(checker.isTriangle(-1, -1, -1)).andReturn(false).times(1);
		
		//将 Mock 对象切换到 Replay 状态
		EasyMock.replay(checker);
		
		//调用 Mock 对象方法进行单元测试
		triangle.setChecker(checker);;
		
		//对 Mock 对象的行为进行验证
		Assert.assertEquals(-1, (int)triangle.getArea(-1, -1, -1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea2() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(-1, -1, 0)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(-1, -1, 0));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea3() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(-1, -1, -1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(-1, -1, -1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea4() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(-1, 0, -1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(-1, 0, -1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea5() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(-1, 0, 0)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(-1, 0, 0));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea6() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(-1, 0, 1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(-1, 0, 1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea7() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(-1, 1, -1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(-1, 1, -1));
		EasyMock.verify(checker);
	}
	@Test
	public final void testGetArea8() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(-1, 1, 0)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(-1, 1, 0));
		EasyMock.verify(checker);
	}
	@Test
	public final void testGetArea9() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(-1, 1, 1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(-1, 1, 1));
		EasyMock.verify(checker);
	}
	@Test
	public final void testGetArea10() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(0, -1, -1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(0, -1, -1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea11() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(0, -1, 0)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(0, -1, 0));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea12() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(0, -1, 1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(0, -1, 1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea13() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(0, 0, -1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(0, 0, -1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea14() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(0, 0, 0)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(0, 0, 0));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea15() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(0, 0, 1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(0, 0, 1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea16() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(0, 1, -1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(0, 1, -1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea17() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(0, 1, 0)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(0, 1, 0));
		EasyMock.verify(checker);
	}

	@Test
	public final void testGetArea18() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(0, 1, 1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(0, 1, 1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea19() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(1, -1, -1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(1, -1, -1));
		EasyMock.verify(checker);
	}
	@Test
	public final void testGetArea20() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(1, -1, 0)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(1, -1, 0));
		EasyMock.verify(checker);
	}
	@Test
	public final void testGetArea21() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(1, -1, 1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(1, -1, 1));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testGetArea22() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(1, 0, -1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(1, 0, -1));
		EasyMock.verify(checker);
	}
	@Test
	public final void testGetArea23() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(1, 0, 0)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(1, 0, 0));
		EasyMock.verify(checker);
	}
	@Test
	public final void testGetArea24() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(1, 0, 1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(1, 0, 1));
		EasyMock.verify(checker);
	}
	@Test
	public final void testGetArea25() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(1, 1, -1)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(1, 1, -1));
		EasyMock.verify(checker);
	}
	@Test
	public final void testGetArea26() {
		checker = EasyMock.createMock(TriangleChecker.class);
		EasyMock.expect(checker.isTriangle(1, 1, 0)).andReturn(false).times(1);
		EasyMock.replay(checker);
		triangle.setChecker(checker);;
		Assert.assertEquals(-1, (int)triangle.getArea(1, 1, 0));
		EasyMock.verify(checker);
	}
	@Test
	public final void testGetArea27() {
		// 使用 EasyMock 生成 Mock 对象
		checker = EasyMock.createMock(TriangleChecker.class);
		
		//设定 Mock 对象的预期行为和输出
		EasyMock.expect(checker.isTriangle(3, 4, 5)).andReturn(true).times(1);
		
		//将 Mock 对象切换到 Replay 状态
		EasyMock.replay(checker);
		
		//调用 Mock 对象方法进行单元测试
		triangle.setChecker(checker);;
		
		//对 Mock 对象的行为进行验证
		Assert.assertEquals(6, (int)triangle.getArea(3, 4, 5));
		EasyMock.verify(checker);
		
	}
	
	@Mock
	public void isTriangle_stub1(final double a, final double b, final double c) {
		new NonStrictExpectations(triangle) {
			{
				triangle.isTriangle(a, b, c);
				result = false;// assume it is not a triangle
				times = 1;
			}
		};
	}

	@Mock
	public void isTriangle_stub2(final double a, final double b, final double c) {
		new NonStrictExpectations(triangle) {
			{
				triangle.isTriangle(a, b, c);
				result = true;// assume it is a triangle
				times = 1;
			}
		};
	}

}
