package tr.edu.izzetbaysal.servisi.OkulDersServisi;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


public class BoluAbantIzzetBaysalUniversitesiApiTest {
	
	@Test
	public void testDersEkleme() {
		List<String> DERSLER = new ArrayList<>();
		
		String ders = "C# Uygulamaları";
		String ders2 = "Java Uygulamaları";
		
		BoluAbantIzzetBaysalUniversitesiApi ekle = new BoluAbantIzzetBaysalUniversitesiApi();
		
		String eklenenDers = ekle.DersEkle(ders,ders2);
		
		String dersiVerenOgretmen = eklenenDers;
		DERSLER.add(dersiVerenOgretmen);
		
	}
	
	@Test
	public void testDersListeleme () {
		List<String> DERSLER = new ArrayList<>();
		
		System.out.println(DERSLER);
		
		return;
	}
	
	@Test
	public void testDersSilme() {
		List<String> DERSLER = new ArrayList<>();
		
		int CUygulamaları = 1;
		int JavaUygulamaları = 2;
		
		BoluAbantIzzetBaysalUniversitesiApi sil = new BoluAbantIzzetBaysalUniversitesiApi();
		
		String silinen =sil.DersSilme(1, 2);
		
		
	}

}
