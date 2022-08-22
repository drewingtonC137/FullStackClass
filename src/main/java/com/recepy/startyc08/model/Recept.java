package com.recepy.startyc08.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "naamRecept")
	private String naam;
	private String Omschrijving;
	private String ingredienten;
	private int bereidingsteid;
	private LocalDateTime aanmaakTijdstip;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getOmschrijving() {
		return Omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		Omschrijving = omschrijving;
	}
	public String getIngredienten() {
		return ingredienten;
	}
	public void setIngredienten(String ingredienten) {
		this.ingredienten = ingredienten;
	}
	public int getBereidingsteid() {
		return bereidingsteid;
	}
	public void setBereidingsteid(int bereidingsteid) {
		this.bereidingsteid = bereidingsteid;
	}
	public LocalDateTime getAanmaakTijdstip() {
		return aanmaakTijdstip;
	}
	public void setAanmaakTijdstip(LocalDateTime aanmaakTijdstip) {
		this.aanmaakTijdstip = aanmaakTijdstip;
	}
	
	
	
}
