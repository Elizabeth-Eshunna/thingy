package prog2.prelim;
import java.util.Scanner;

public class FractionArithmetic
	{
		public static void main(String[] args)
			{
				Scanner kbd = new Scanner(System.in);

				System.out.println();
				System.out.println("Enter a value for computation of fraction");
				System.out.println("*-----------------------------------------*");
				System.out.println("*										  *");
				System.out.println("*   (1)Addition of fractions			  *");
				System.out.println("*   (2)Subtraction of fractions			  *");
				System.out.println("*   (3)Multiplication of fractions		  *");
				System.out.println("*   (4)Division of fractions			  *");
				System.out.println("*   (5)Simplifying of fractions		      *");
				System.out.println("*   (6)Exit								  *");
				System.out.println("*										  *");
				System.out.println("*-----------------------------------------*");


				while (true)
					{
						System.out.print("Enter your option: ");
						int choice = kbd.nextInt();
						if (choice == 6)
							{
								break;
							}

						System.out.print("Enter the numerator of the first fraction: ");
						int num1 = kbd.nextInt();
						System.out.print("Enter the denominator of the first fraction: ");
						int den1 = kbd.nextInt();
						Fraction fraction1 = new Fraction(num1, den1);

						if (choice == 5)
							{
								System.out.println("The reduced form of the fraction is: " + fraction1);
								continue;
							}

						System.out.print("Enter the numerator of the second fraction: ");
						int num2 = kbd.nextInt();
						System.out.print("Enter the denominator of the second fraction: ");
						int den2 = kbd.nextInt();
						Fraction fraction2 = new Fraction(num2, den2);

						Fraction result;
						switch (choice)
							{
								case 1:
									result = fraction1.add(fraction2);
									System.out.println("Sum: " + result.toString());
									System.out.println("Sum (floating point): " + result.toDouble());
									break;
								case 2:
									result = fraction1.subtract(fraction2);
									System.out.println("Difference: " + result.toString());
									System.out.println("Difference (floating point): " + result.toDouble());
									break;
								case 3:
									result = fraction1.multiply(fraction2);
									System.out.println("Product: " + result.toString());
									System.out.println("Product (floating point): " + result.toDouble());
									break;
								case 4:
									result = fraction1.divide(fraction2);
									System.out.println("Quotient: " + result.toString());
									System.out.println("Quotient (floating point): " + result.toDouble());
									break;
							}
						System.out.println("");
					}
			}
	}