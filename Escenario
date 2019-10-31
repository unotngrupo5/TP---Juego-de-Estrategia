package ar.edu.uno.tpPOO;
import java.util.ArrayList;

public class Escenario {
	//ATRIBUTOS:
	private ArrayList<Unidad>unidadesRojas;
	private ArrayList<Unidad>unidadesBlancas;
	////////////////////////////////////

	public static void main(String[] args) {
		Unidad s1 = new Soldado(new Punto(5,2));
		Unidad a2 = new Arquero(new Punto(2,3));
		Unidad c3 = new Caballero(new Punto(1,2));
		Escenario rojo = new Escenario();
		//Escenario blanco = new Escenario();
		rojo.añadirUnidadRoja(c3);
		rojo.añadirUnidadRoja(a2);
		rojo.añadirUnidadRoja(s1);
		
		rojo.mostrarListaRoja();
		
		Unidad s1B = new Soldado(new Punto(1,1));
		Unidad a2B = new Arquero(new Punto(0,3));
		Unidad c3B = new Caballero(new Punto(9,5));
		rojo.añadirUnidadBlanca(c3B);
		rojo.añadirUnidadBlanca(a2B);
		rojo.añadirUnidadBlanca(s1B);
		
		rojo.mostrarListaBlanca();

		c3.atacar(s1B);
		c3.atacar(s1B);
		c3.atacar(s1B);
		c3.atacar(s1B);
		c3.darPosionDeAgua();
		c3.atacar(s1B);
		
		rojo.mostrarListaBlanca();
		rojo.mostrarListaRoja();
	}

	

	//CONSTRUCTORES:
	public Escenario(ArrayList<Unidad>unidadesRojas, ArrayList<Unidad>unidadesBlancas) {
		this.setUnidadesRojas(unidadesRojas);
		this.setUnidadesBlancas(unidadesBlancas);
	}
	public Escenario() {
		this(new ArrayList<Unidad>(),new ArrayList<Unidad>());
	}
	////////////////////////////////////////////////////
	//METODOS:
	public void añadirUnidadRoja(Unidad nuevaUnidad) {
		//
			try {
				if(nuevaUnidad.equals(this.getUnidadesRojas())) {
					throw new Exception();}
				else {
					this.unidadesRojas.add(nuevaUnidad);
				}
			}
			catch(Exception e) {
				System.out.println("posición ocupada");
			}
		}

	public void mostrarListaRoja() {
		System.out.println();
		System.out.println("UNIDADES ROJAS:");
		System.out.println();
		for(Unidad e: unidadesRojas) {
			
			System.out.println(e);
		}
		
	}
	public void añadirUnidadBlanca(Unidad nuevaUnidad) {
		//
			try {
				if(nuevaUnidad.equals(this.getUnidadesBlancas())) {
					throw new Exception();}
				else {
					this.unidadesBlancas.add(nuevaUnidad);
				}
			}
			catch(Exception e) {
				System.out.println("posición ocupada");
			}
		}

	public void mostrarListaBlanca() {
		
	
				
			
		System.out.println();
		System.out.println("UNIDADES BLANCAS:");
		System.out.println();
		for(Unidad e: unidadesBlancas) {
			//if (!e.isVivo()) { unidadesBlancas.remove(e);}
			//else {
			System.out.println(e);}
		}
		
	

	//GETTERS & SETTERS:
	public ArrayList<Unidad> getUnidadesRojas() {
		return unidadesRojas;
	}

	public void setUnidadesRojas(ArrayList<Unidad> unidadesRojas) {
		this.unidadesRojas = unidadesRojas;
	}

	public ArrayList<Unidad> getUnidadesBlancas() {
		return unidadesBlancas;
	}

	public void setUnidadesBlancas(ArrayList<Unidad> unidadesBlancas) {
		this.unidadesBlancas = unidadesBlancas;
	}


}
