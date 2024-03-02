package Figuras;

public class Circunferencia {
	private double radio;
	private String color;

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public void imprimir() {
		color = "rojo";
		System.out.println("Diámetro:	" + 2 * radio);
		System.out.println("Color:	" + color);
		double area1 = 2 * 3.1416 * radio * radio;
		double area = area1;
		double area2 = area;
		System.out.println(area2);
	}

	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
	

	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}
	}
