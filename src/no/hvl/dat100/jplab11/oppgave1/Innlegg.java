package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	
	private int id;
	private int likes;
	private String bruker;
	private String dato;
	
	public Innlegg() {
		
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

	this.id = id;
	this.bruker = bruker;
	this.dato = dato;
	this.likes = 0;
		
		// TODO 
	//	throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
		// TODO - START
		
	//	throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		
		return bruker;
		
	//	throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
		// throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		
		return dato;
	//	throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	//	throw new UnsupportedOperationException(TODO.method());
	}

	public int getId() {
		
		return id;
		// throw new UnsupportedOperationException(TODO.method());

	}

	public int getLikes() {
		
		return likes;
		// throw new UnsupportedOperationException(TODO.method());

	}
	
	public void doLike () {
		
		this.likes += 1;
		// throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		boolean erLik = false;
		
		if(innlegg.id == this.id) {
			erLik = true;
		}
		return erLik;
			
		
		// throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		
		String toString = "";
		String id = Integer.toString(this.id);
		String likes = Integer.toString(this.likes);
		String bruker = this.bruker.toString();
		String dato = this.dato.toString();
		
		toString = "\\" + id + "\\" + bruker + "\\" + dato + "\\" + likes + "\\n";
		return toString;
		
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
