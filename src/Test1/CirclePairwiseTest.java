package Test1;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Circle;
import model.CircleChecker;

public class CirclePairwiseTest {
	
	Circle circle = null;
	CircleChecker checker;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		circle = new Circle();
		checker = EasyMock.createMock(CircleChecker.class);
		circle.setChecker(checker);
	}

	@After
	public void tearDown() throws Exception {
		circle = null;
		checker = null;
	}

	@Test
	public final void testIsInCircle1() {
		int result = circle.isInCircle(0, 0, 0, 0, 0);
		assertEquals(-1, result);
	}
	
	@Test
	public final void testIsInCircle2() {
		int result = circle.isInCircle(0, 0, 0, 1, 1);
		assertEquals(0, result);
	}
	@Test
	public final void testIsInCircle3() {
		int result = circle.isInCircle(0, 0, 0, 1, 2);
		assertEquals(1, result);
	}
	@Test
	public final void testIsInCircle4() {
		int result = circle.isInCircle(0, 0, 0, 5, 3);
		assertEquals(2, result);
	}
	@Test
	public final void testIsInCircle5() {
		int result = circle.isInCircle(0, 0, 0, 0, -1);
		assertEquals(-1, result);
	}

	@Test
	public final void testTangent1() {
		EasyMock.expect(checker.isInCircle(0, 0, 0, 0, 0)).andReturn(-1);
		EasyMock.replay(checker);
		Assert.assertEquals(-1, (int)circle.tangent(0, 0, 0, 0, 0));
		EasyMock.verify(checker);
	}
	@Test
	public final void testTangent2() {
		EasyMock.expect(checker.isInCircle(0, 0, 0, 1, 1)).andReturn(0);
		EasyMock.replay(checker);
		Assert.assertEquals(0, (int)circle.tangent(0, 0, 0, 1, 1));
		EasyMock.verify(checker);
	}
	@Test
	public final void testTangent3() {
		EasyMock.expect(checker.isInCircle(0, 0, 0, 1, 2)).andReturn(1);
		EasyMock.replay(checker);
		Assert.assertEquals(-1, (int)circle.tangent(0, 0, 0, 1, 2));
		EasyMock.verify(checker);
	}
	@Test
	public final void testTangent4() {
		EasyMock.expect(checker.isInCircle(0, 0, 0, 5, 3)).andReturn(2);
		EasyMock.replay(checker);
		Assert.assertEquals(4, (int)circle.tangent(0, 0, 0, 5, 3));
		EasyMock.verify(checker);
	}
	
	@Test
	public final void testTangent5() {
		EasyMock.expect(checker.isInCircle(0, 0, 0, 0, -1)).andReturn(-1);
		EasyMock.replay(checker);
		Assert.assertEquals(-1, (int)circle.tangent(0, 0, 0, 0, -1));
		EasyMock.verify(checker);
	}

}
