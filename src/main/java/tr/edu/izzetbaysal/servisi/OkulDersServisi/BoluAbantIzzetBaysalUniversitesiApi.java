package tr.edu.izzetbaysal.servisi.OkulDersServisi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/ders")
public class BoluAbantIzzetBaysalUniversitesiApi {
	
	private static final List<String> DERSLER = new ArrayList<>();
	{
		DERSLER.add("C Uygulamaları");
		DERSLER.add("Java Uygulamaları");
		DERSLER.add("Web Tasarım");
		DERSLER.add("Yazılım Geliştirme ve Ortam Araçları");
		
		int CUygulamaları = 1;
		int JavaUygulamaları = 2;
		
		DERSLER.remove(JavaUygulamaları);
		DERSLER.remove(CUygulamaları);
	}
	
	@GetMapping("/listele")
	public List<String> DersListeleme(){
		return DERSLER;
	}
	
	@PostMapping("/ekle")
	public String DersEkle(@RequestBody String eklenen, String ders) {
		DERSLER.add(eklenen);
		
		String dersiVerenOgretmen = "Ozkan Sari"+eklenen;
		DERSLER.add(dersiVerenOgretmen);
		
		return null;
	}
	
	@PostMapping("/sil")
	public String DersSilme(int CUygulamaları, int JavaUygulamaları) {
		DERSLER.remove(JavaUygulamaları);
		DERSLER.remove(CUygulamaları);
		
		return null;
	}
}
