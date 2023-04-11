package com.delpozo.ud21_01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeometriaTest {

	private Geometria geometria;

	@BeforeEach
	void constructor() {
		geometria = new Geometria();
	}

	@Test
	// metodo area del cuadrado
	void testAreacuadrado() {
		int area = geometria.areacuadrado(8);
		int esperado = 64;
		assertEquals(esperado, area);

	}

	@Test
	// metodo area del circulo
	public void testAreaCirculo() {
		double resultado = geometria.areaCirculo(2);
		assertEquals(3.1416 * 9, resultado);
	}

	@Test
	// metodo area del triangulo
	void testAreaTriangulo() {
		int area = geometria.areatriangulo(5, 4);
		int resultado = 10;
		assertEquals(resultado, area);
	}

	@Test
	// metodo area del rectangulo
	void testAreaRectangulo() {
		int area = geometria.arearectangulo(6, 4);
		int resultado = 24;
		assertEquals(resultado, area);
	}

	@Test
	// metodo area del pentagono
	void testAreaPentagono() {
		int area = geometria.areapentagono(5, 4);
		int resultado = 10;
		assertEquals(resultado, area);
	}

	@Test
	// metodo area del rombo
	void testAreaRombo() {
		int area = geometria.arearombo(3, 4);
		int resultado = 6;
		assertEquals(resultado, area);
	}

	@Test
	// metodo area del romboide
	void testAreaRomboide() {
		int area = geometria.arearomboide(3, 4);
		int resultado = 12;
		assertEquals(resultado, area);
	}

	@Test
	// metodo area del trapecio
	void testAreaTrapecio() {
		int area = geometria.areatrapecio(6, 4, 2);
		int resultado = 10;
		assertEquals(resultado, area);
	}

	@Test
	void testSetId() {
		geometria = new Geometria();
		geometria.setId(4);
		assertEquals(4, geometria.getId());
	}

	@Test
	void testGetId() {
		geometria = new Geometria(4);
		assertEquals(4, geometria.getId());
	}

	@Test
	void testSetNom() {
		geometria = new Geometria();
		geometria.setNom("Circulo");
		assertEquals("Circulo", geometria.getNom());
	}

	@Test
	void testGetNom() {
		geometria = new Geometria(2);
		assertEquals("Circulo", geometria.getNom());
	}
	
	@Test
	void testSetArea() {
		geometria = new Geometria();
		geometria.setArea(123.45);
		assertEquals(123.45, geometria.getArea());
	}

	@Test
	// Selector de figuras
	void testFigura() {
		assertEquals("cuadrado", geometria.figura(1));
		assertEquals("Circulo", geometria.figura(2));
		assertEquals("Triangulo", geometria.figura(3));
		assertEquals("Rectangulo", geometria.figura(4));
		assertEquals("Pentagono", geometria.figura(5));
		assertEquals("Rombo", geometria.figura(6));
		assertEquals("Romboide", geometria.figura(7));
		assertEquals("Trapecio", geometria.figura(8));
		assertEquals("Default", geometria.figura(9));
		assertEquals("Default", geometria.figura(0));
	}

	@Test
	void testToString() {
		String expected = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(expected, geometria.toString());
	}

}
