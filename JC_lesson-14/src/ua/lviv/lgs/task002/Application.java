package ua.lviv.lgs.task002;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Commodity commodity = new Commodity(null, 0, 0, 0);

		Scanner sc = new Scanner(System.in);
		// Loop for data entry
		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				commodity.addCommodity();
				commodity.printList();
				break;
			}
			case "2": {
				commodity.deleteCommodity();
				commodity.printList();
				break;
			}
			case "3": {
				commodity.changeCommodity();
				commodity.printList();
				break;
			}
			case "4": {
				commodity.nameSorted();
				break;
			}
			case "5": {
				commodity.lenghtSorted();
				break;
			}
			case "6": {
				commodity.widthSorted();
				break;
			}
			case "7": {
				commodity.weightSorted();
				break;
			}
			case "8": {
				commodity.printEnteredCommodity();
				;
				break;
			}
			case "9": {
				System.exit(0);
				break;
			}
			}
		}

	}

	public static void menu() {
		System.out.println("������ 1 ��� ������ �����:");
		System.out.println("������ 2 ��� �������� �����:");
		System.out.println("������ 3 ��� ������� �����:");
		System.out.println("������ 4 ��� ��������� �� ������:");
		System.out.println("������ 5 ��� ��������� �� ��������:");
		System.out.println("������ 6 ��� ��������� �� �������:");
		System.out.println("������ 7 ��� ��������� �� �����:");
		System.out.println("������ 8 ��� ������� �������� �����(�� ���������� �������):");
		System.out.println("������ 9 ��� ����� � ��������:");
	}

}
