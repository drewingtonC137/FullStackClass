package com.recepy.startyc08.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recepy.startyc08.Persistance.ReceptService;
import com.recepy.startyc08.model.Recept;

@RestController
public class ReceptEndpoint {
	
	@Autowired
	ReceptService rs;
	
	@GetMapping("/uitproberen")
	public String daarGaanWe() {
		System.out.println("hij doet het");
		rs.ietsOpslaan();
		return "Website work now? <input>";		
	}
	@GetMapping("/test2")
	public Recept irrelevant() {
		System.out.println("hij doet het");
		Recept r = new Recept();
		r.setNaam("Bami");
		System.out.println(r.getNaam());
		return r;
	}
	@GetMapping("/ietsmeegeven/{mijnInput}")
	public String ietsMeegeven(@PathVariable("mijnInput") String mijnInput) {
		System.out.println("hij doet het");
		return "Dit is het recept van: " + mijnInput;		
	}
	@PostMapping("/uitproberen")
	public String AndereNaam() {
		System.out.println("hij doet het");
		return "Website work now? <input>";		
	}
	@GetMapping("/geenidee/{geenidee2}")
	public String geenidee3(@PathVariable("geenidee2") String geenidee4) {
		System.out.println("hij doet het");
		rs.slaDitNieuweReceptOp(geenidee4);
		return "Dit is het recept van: " ;	
	}
}
