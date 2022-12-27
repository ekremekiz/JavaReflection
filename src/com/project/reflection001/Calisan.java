package com.project.reflection001;

public class Calisan {
	public String ad;
	public String soyad;
	public int maas;
	private int no;
	private float seviye;
	
	Calisan(){
		
		System.out.println("Default Constructor");
	}
	
	public Calisan(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
		System.out.println("Public Constructor");
	}
	
	public String getAdSoyad() {
		System.out.println("Ad Soyad Getir Metodu");
		return this.ad + " " + this.soyad;
	}
	
	public void setMaas(int maas) {
		this.maas = maas;
	}
	
}
