package by.malkevich.simplecalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;

		while (true) {
			System.out.println("ВЫБЕРИТЕ ДЕЙСТВИЕ:");
			System.out.println("add - cложение ; sub - вычитание; mult - умножение;"
					+ " div - деление; pow - возведение в степень; q - выход ");
			String answer = sc.nextLine();

			if (answer.equals("add")) {
				try {
					System.out.println("СЛОЖЕНИЕ");
					System.out.println("Введите первое число:");
					a = sc.nextDouble();
					System.out.println("Введите второе число:");
					b = sc.nextDouble();
					System.out.println("РЕЗУЛЬТАТ: " + SimpleCalc.add(a, b));
				} catch (InputMismatchException e) {
					System.out.println("Скорее всего вы ошиблись при вводе. Попробуйте ещё раз.");
				}
			}

			if (answer.equals("sub")) {
				try {
					System.out.println("ВЫЧИТАНИЕ");
					System.out.println("Введите первое число:");
					a = sc.nextDouble();
					System.out.println("Введите второе число:");
					b = sc.nextDouble();
					System.out.println("РЕЗУЛЬТАТ: " + SimpleCalc.sub(a, b));
				} catch (InputMismatchException e) {
					System.out.println("Скорее всего вы ошиблись при вводе. Попробуйте ещё раз.");
				}
			}

			if (answer.equals("mult")) {
				try {
					System.out.println("УМНОЖЕНИЕ");
					System.out.println("Введите первое число:");
					a = sc.nextDouble();
					System.out.println("Введите второе число:");
					b = sc.nextDouble();
					System.out.println("РЕЗУЛЬТАТ: " + SimpleCalc.mult(a, b));
				} catch (InputMismatchException e) {
					System.out.println("Скорее всего вы ошиблись при вводе. Попробуйте ещё раз.");
				}
			}

			if (answer.equals("div")) {
				try {
					System.out.println("ДЕЛЕНИЕ");
					System.out.println("Введите первое число:");
					a = sc.nextDouble();
					System.out.println("Введите второе число:");
					b = sc.nextDouble();
					System.out.println("РЕЗУЛЬТАТ: " + SimpleCalc.div(a, b));
				} catch (InputMismatchException e) {
					System.out.println("Скорее всего вы ошиблись при вводе. Попробуйте ещё раз.");
				}

			}

			if (answer.equals("pow")) {
				try {
					System.out.println("ВОЗВЕДЕНИЕ В СТЕПЕНЬ");
					System.out.println("Введите число:");
					a = sc.nextDouble();
					System.out.println("Введите степень:");
					b = sc.nextDouble();
					System.out.println("РЕЗУЛЬТАТ: " + SimpleCalc.pow(a, b));
				} catch (InputMismatchException e) {
					System.out.println("Скорее всего вы ошиблись при вводе. Попробуйте ещё раз.");
				}
			}

			if (answer.equals("q")) {
				System.exit(0);
			}

		}

	}

}
