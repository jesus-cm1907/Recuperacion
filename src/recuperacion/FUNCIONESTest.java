package recuperacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FUNCIONESTest {
	
	private static FUNCIONES funcion;
	private int[] arrayTest;
	private int[] arrayTest2;

	@BeforeAll
	static void init() {
		 funcion = new FUNCIONES();
	}
	
	@BeforeEach
	void initforEach() {
		arrayTest = new int[3];
		
		arrayTest[0] = 1;
		arrayTest[1] = 5;
		arrayTest[2] = 11;
	
		arrayTest2 = new int [3];
		arrayTest2[0]=7;
		arrayTest2[1]=9;
		arrayTest2[2]=4;
	
	}
	
	
	@Test
	@DisplayName("Primer prueba")
	void Entornos1Test() {
		assertEquals(2, funcion.Entornos1("Jesus"));
		
	}
	
	@Test
	@DisplayName("Segunda prueba")
	void Entornos2Test() {		
		assertEquals("xxxxxxxx",funcion.Entornos2("xxxxxxxx", "xxx"));
	
	}
	
	@Test
	@DisplayName("Tercer prueba")
	void Entornos3Test() {
		
		assertEquals(11,funcion.funcion3(arrayTest));
			
	}
	
	@Test
	@DisplayName("Cuarta prueba")
	void Entornos4Test() {
			
		assertEquals("Bien",funcion.funcion4(arrayTest2));
	
	}

	@Test
	@DisplayName("Quinta prueba")
	void Entornos5Test() {
		assertEquals(10,funcion.funcion5("+",5,5));
		
	}

}

