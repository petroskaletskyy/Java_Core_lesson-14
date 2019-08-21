package ua.lviv.lgs.task002;

import java.util.Comparator;

public class LengthComparator implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.getLength() > o2.getLength() ? 1 : -1;
	}

}
