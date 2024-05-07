package tr.edu.medipol.yova.birimtestornek1;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
	
	@Test
	public void testMetniFormatla() {
		// 1. ÖN KOŞULLAR (GIVEN)
		String kaynakMetin = "    ders 1    ";
		
		// 2. TEST EDİLECEK KOD ÇAĞIRILDIĞINDA (WHEN)
		String sonuc = Main.metniFormatla(kaynakMetin);
		
		// 3. KONTROLLER (THEN)
		assertEquals("Ders 1", sonuc);
		assertNotNull(sonuc);
	}

}
