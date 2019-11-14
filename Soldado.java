package ar.edu.uno.tpPOO;

public class Soldado extends Unidad {
	
	
		private int energia;

		public static void main(String args[]) {
			Soldado s1 = new Soldado();
			Soldado s2 = new Soldado(new Punto(1,0));
			s1.atacar(s2);
			s1.atacar(s2);


			System.out.println(s1);
			System.out.println(s2);

		}
		public Soldado(Punto posicion) {
			super(200, 10, 10, 1, 1, true, posicion);
			this.setEnergia(100);
		}
		public Soldado() {
			this(new Punto(0,0));
		}
		public void setEnergia(int energia) {
			this.energia = energia;
		}

		public int getEnergia() {
			return energia;
		}
		public boolean isEnergia() {
			try {
				if (this.getEnergia() >= 10) {
					return true;
				} throw new Exception();
			} catch (Exception e) {
				System.out.println("Te falta energia");
				return false;
			}
		}
		public void darPocionDeAgua() {
			this.setEnergia(100);
		}
		public String toString() {
			return "Soldado [energia:" + getEnergia() + ", Posicion:" + getPosicion() + ", Salud:" + getSalud() + "]  Vivo:"+ isVivo()+ "";
		}
		public void atacar(Unidad objetivo) {
			if(this.isEnergia()) {
				if (this.puedeAtacar(objetivo)) {
					objetivo.dañoRecibido(this.getDaño());
					this.costeAtaque();
				}
			}
		}
		public void costeAtaque() {
			this.setEnergia(this.getEnergia() - this.getCosteatributo());  	
		}
		@Override
		public void darPosionDeAgua() {
		this.setEnergia(100);
			
		}
	}

