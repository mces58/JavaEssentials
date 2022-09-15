package packages;

import packages.geometri.KareAlani;
import packages.geometri.UcgenAlani;
import packages.matematik.DortIslem;
import packages.matematik.Logaritma;

public class Main {
	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(5, 10));

		Logaritma logaritma = new Logaritma();
		System.out.println(logaritma.logaritmaHesapla());

		KareAlani kareAlani = new KareAlani();
		System.out.println(kareAlani.KareAlaniHesapla(4));

		UcgenAlani ucgenAlani = new UcgenAlani();
		System.out.println(ucgenAlani.ucgenAlaniHesapla(5, 7));

	}
}
