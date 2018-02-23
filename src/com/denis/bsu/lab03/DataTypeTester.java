package com.denis.bsu.lab03;

public class DataTypeTester {

	public static void testInt() {
		int a = 7;
		int b = 3;
		int c;

		c = a + b;
		System.out.printf("%d + %d = %d \n", a, b, c);
		c = a - b;
		System.out.printf("%d - %d = %d \n", a, b, c);
		c = a * b;
		System.out.printf("%d * %d = %d \n", a, b, c);
		c = a / b;
		System.out.printf("%d / %d = %d \n", a, b, c);
		c = a % b;
		System.out.printf("%d %% %d = %d \n", a, b, c);

		System.out.printf("%d++ = %d \n", a, a++);
		System.out.printf("++%d = %d \n", b, ++b);
		System.out.printf("%d-- = %d \n", a, a--);
		System.out.printf("--%d = %d \n", b, --b);
		System.out.printf("+%d = %d \n", a, +a);
		System.out.printf("-%d = %d \n", b, -b);

		System.out.println("--------------------------");
		System.out.printf("a = %d, b = %d \n", a, b);
		System.out.printf("a == b --> %s \n", a == b);
		System.out.printf("a != b --> %s \n", a != b);
		System.out.printf("a < b --> %s \n", a < b);
		System.out.printf("a > b --> %s \n", a > b);
		System.out.printf("a <= b --> %s \n", a <= b);
		System.out.printf("a >= b --> %s \n", a >= b);

		System.out.println("--------------------------");
		System.out.printf("a = %d, b = %d \n", a, b);
		System.out.printf("a > b || a == b --> %s \n", a > b || a == b);
		System.out.printf("a == b || a > b --> %s \n", a == b || a > b);
		System.out.printf("a > b | a == b --> %s \n", a > b | a == b);
		System.out.printf("a == b | a > b --> %s \n", a == b | a > b);
		System.out.printf("a > b && a == b --> %s \n", a > b && a == b);
		System.out.printf("a == b && a > b --> %s \n", a == b && a > b);
		System.out.printf("a > b & a == b --> %s \n", a > b & a == b);
		System.out.printf("a == b & a > b --> %s \n", a == b & a > b);
		System.out.printf("a ^ b --> %s \n", a ^ b);
		// System.out.printf("a ~ b --> %s \n", a ~ b);
	}

	/*
	 * public static void testGeneric(Number a, Number b) { Number c;
	 * 
	 * c = a + b; System.out.printf("%d + %d = %d \n", a, b, c); c = a - b;
	 * System.out.printf("%d - %d = %d \n", a, b, c); c = a * b;
	 * System.out.printf("%d * %d = %d \n", a, b, c); c = a / b;
	 * System.out.printf("%d / %d = %d \n", a, b, c); c = a % b;
	 * System.out.printf("%d %% %d = %d \n", a, b, c);
	 * 
	 * System.out.printf("%d++ = %d \n", a, a++); System.out.printf("++%d = %d \n",
	 * b, ++b); System.out.printf("%d-- = %d \n", a, a--);
	 * System.out.printf("--%d = %d \n", b, --b); System.out.printf("+%d = %d \n",
	 * a, +a); System.out.printf("-%d = %d \n", b, -b);
	 * 
	 * System.out.println("--------------------------");
	 * System.out.printf("a = %d, b = %d \n", a, b);
	 * System.out.printf("a == b --> %s \n", a == b);
	 * System.out.printf("a != b --> %s \n", a != b);
	 * System.out.printf("a < b --> %s \n", a < b);
	 * System.out.printf("a > b --> %s \n", a > b);
	 * System.out.printf("a <= b --> %s \n", a <= b);
	 * System.out.printf("a >= b --> %s \n", a >= b);
	 * 
	 * System.out.println("--------------------------");
	 * System.out.printf("a = %d, b = %d \n", a, b);
	 * System.out.printf("a > b || a == b --> %s \n", a > b || a == b);
	 * System.out.printf("a == b || a > b --> %s \n", a == b || a > b);
	 * System.out.printf("a > b | a == b --> %s \n", a > b | a == b);
	 * System.out.printf("a == b | a > b --> %s \n", a == b | a > b);
	 * System.out.printf("a > b && a == b --> %s \n", a > b && a == b);
	 * System.out.printf("a == b && a > b --> %s \n", a == b && a > b);
	 * System.out.printf("a > b & a == b --> %s \n", a > b & a == b);
	 * System.out.printf("a == b & a > b --> %s \n", a == b & a > b);
	 * System.out.printf("a ^ b --> %s \n", a ^ b); //
	 * System.out.printf("a ~ b --> %s \n", a ~ b);
	 * 
	 * }
	 */

}
