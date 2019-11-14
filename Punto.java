package ar.edu.uno.tpPOO;

public class Punto {

		private int x;
		private int y;
		private int xi;
		private int yi;
		//private static int cont = 0;

		public Punto(int x, int y) {
			this.setX(x);
			this.setY(y);
			this.setXi(x);
			this.setYi(y);
		}

		public int getXi() {
			return xi;
		}

		public void setXi(int xi) {
			this.xi = xi;
		}

		public int getYi() {
			return yi;
		}

		public void setYi(int yi) {
			this.yi = yi;
		}

		public Punto() {
			this(0,0);
		}

		

		public Punto(Punto p1) {
			this.setX(p1.getX());
			this.setY(p1.getY());
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public static int calcularDistancia(Punto p1, Punto p2) {
			return (int) Math.hypot(p1.getX() - p2.getX(), p1.getY() - p2.getY());
		}

		public double calcularDistancia(Punto p1) {
			return Punto.calcularDistancia(this, p1);
		}
		public void moverPunto(Punto p2) {
			this.setX(this.getX() + p2.getX());
			this.setY(this.getY() + p2.getY());
		}

		public boolean equalsP(Punto a) {
			if(this.getX()==a.getX() && this.getY()==a.getY())return true;
			return false;
		}

		public String toString(){
			return "("+this.getX()+","+this.getY()+")";
		}
	}

