package com.recepy.startyc08.Persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recepy.startyc08.model.Recept;

@Service
public class ReceptService {
	@Autowired
	ReceptRepository r;
	
	public void ietsOpslaan() {
	System.out.println("Ik ga iets opslaan");	
	r.save(new Recept());
	}

	public void slaDitNieuweReceptOp(String geenidee4) {
		// TODO Auto-generated method stub
		Recept mijnRecept = new Recept();
		mijnRecept.setNaam(geenidee4);
		r.save(mijnRecept);
	}

}
