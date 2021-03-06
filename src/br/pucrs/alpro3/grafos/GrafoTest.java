package br.pucrs.alpro3.grafos;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest {

	@Test
	public void testG1() throws Exception {
		GrafoDirecionado g = new GrafoDirecionado("g1.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testG2() throws Exception {
		GrafoDirecionado g = new GrafoDirecionado("g2.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testG3() throws Exception {
		GrafoDirecionado g = new GrafoDirecionado("g3.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(1);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testG4() throws Exception {
		GrafoDirecionado g = new GrafoDirecionado("g4.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testG5() throws Exception {
		GrafoDirecionado g = new GrafoDirecionado("g5.txt");
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(4);
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testG6Largura() throws Exception {
		GrafoDirecionado g = new GrafoDirecionado("g6.txt");
		List<Integer> expected = new ArrayList<>();
		for (int i = 0; i <= 9; i++) {
			expected.add(i);
		}
		List<Integer> actual = g.percursoLargura(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testG6Profundidade() throws Exception {
		GrafoDirecionado g = new GrafoDirecionado("g6.txt");
		String expected = "[0, 1, 2, 5, 6, 3, 7, 4, 8, 9]";
		String actual = g.percursoProfundidade(0).toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testG1mst() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g1.txt");
		int expected = 0;
		int actual = g.mstKruskal();
		assertEquals(expected, actual);
	}

	@Test
	public void testG2mst() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g2.txt");
		int expected = 0;
		int actual = g.mstKruskal();
		assertEquals(expected, actual);
	}

	@Test
	public void testG3mst() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g3.txt");
		int expected = 1;
		int actual = g.mstKruskal();
		assertEquals(expected, actual);
	}	
	
	@Test
	public void testG4mst() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g4.txt");
		int expected = 1;
		int actual = g.mstKruskal();
		assertEquals(expected, actual);
	}	

	@Test(expected=IllegalArgumentException.class)
	public void testG5mst() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g5.txt");
		g.mstKruskal();
	}	

	@Test
	public void testG6mst() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g6.txt");
		int expected = 9;
		int actual = g.mstKruskal();
		assertEquals(expected, actual);
	}		
	
	@Test
	public void testG7mst() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g7.txt");
		int expected = 45;
		int actual = g.mstKruskal();
		assertEquals(expected, actual);
	}	

	@Test
	public void testG8mst() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g8.txt");
		int expected = 37;
		int actual = g.mstKruskal();
		assertEquals(expected, actual);
	}	
	
//

	@Test
	public void testG1mstPrim() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g1.txt");
		int expected = 0;
		int actual = g.mstPrim();
		assertEquals(expected, actual);
	}

	@Test
	public void testG2mstPrim() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g2.txt");
		int expected = 0;
		int actual = g.mstPrim();
		assertEquals(expected, actual);
	}

	@Test
	public void testG3mstPrim() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g3.txt");
		int expected = 1;
		int actual = g.mstPrim();
		assertEquals(expected, actual);
	}	
	
	@Test
	public void testG4mstPrim() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g4.txt");
		int expected = 1;
		int actual = g.mstPrim();
		assertEquals(expected, actual);
	}	

	@Test(expected=IllegalArgumentException.class)
	public void testG5mstPrim() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g5.txt");
		g.mstPrim();
	}	

	@Test
	public void testG6mstPrim() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g6.txt");
		int expected = 9;
		int actual = g.mstPrim();
		assertEquals(expected, actual);
	}		
	
	@Test
	public void testG7mstPrim() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g7.txt");
		int expected = 45;
		int actual = g.mstPrim();
		assertEquals(expected, actual);
	}	

	@Test
	public void testG8mstPrim() throws Exception {
		GrafoNaoDirecionado g = new GrafoNaoDirecionado("g8.txt");
		int expected = 37;
		int actual = g.mstPrim();
		assertEquals(expected, actual);
	}	

	
	@Test
	public void testG9djikstra() throws Exception {
		GrafoDirecionado g = new GrafoDirecionado("g9.txt");
		int expected = 3;
		int actual = g.djikstra(0, 1);
		assertEquals(expected, actual);
	}	
	
	
	
	
}
