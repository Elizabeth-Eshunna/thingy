package prog2.prelim;
import java.util.Scanner;

class Fraction {
	private int numerator;
	private int denominator;

	public Fraction() {
		numerator = 0;
		denominator = 1;
	}

	public Fraction(int wholeNumVal) {
		numerator = wholeNumVal;
		denominator = 1;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		computeGCD();
	} 

	public void setNumerator(int num) {
		numerator = num;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setDenominator(int den) {
		if (den != 0) {
			denominator = den;
			computeGCD();
		} else {
			System.out.println("Denominator cannot be zero.");
		}
	}

	public int getDenominator() {
		return denominator;
	}

	public String toString() {
		return numerator + " / " + denominator;
	}

	public double toDouble() {
		return (double) numerator / denominator;
	}

	public Fraction add(Fraction other) {
		int resultNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
		int resultDenominator = this.denominator * other.denominator;
		return new Fraction(resultNumerator, resultDenominator);
	}

	public Fraction subtract(Fraction other) {
		int resultNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
		int resultDenominator = this.denominator * other.denominator;
		return new Fraction(resultNumerator, resultDenominator);
	}

	public Fraction multiply(Fraction other) {
		int resultNumerator = this.numerator * other.numerator;
		int resultDenominator = this.denominator * other.denominator;
		return new Fraction(resultNumerator, resultDenominator);
	}

	public Fraction divide(Fraction other) {
		int resultNumerator = this.numerator * other.denominator;
		int resultDenominator = this.denominator * other.numerator;
		return new Fraction(resultNumerator, resultDenominator);
	}

	private void computeGCD() {
		int gcd = 1;
		int smaller = Math.min(Math.abs(numerator), Math.abs(denominator));
		for (int i = 2; i <= smaller; i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator /= gcd;
		denominator /= gcd;
	}
}
