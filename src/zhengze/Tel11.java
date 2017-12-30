package zhengze;

import org.junit.Test;

public class Tel11 {
	@Test
	public void testTel11() throws Exception {
		String regex = "^1[3458]\\d{9}$";
		System.out.println("13922201945".matches(regex));
	}
}
