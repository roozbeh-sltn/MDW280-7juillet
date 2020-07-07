import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfter {

	@BeforeAll
	 public static void beforeALL() {
		
		System.out.println("in before all");
	}
	
	@AfterAll
	 public static void afterALL() {
		
		System.out.println("in after all");
	}
	
	
	
	@BeforeEach
	public  void BeforeEach() {
		
		System.out.println("in before each");
	
	}
	
	@AfterEach
	public void Aftereach() {
		
		System.out.println("in after each");
	}
	
	
	
	//test cas 1
	
	@Test
	public void testcas1() {
		System.out.println("cas 1");
	}
	
	//test cas 2
	@Test
	public void testcas2() {
		System.out.println("cas2");
		
	}
	
	//test cas 3
		@Test
		public void testcas3() {
			System.out.println("cas3");
			
		}
		
		//test cas 4
		@Test
		public void testcas4() {
			System.out.println("cas4");
			
		}
	
}
