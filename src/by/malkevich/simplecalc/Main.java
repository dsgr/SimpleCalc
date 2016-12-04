package by.malkevich.simplecalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;

		while (true) {
			System.out.println("�������� ��������:");
			System.out.println("add - c������� ; sub - ���������; mult - ���������;"
					+ " div - �������; pow - ���������� � �������; q - ����� ");
			String answer = sc.nextLine();

			if (answer.equals("add")) {
				try {
					System.out.println("��������");
					System.out.println("������� ������ �����:");
					a = sc.nextDouble();
					System.out.println("������� ������ �����:");
					b = sc.nextDouble();
					System.out.println("���������: " + SimpleCalc.add(a, b));
				} catch (InputMismatchException e) {
					System.out.println("������ ����� �� �������� ��� �����. ���������� ��� ���.");
				}
			}

			if (answer.equals("sub")) {
				try {
					System.out.println("���������");
					System.out.println("������� ������ �����:");
					a = sc.nextDouble();
					System.out.println("������� ������ �����:");
					b = sc.nextDouble();
					System.out.println("���������: " + SimpleCalc.sub(a, b));
				} catch (InputMismatchException e) {
					System.out.println("������ ����� �� �������� ��� �����. ���������� ��� ���.");
				}
			}

			if (answer.equals("mult")) {
				try {
					System.out.println("���������");
					System.out.println("������� ������ �����:");
					a = sc.nextDouble();
					System.out.println("������� ������ �����:");
					b = sc.nextDouble();
					System.out.println("���������: " + SimpleCalc.mult(a, b));
				} catch (InputMismatchException e) {
					System.out.println("������ ����� �� �������� ��� �����. ���������� ��� ���.");
				}
			}

			if (answer.equals("div")) {
				try {
					System.out.println("�������");
					System.out.println("������� ������ �����:");
					a = sc.nextDouble();
					System.out.println("������� ������ �����:");
					b = sc.nextDouble();
					System.out.println("���������: " + SimpleCalc.div(a, b));
				} catch (InputMismatchException e) {
					System.out.println("������ ����� �� �������� ��� �����. ���������� ��� ���.");
				}

			}

			if (answer.equals("pow")) {
				try {
					System.out.println("���������� � �������");
					System.out.println("������� �����:");
					a = sc.nextDouble();
					System.out.println("������� �������:");
					b = sc.nextDouble();
					System.out.println("���������: " + SimpleCalc.pow(a, b));
				} catch (InputMismatchException e) {
					System.out.println("������ ����� �� �������� ��� �����. ���������� ��� ���.");
				}
			}

			if (answer.equals("q")) {
				System.exit(0);
			}

		}

	}

}
