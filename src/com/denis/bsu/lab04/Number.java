package com.denis.bsu.lab04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Number<E extends java.lang.Number> {
	private List<E> numbers;

	public Number(List<E> numbers) {
		if (numbers != null) {
			this.numbers = numbers;
			return;
		}
		this.numbers = new ArrayList<>();
	}

	public E getMax() {
		if (haveElements()) {
			return Collections.max(numbers, null);
		}
		return null;
	}

	public E getMin() {
		if (haveElements()) {
			return Collections.min(numbers, null);
		}
		return null;
	}

	public String getLineWithElements() {
		StringBuilder sb = new StringBuilder();
		if (haveElements()) {
			for (int i = 0; i < numbers.size(); i++) {
				sb.append(numbers.get(i));
				if (i < numbers.size() - 1) {
					sb.append(", ");
				}
			}
			return sb.toString();
		}
		return "List doesn't have any element. :(";
	}

	public void printMaxElementFromList() {
		StringJoiner sj = new StringJoiner(" ");
		sj.add("Max element is").add((CharSequence) getMax()).add("( list [").add(getLineWithElements()).add("])");
		System.out.println(sj.toString());
	}

	public void printMinElementFromList() {
		StringJoiner sj = new StringJoiner(" ");
		sj.add("Min element is").add((CharSequence) getMin()).add("( list [").add(getLineWithElements()).add("])");
		System.out.println(sj.toString());
	}

	public void printAllElementsIsEquel() {
		if (haveElements()) {
			if (allElementsIsEquel()) {
				StringJoiner sj = new StringJoiner(" ");
				sj.add("Yes. All elements of list").add(getLineWithElements()).add("are equel to each other.");
				System.out.println(sj.toString());
			} else {
				System.out.println("No. " + getLineWithElements());
			}
		} else {
			System.out.println(getLineWithElements());
		}
	}

	private Boolean haveElements() {
		if (numbers != null && numbers.size() > 0) {
			return true;
		}
		return false;
	}

	private Boolean allElementsIsEquel() {
		if (haveElements()) {
			if (numbers.size() > 1) {
				E buffer = numbers.get(0);
				for (int i = 1; i < numbers.size(); i++) {
					if (!numbers.get(i).equals(buffer)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
}
