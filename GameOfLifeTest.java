import org.junit.Test;
import static org.junit.Assert.*;


public class GameOfLifeTest {

	//tests that convertToInt still works properly
	@Test
	public void testConvertToInt1()
	{
		MainPanel main = new MainPanel(15);
		assertEquals(main.convertToInt(45), 45);
	}
	
	//tests a large integer with a small screen size
	@Test
	public void testConvertToInt2()
	{
		MainPanel main = new MainPanel(10);
		assertEquals(main.convertToInt(3000), 3000);
	}
	
	//tests a small integer with a large screen size
	@Test
	public void testConvertToInt3()
	{
		MainPanel main = new MainPanel(400);
		assertEquals(main.convertToInt(0), 0);
	}
}
