package tr.edu.medipol.yova.birimtestornek1;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		System.out.println("Uygulama Açılıyor");
		
		String ornekMetin = "               yazilim ortam ve araclari";
		String sonuc = Main.metniFormatla(ornekMetin);
		System.out.println(ornekMetin + " formatlandi --> "+sonuc);
	}

	public static String metniFormatla(String kaynakMetin) {
		String formatliMetin;
		// ADIM-1: Boşlukları temizle
		formatliMetin = StringUtils.normalizeSpace(kaynakMetin);
		// ADIM-2: Baş harfi büyüt
		formatliMetin = StringUtils.capitalize(formatliMetin);
		// ADIM-3: Uzunsa metni kısalt
		formatliMetin = StringUtils.abbreviate(formatliMetin, 25);
		return formatliMetin;
	}
}
