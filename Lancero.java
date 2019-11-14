package ar.edu.uno.tpPOO;

public class Lancero extends Unidad{
	
		public static void main (String args[]) {

		}

		public Lancero(Punto posicion) {
			super(150, 25, 0, 1, 3, true, posicion);
		}
		public Lancero() {
			this(new Punto(0,0));
		}

		public void atacar(Unidad objetivo) {
			if (this.puedeAtacar(objetivo)) {
				objetivo.dañoRecibido(this.getDaño());
			}
		}

	}

