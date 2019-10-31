package ar.edu.uno.tpPOO;

public class Arquero extends Unidad{

		private int flechas;

		public static void main (String args[]) {
			Arquero a1 = new Arquero();
			Arquero a2 = new Arquero(new Punto (0,2));
			a1.atacar(a2);
			System.out.println(a1);
			System.out.println(a2);

		}

		public Arquero(Punto posicion) {
			super(50, 5, 1, 2, 5, true, posicion);
			this.setFlechas(20);
		}
		public Arquero() {
			this(new Punto(0,0));
		}
		public void setFlechas(int flechas) {
			this.flechas = flechas;
		}
		public int getFlechas(){
			return flechas;
		}
		public boolean isFlechas() {
			try {
				if (this.getFlechas() > 0) {
					return true;
				} throw new Exception();
			} catch (Exception e) {
				System.out.println("Te faltan flechas");
				return false;
			}
		}
		public void cargarFlechas() {
			if(this.getFlechas() <= 14) {
				this.setFlechas(this.getFlechas() + 6);
			} else
				this.setFlechas(20);
		}
		public void atacar(Unidad objetivo) {
			if(this.isFlechas()) {
				if (this.puedeAtacar(objetivo)) {
					objetivo.dañoRecibido(this.getDaño());
					this.costeAtaque();
				}
			}
		}
		public void costeAtaque() {
			this.setFlechas(this.getFlechas() - this.getCosteatributo()); 
		}
		@Override
		public String toString() {
			return "Arquero [flechas:" + flechas + ", Posicion:" + getPosicion() + ", Salud():" + getSalud() + "]  Vivo:"  
		+ isVivo() + "";
		}

		@Override
		public void darPosionDeAgua() {
			// TODO Auto-generated method stub
			
		}
	}
	
