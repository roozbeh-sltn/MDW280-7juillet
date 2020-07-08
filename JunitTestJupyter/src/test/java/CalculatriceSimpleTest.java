import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;



@DisplayName("Calculatrice Test")
class CalculatriceSimpleTest {
    @DisplayName("Test Addition")
	@Test
	void testaddition() {
		CalculatriceSimple cal = new CalculatriceSimple();
		//excepted
		int  attendu = 20;
		//actual
		int obtenu = cal.Addition1(12, 7);
		
		assertEquals(attendu,obtenu);

	}
	@DisplayName("Test Division")
	@Test
	void testdivision() {
		CalculatriceSimple cal = new CalculatriceSimple();
		//int attendu =10;
		//int obtenu = cal.Division(20, 2);
		assertThrows(ArithmeticException.class,()->cal.Division(20, 0) );
		//division(5,0)
		
	}
	 /*@Test(expected = ArithmeticException.class)
	 public void should_throw_exception_when_dividing_by_zero() {
	  CalculatriceSimple cal = new  CalculatriceSimple();
	  cal.Division(1, 0);
     }*/
	
	@RepeatedTest(20)
	@DisplayName("Test ALL")
	void testall() {
		CalculatriceSimple cal = new CalculatriceSimple();
		assertAll(()->assertEquals(6,cal.Addition1(3, 3)),
				  ()->assertEquals(5,cal.Addition1(2, 3)),
				  ()->assertEquals(20, cal.multi(10, 2))
				
				);
	}
	@Disabled
	@DisplayName("Disabled")
	@Test
	void testdisabled() {
		CalculatriceSimple cal = new CalculatriceSimple();
		assertEquals(20,cal.multi(5, 4));
	}
	@EnabledOnJre(JRE.JAVA_8)
	@EnabledOnOs(OS.WINDOWS)
	@DisplayName("Enabled")
	@Test
	void testEnabled() {
		CalculatriceSimple cal = new CalculatriceSimple();
		assertEquals(20,cal.multi(5, 4));
	}

}
@Nested
class nested{
	@Test
	public void test1() {
		
	}
	@Test
	public void test2() {
		
	}
	@Test
	public void test3() {
		
		
	}
	
	
}
