package junit01;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class test {
	
	String equilateral = "等边三角形";
	String isosceles = "等腰三角形";
	String scalene = "不规则三角形";
	String err = "不能构成三角形";
	String result;
	
	junit01 A = new junit01();
			
	@Test
	public void test1(){
		String result = A.triangle(1,1,1);
		assertEquals(equilateral,result);
	}
	
	@Test
	public void test2(){
		String result = A.triangle(4,3,3);
		assertEquals(isosceles,result);
	}

	@Test
	public void test3(){
		String result = A.triangle(2,3,4);
		assertEquals(scalene,result);
	}
	
	@Test
	public void test4(){
		String result = A.triangle(-1,3,4);
		assertEquals(err,result);
	}
	
	@Test
	public void test5(){
		String result = A.triangle(1,2,3);
		assertEquals(err,result);
	}

}
