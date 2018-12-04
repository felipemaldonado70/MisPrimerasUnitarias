package Test;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.After;

public class Prueba1Test {
	
	
	private static Prueba1 felipe;
	
	@BeforeClass
	 public static void beforeClass() {
	 System.out.println("Antes de todas");
	 felipe = new Prueba1();
	 }
	 
	 @Before
	 public void before() {
	 System.out.println("Antes de cada una");
	 }
	 
	 @Test
	 public void isGreaterTest() {
	 System.out.println("La Prueba");
	 assertTrue("Num 1 no es mayor que Num 2", felipe.isGreater(5, 3));
	 }
	 
	 @After
	 public void after() {
	 System.out.println("Despues de cada una");
	 }
	 
	 @AfterClass
	 public static void afterClass() {
	 System.out.println("Despues de todas");
	 }

}
