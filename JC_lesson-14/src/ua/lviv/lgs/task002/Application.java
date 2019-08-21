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
		System.out.println("¬вед≥ть 1 щоб додати товар:");
		System.out.println("¬вед≥ть 2 щоб видалити товар:");
		System.out.println("¬вед≥ть 3 щоб зам≥нити товар:");
		System.out.println("¬вед≥ть 4 щоб сортувати за назвою:");
		System.out.println("¬вед≥ть 5 щоб сортувати за довжиною:");
		System.out.println("¬вед≥ть 6 щоб сортувати за шириною:");
		System.out.println("¬вед≥ть 7 щоб сортувати за вагою:");
		System.out.println("¬вед≥ть 8 щоб вивести вказаний товар(за пор€дковим номером):");
		System.out.println("¬вед≥ть 9 щоб вийти з програми:");
	}

}
