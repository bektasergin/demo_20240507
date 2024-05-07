package tr.edu.medipol.yova.birimtestornek1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesapTest {

	@Test
	public void topla_ikiPozitifSayi() {
		// GIVEN
		int sayi1=2;
		int sayi2=2;
		
		// WHEN
		int sonuc = Hesap.topla(sayi1, sayi2);
		
		// THEN
		assertEquals(4, sonuc);
	}
	
	@Test
	public void topla_ikiNegatifSayi() {
		// GIVEN
		int sayi1=-2;
		int sayi2=-2;
		
		// WHEN
		int sonuc = Hesap.topla(sayi1, sayi2);
		
		// THEN
		assertEquals(-4, sonuc);
	}

	@Test
	public void cikart_ikiPozitifSayi() {
		
		// GIVEN
		int sayi1=2;
		int sayi2=2;
				
		// WHEN
		int sonuc = Hesap.cikart(sayi1, sayi2);
				
		// THEN
		assertEquals(0, sonuc);
	}
	
	@Test
	public void cikart_ikiNegatifSayi() {
		// GIVEN
		int sayi1=-2;
		int sayi2=-2;
						
		// WHEN
		int sonuc = Hesap.cikart(sayi1, sayi2);
						
		// THEN
		assertEquals(0, sonuc);
	}
	
	@Test
	public void carp_ikiPozitifSayi() {
		// GIVEN
		int sayi1=2;
		int sayi2=2;
						
		// WHEN
		int sonuc = Hesap.carp(sayi1, sayi2);
						
		// THEN
		assertEquals(4, sonuc);
	}

	@Test
	public void carp_ikiNegatifSayi() {
		// GIVEN
		int sayi1=-2;
		int sayi2=-2;
						
		// WHEN
		int sonuc = Hesap.carp(sayi1, sayi2);
		
		// THEN
		assertEquals(4, sonuc);
	}

	@Test
	public void bol_ikiPozitifSayi() {
		// GIVEN
		int sayi1=2;
		int sayi2=2;
						
		// WHEN
		int sonuc = Hesap.bol(sayi1, sayi2);
						
		// THEN
		assertEquals(1, sonuc);
	}

	@Test
	public void bol_ikiNegatifSayi() {
		// GIVEN
		int sayi1=-2;
		int sayi2=-2;
						
		// WHEN
		int sonuc = Hesap.bol(sayi1, sayi2);
						
		// THEN
		assertEquals(1, sonuc);
	}

	@Test
	public void bol_pozitifSayiyiSifiraBolme() {
		// GIVEN
		int sayi1=2;
		int sayi2=0;
						
		// WHEN
		int sonuc = Hesap.bol(sayi1, sayi2);
					
		// THEN
		assertEquals("Sıfıra bölünmez", sonuc);
	}
	
	@Test
	public void bol_negatifSayiyiSifiraBolme() {
		// GIVEN
		int sayi1=-2;
		int sayi2=0;
								
		// WHEN
		int sonuc = Hesap.bol(sayi1, sayi2);
							
		// THEN
		assertEquals("Sıfıra bölünmez", sonuc);
	}
}
