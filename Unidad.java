package ar.edu.uno.tpPOO;

public abstract class Unidad implements Posiones{

	
		private int salud;
		private int daño;
		private int costeatributo;
		private int distanciaminima;
		private int distanciamaxima;
		private boolean vivo;
		private Punto posicion;

		public Unidad(int salud, int daño, int costeatributo, int distanciaminima, int distanciamaxima, boolean vivo, Punto posicion) {
			this.setSalud(salud);
			this.setDaño(daño);
			this.setCosteatributo(costeatributo);
			this.setDistanciaminima(distanciaminima);
			this.setDistanciamaxima(distanciamaxima);
			this.setVivo(vivo);
			this.setPosicion(posicion);
		}
		public int getDaño() {
			return daño;
		}

		public void setDaño(int daño) {
			this.daño = daño;
		}

		public int getCosteatributo() {
			return costeatributo;
		}

		public void setCosteatributo(int costeatributo) {
			this.costeatributo = costeatributo;
		}

		public int getDistanciaminima() {
			return distanciaminima;
		}

		public Punto getPosicion() {
			return posicion;
		}

		public void setPosicion(Punto posicion) {
			this.posicion = posicion;
		}

		public void setDistanciaminima(int distanciaminima) {
			this.distanciaminima = distanciaminima;
		}

		public int getDistanciamaxima() {
			return distanciamaxima;
		}

		public void setDistanciamaxima(int distanciamaxima) {
			this.distanciamaxima = distanciamaxima;
		}

		public boolean isVivo() {
			return vivo;
		}

		@Override
		public String toString() {
			return "Unidad [salud=" + salud + ", daño=" + daño + ", costeatributo=" + costeatributo + ", distanciaminima="
					+ distanciaminima + ", distanciamaxima=" + distanciamaxima + ", vivo=" + vivo + ", posicion=" + posicion
					+ "]";
		}
		public void setVivo(boolean vivo) {
			this.vivo = vivo;
		}

		public Unidad(int salud) {
			this.setSalud(salud);
		}

		public void setSalud(int salud) {
			this.salud = salud;
		}
		public int getSalud() {
			return salud;
		}
		public abstract void atacar(Unidad objetivo);

		public void mover(String msg) {
			try { if (this.isVivo()) {
				if(msg.matches("[c|C][S|s|E|e|N|n|O|o]*[f|F]")){
					int contx = 0;
					int conty = 0;
					for (int i=1;i<msg.length();i++) {
						if (msg.charAt(i)=='n'||msg.charAt(i)=='N'){
							conty += 1;
						}
						else if (msg.charAt(i)=='s'||msg.charAt(i)=='S'){
							conty -= 1;
						}
						else if (msg.charAt(i)=='e'||msg.charAt(i)=='E'){
							contx += 1;
						}
						else if (msg.charAt(i)=='o'||msg.charAt(i)=='O'){
							contx -= 1;
						}
					}
					this.getPosicion().moverPunto(new Punto(contx, conty));
					return;
				}
			} throw new Exception();
			}catch (Exception e) {
				System.out.println("La unidad está muerta");
			}
		}

		public boolean puedeAtacar(Unidad objetivo) {
			try {
				if (this.isVivo() && objetivo.isVivo()) {
					if (this.calcularDistanciaMinima(objetivo) && this.calcularDistanciaMaxima(objetivo)) return true;
					return false;
				} throw new Exception();
			}catch (Exception e) {
				System.out.println("La unidad está muerta");
				return false;
			}	
		}
		public boolean calcularDistanciaMinima(Unidad objetivo) {
			try {
				if (this.getPosicion().calcularDistancia(objetivo.getPosicion()) >= distanciaminima) {
					return true;	
				} throw new Exception();
			} catch (Exception e){
				System.out.println("Está demasiado cerca de su enemigo");
				return false;
			}
		}
		public boolean calcularDistanciaMaxima(Unidad objetivo) {
			try {
				if (this.getPosicion().calcularDistancia(objetivo.getPosicion()) <= distanciamaxima) {
					return true;
				} throw new Exception();
			} catch (Exception e) {
				System.out.println("Está demasiado lejos de su enemigo");
				return false;	
			}
		}
		public void dañoRecibido(int daño) {
			this.setSalud(this.getSalud() - daño);
			if(this.getSalud() <= 0) {
				this.morir();
			}
		}
		public void morir() {
			try {
				if (this.isVivo()) {
					this.setVivo(false);
					return;
				}
				throw new Exception();
		
    }catch (Exception e) {
				System.out.println("La unidad está muerta");
			}
		}
		public boolean equals(Unidad b) {
	return this.getPosicion().equalsP(b.getPosicion());
		}
	}
	

