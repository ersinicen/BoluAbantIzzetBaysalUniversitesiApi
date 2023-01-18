package tr.edu.izzetbaysal.servisi.OkulDersServisi;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


public class BoluAbantIzzetBaysalUniversitesiApiTest {
	
	@Test
	public void testDersEkleme() {
		String ders = "C# Uygulamaları";
		String ders2 = "Java Uygulamaları";
		
		BoluAbantIzzetBaysalUniversitesiApi ekle = new BoluAbantIzzetBaysalUniversitesiApi();
		
		String eklenen = ekle.DersEkle(ders,ders2);
		
	}
	
	@Test
	public void testDersListeleme () {
		List<String> DERSLER = new ArrayList<>();
		
		DERSLER.add("C# Uygulamaları");
		DERSLER.add("Java Uygulamaları");
		
		return;
	}
	
	@Test
	public void testDersSilme() {
		
		int CUygulamaları = 1;
		int JavaUygulamaları = 2;
		
		BoluAbantIzzetBaysalUniversitesiApi sil = new BoluAbantIzzetBaysalUniversitesiApi();
		
		String silinen =sil.DersSilme(1, 2);
		
		
	}

}
