package ua.lviv.lgs.task002;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Commodity {

	private String name;
	private int length;
	private int width;
	private double weight;

	ArrayList<Commodity> list = new ArrayList<>();

	public Commodity(String name, int length, int width, double weight) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (length != other.length)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	public void addCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬вед≥ть назву товару:");
		String name = scanner.nextLine();
		System.out.println("¬вед≥ть довжину:");
		int length = scanner.nextInt();
		System.out.println("¬вед≥ть ширину:");
		int width = scanner.nextInt();
		System.out.println("¬вед≥ть вагу");
		double weight = scanner.nextDouble();
		list.add(new Commodity(name, length, width, weight));
	}

	public void deleteCommodity() {
		boolean isDeleted = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬вед≥ть назву товару:");
		String str = scanner.nextLine();

		Iterator<Commodity> iterator = list.iterator();
		while (iterator.hasNext()) {
			Commodity next = iterator.next();

			if (next.getName().equals(str)) {
				iterator.remove();
				isDeleted = true;
			}

		}
		if (isDeleted == false) {
			System.out.println("Ўкода, та такого товару немаЇ");
		}
	}

	public void changeCommodity() {
		boolean isChanged = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬вед≥ть назву товару:");
		String str = scanner.nextLine();

		Iterator<Commodity> iterator = list.iterator();
		while (iterator.hasNext()) {
			Commodity next = iterator.next();

			if (next.getName().equals(str)) {
				System.out.println("¬вед≥ть назву товару:");
				String name = scanner.nextLine();
				next.setName(name);
				System.out.println("¬вед≥ть довжину:");
				int length = scanner.nextInt();
				next.setLength(length);
				System.out.println("¬вед≥ть ширину:");
				int width = scanner.nextInt();
				next.setWidth(width);
				System.out.println("¬вед≥ть вагу");
				double weight = scanner.nextDouble();
				next.setWeight(weight);
				isChanged = true;
			}

		}
		if (isChanged == false) {
			System.out.println("Ўкода, та такого товару немаЇ");
		}
	}

	public void nameSorted() {
		TreeSet<Commodity> sortedSet = new TreeSet<>(new NameComparator());
		sortedSet.addAll(list);

		for (Commodity commodity : sortedSet) {
			System.out.println(commodity);
		}
	}

	public void lenghtSorted() {
		TreeSet<Commodity> sortedSet = new TreeSet<>(new LengthComparator());
		sortedSet.addAll(list);

		for (Commodity commodity : sortedSet) {
			System.out.println(commodity);
		}
	}

	public void widthSorted() {
		TreeSet<Commodity> sortedSet = new TreeSet<>(new WidthComparator());
		sortedSet.addAll(list);

		for (Commodity commodity : sortedSet) {
			System.out.println(commodity);
		}
	}

	public void weightSorted() {
		TreeSet<Commodity> sortedSet = new TreeSet<>(new WeightComparator());
		sortedSet.addAll(list);

		for (Commodity commodity : sortedSet) {
			System.out.println(commodity);
		}
	}

	public void printEnteredCommodity() {
		System.out.println("¬вед≥ть пор€дковий номер товару:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (list.size() < num - 1) {
			System.out.println("Ќа жаль, такого пор€дкового номеру немаЇ");
		} else {
			System.out.println(list.get(num));
		}
	}

	public void printList() {
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}
	}

}
