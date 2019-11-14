package ar.edu.uno.tpPOO;

public class Caballero extends Unidad implements Pociones{

		private  int cantataque;
		 private static int cont=0;

		public static void main(String args[]) {
			Caballero c1 = new Caballero();
			Caballero c2 = new Caballero(new Punto(2,0));
			c1.atacar(c2);
			c1.atacar(c2);
			c1.atacar(c2);
			c1.darPocionDeAgua();
			c1.atacar(c2);
			
				c1.mover("CNNNNNF");
			System.out.println(c1);
			System.out.println(c2);
			c1.atacar(c2);
		}

		public Caballero(Punto posicion) {
			super(200, 50, 1, 1, 2, true, posicion);
			this.setCantataque(0);
		}
		public Caballero() {
			this(new Punto());
		}
		public int getCantataque() {
			return cantataque;
		}

		public void setCantataque(int cantataque) {
			this.cantataque = cantataque;
		}
		public boolean isCaballoRebelde() {
			try {
				if (this.getCantataque() >=3) {
					throw new Exception();
				} return false;
			} catch (Exception e) {
				System.out.println("El caballo está rebelde");
				return true;
			}
		}
		public void darPocionDeAgua() {
			cont=0;
			this.setCantataque(cont);
		}
		@Override
		public String toString() {
			return "Caballero [ataques:"  + getCantataque() + ",  Posicion:" + getPosicion()+ ", Salud:" + getSalud() + "]  Vivo:" + isVivo() + "";
		}
		public void atacar(Unidad objetivo) {
			if(!this.isCaballoRebelde()) {
				if (this.puedeAtacar(objetivo)) {
					objetivo.dañoRecibido(this.getDaño());
					this.costeAtaque();
						cont++;
					this.setCantataque(cont);
				}
			}

		}
		public void costeAtaque() {
			this.setCantataque(this.getCantataque() - this.getCosteatributo());
		}

}
	

