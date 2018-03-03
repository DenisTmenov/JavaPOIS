package com.denis.bsu.lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TaskA {

	public void executeTask01(Integer countNumber) {
		printTask01();

		Number<Double> number = new Number<>(generateListDouble(countNumber));
		number.printAllElementsIsEquel();
	}

	private void printTask01() {
		System.out.println("Разработайте программу, которая проверяет, что числа А, В и С различны (одинаковы).");

	}

	private Double generateDouble() {
		return ThreadLocalRandom.current().nextDouble(-1000.0, 1000.0);
	}

	private Integer generateInteger() {
		return ThreadLocalRandom.current().nextInt(-1000, 1000);
	}

	private List<Double> generateListDouble(Integer countNumbersInList) {
		List<Double> result = null;
		if (countNumbersInList != null && countNumbersInList > 0) {
			result = new ArrayList<>();
			for (int i = 0; i < countNumbersInList; i++) {
				result.add(generateDouble());
			}
		}
		return result;
	}

	private List<Integer> generateListInteger(Integer countNumbersInList) {
		List<Integer> result = null;
		if (countNumbersInList != null && countNumbersInList > 0) {
			result = new ArrayList<>();
			for (int i = 0; i < countNumbersInList; i++) {
				result.add(generateInteger());
			}
		}
		return result;
	}
}
