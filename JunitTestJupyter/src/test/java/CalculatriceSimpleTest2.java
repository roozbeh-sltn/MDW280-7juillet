import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatriceSimpleTest2 {
	
	CalculatriceSimple cal;
	@BeforeEach
	public void ini() {
		
		cal = new CalculatriceSimple();
		System.out.println("une instance ");
	}
	
	@AfterEach
	public void ini2() {
		
		System.out.println("après le test ....");
	}
	
	
	
	@DisplayName("Test Addition2")
	@Test
	void testaddition() {
		
		//excepted
		int  attendu = 20;
		//actual
		int obtenu = cal.Addition1(12, 8);
		
		assertEquals(attendu,obtenu);

	}
	@DisplayName("Test Division2")
	@Test
	void testdivision() {
		
		//int attendu =10;
		//int obtenu = cal.Division(20, 2);
		assertThrows(ArithmeticException.class,()->cal.Division(20, 0) );
		//division(5,0)
		
	}
	
	@DisplayName("Test Division3")
	@Test
	void testdivision3() {
		
		//int attendu =10;
		//int obtenu = cal.Division(20, 2);
		assertThrows(ArithmeticException.class,()->cal.Division(20, 0) );
		//division(5,0)
		
	}
}
