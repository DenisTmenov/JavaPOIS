package com.denis.bsu.lab03;

import java.util.StringJoiner;

public class DataTypeTester {

	public static void testByte() {
		byte a;
		byte b;
		System.out.println("Операция присваивания -->  \"=\"");
		System.out.printf("a = %d \n", a = 7);
		System.out.printf("b = %d \n", b = 3);
		System.out.println("--------------------------\n");
		System.out.println("Унарные операции:");
		System.out.println("унарный минус \"-\" – меняет знак числа или выражения на противоположный");
		System.out.printf("-%d = %d \n", b, -b);
		System.out.println("унарный плюс \"+\" – не выполняет никаких действий над числом или выражением");
		System.out.printf("+%d = %d \n", a, +a);
		System.out.println(
				"побитовое дополнение \"~\" (только для целых) – инвертирует все биты поля числа (меняет 0 на 1 и 1 на 0)");
		System.out.println("a = " + Integer.toString(a, 2));
		System.out.println("~a = " + Integer.toString(~a, 2));

		System.out.println("инкремент \"++\" (только для целых) – увеличивает значение переменной на 1");
		System.out.printf("%d++ = %d \n", a, a++);
		System.out.printf("++%d = %d \n", b, ++b);
		System.out.println("декремент \"--\" (только для целых) – уменьшает значение переменной на 1");
		System.out.printf("%d-- = %d \n", a, a--);
		System.out.printf("--%d = %d \n", b, --b);
		System.out.println("--------------------------\n");
		System.out.println("Арифметические бинарные операции:");
		System.out.println("сложение \"+\";");
		System.out.printf("%d + %d = %d \n", a, b, a + b);
		System.out.println("вычитание \"-\";");
		System.out.printf("%d - %d = %d \n", a, b, a - b);
		System.out.println("умножение \"*\";");
		System.out.printf("%d * %d = %d \n", a, b, a * b);
		System.out.println("деление \"/\";");
		System.out.printf("%d / %d = %d \n", a, b, a / b);
		System.out.println(
				"вычисление остатка от деления целых чисел \"%\" (возвращает остаток от деления первого числа на второе,");
		System.out.println(
				"причем результат будет иметь тот же знак, что и делимое), например, результат операции 5%3 будет равен 2,");
		System.out.println("а результат операции (-7)%(-4) будет равен -3.");
		System.out
				.println("В Java операция может использоваться и для вещественных переменных (типа float или double)");
		System.out.printf("%d %% %d = %d \n", a, b, a % b);
		System.out.println("--------------------------\n");
		System.out.println("Побитовые операции:");
		System.out.println(
				"Побитовые операции рассматривают исходные числовые значения как поля битов и выполняют над ними следующие действия:");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если оба бита в i-ых позициях операндов равны 1, или в 0 в противном случае – побитовое И (\"&\");");
		byte x = 112;
		// x: 00000000 00000000 00000000 01110000
		byte y = 94;
		// y: 00000000 00000000 00000000 01011110
		byte z;
		z = (byte) (x & y);
		// z=80: 00000000 00000000 00000000 01010000
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x & y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если хотя бы один бит в i-ых позициях операндов равен 1, или в 0 в противном случае – побитовое ИЛИ (\"|\");");
		z = (byte) (x | y);
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x | y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если биты в i-ых позициях операндов не равны друг другу, или в 0 в противном случае – побитовое исключающее ИЛИ (\"^\");");
		z = (byte) (x ^ y);
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x ^ y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"сдвиг влево битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом не меняется) – побитовый сдвиг влево с учетом знака \"<<\";");
		System.out.print("x = " + x + " [" + Integer.toString(x, 2) + "]\n");
		x = (byte) (x << 3);
		System.out.print("x << 3 = " + x + " [" + Integer.toString(x, 2) + "]\n");
		System.out.println(
				"сдвиг вправо битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом не меняется) – побитовый сдвиг вправо с учетом знака \">>\";");
		System.out.print("y = " + y + " [" + Integer.toString(y, 2) + "]\n");
		x = (byte) (y >> 3);
		System.out.print("y >> 3 = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.println(
				"сдвиг вправо битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом также сдвигается) – побитовый сдвиг вправо без учета знака \">>>\".");
		System.out.print("z = " + z + " [" + Integer.toString(z, 2) + "]\n");
		x = (byte) (z >>> 3);
		System.out.print("z >>> 3 = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println("--------------------------\n");
		System.out.println("Комбинированные операции:");
		x = 8;
		System.out.printf(
				"1. Выражение x += b означает x = x + b. \n\t x = %d \n\t b = %d \n\t x = %d + %d \n\t x = %d\n", x, 12,
				x, 12, x += 12);
		System.out.printf(
				"2. Выражение x -= b означает x = x — b. \n\t x = %d \n\t b = %d \n\t x = %d - %d \n\t x = %d\n", x, 12,
				x, 12, x -= 12);
		System.out.printf(
				"3. Выражение x *= b означает x = x * b. \n\t x = %d \n\t b = %d \n\t x = %d * %d \n\t x = %d\n", x, 12,
				x, 12, x *= 12);
		System.out.printf(
				"4. Выражение x /= b означает x = x / b. \n\t x = %d \n\t b = %d \n\t x = %d / %d \n\t x = %d\n", x, 12,
				x, 12, x /= 12);
		System.out.println("5. Выражение x %= b означает x = x % b.");
		System.out.println("\t x = " + x);
		System.out.println("\t b = " + b);
		System.out.println("\t x = " + x + " % " + b);
		System.out.println("\t x = " + x % b);
		System.out.printf(
				"6. Выражение x &= b означает x = x & b. \n\t x = %d \n\t b = %d \n\t x = %d & %d \n\t x = %d\n", x, 12,
				x, 12, x &= 12);
		System.out.printf(
				"7. Выражение x |= b означает x = x | b. \n\t x = %d \n\t b = %d \n\t x = %d | %d \n\t x = %d\n", x, 12,
				x, 12, x |= 12);
		System.out.printf(
				"8. Выражение x ^= b означает x = x ^ b. \n\t x = %d \n\t b = %d \n\t x = %d ^ %d \n\t x = %d\n", x, 12,
				x, 12, x ^= 12);
		System.out.printf(
				"9. Выражение x <<= b означает x = x << b. \n\t x = %d \n\t b = %d \n\t x = %d << %d \n\t x = %d\n", x,
				12, x, 12, x <<= 12);
		System.out.printf(
				"10. Выражение x >>= b означает x = x >> b. \n\t x = %d \n\t b = %d \n\t x = %d >> %d \n\t x = %d\n", x,
				12, x, 12, x >>= 12);
		System.out.printf(
				"11. Выражение x >>>= b означает x = x >>> b. \n\t x = %d \n\t b = %d \n\t x = %d >> %d \n\t x = %d\n",
				x, 12, x, 12, x >>= 12);
		System.out.println("--------------------------\n");
		System.out.println("Операции сравнения");
		System.out.println("\"==\" (равно)");
		System.out.printf("a == b --> %s \n", a == b);
		System.out.println("\"!=\" (не равно)");
		System.out.printf("a != b --> %s \n", a != b);
		System.out.println("\">\" (больше)");
		System.out.printf("a > b --> %s \n", a > b);
		System.out.println("\">=\" (больше или равно)");
		System.out.printf("a >= b --> %s \n", a >= b);
		System.out.println("\"<\" (меньше)");
		System.out.printf("a < b --> %s \n", a < b);
		System.out.println("\"<=\" (меньше или равно)");
		System.out.printf("a <= b --> %s \n", a <= b);
		System.out.println("");
		System.out.println("--------------------------\n");
		System.out.println("Булевские операции:");
		System.out.println("отрицание \"!\" – замена false на true, или наоборот;");
		System.out.printf("a = %d, b = %d, a != b = %s", a, b, a != b);
		System.out.println(
				"операция И \"&\" – результат равен true, только, если оба операнда равны true, иначе результат – false;");
		System.out.printf("a > b && a == b --> %s \n", a > b && a == b);
		System.out.printf("a == b && a > b --> %s \n", a == b && a > b);
		System.out.printf("a > b & a == b --> %s \n", a > b & a == b);
		System.out.printf("a == b & a > b --> %s \n", a == b & a > b);
		System.out.println(
				"операция ИЛИ \"|\" – результат равен true, только, если хотя бы один из операндов равен true, иначе результат – false.");
		System.out.printf("a > b || a == b --> %s \n", a > b || a == b);
		System.out.printf("a == b || a > b --> %s \n", a == b || a > b);
		System.out.printf("a > b | a == b --> %s \n", a > b | a == b);
		System.out.printf("a == b | a > b --> %s \n", a == b | a > b);
		System.out.println(
				"операция исключающее ИЛИ \"^\" – результат равен true, только, если операнды не равны друг другу, иначе результат – false.");
		a = 4;
		b = 4;
		System.out.printf("a = %d, b = %d, a ^ b = %s\n", a, b, a ^ b);
		b = 5;
		System.out.printf("a = %d, b = %d, a ^ b = %s\n", a, b, a ^ b);
		System.out.println("--------------------------\n");
	}

	public static void testShort() {
		short a;
		short b;
		System.out.println("Операция присваивания -->  \"=\"");
		System.out.printf("a = %d \n", a = 7);
		System.out.printf("b = %d \n", b = 3);
		System.out.println("--------------------------\n");
		System.out.println("Унарные операции:");
		System.out.println("унарный минус \"-\" – меняет знак числа или выражения на противоположный");
		System.out.printf("-%d = %d \n", b, -b);
		System.out.println("унарный плюс \"+\" – не выполняет никаких действий над числом или выражением");
		System.out.printf("+%d = %d \n", a, +a);
		System.out.println(
				"побитовое дополнение \"~\" (только для целых) – инвертирует все биты поля числа (меняет 0 на 1 и 1 на 0)");
		System.out.println("a = " + Integer.toString(a, 2));
		System.out.println("~a = " + Integer.toString(~a, 2));

		System.out.println("инкремент \"++\" (только для целых) – увеличивает значение переменной на 1");
		System.out.printf("%d++ = %d \n", a, a++);
		System.out.printf("++%d = %d \n", b, ++b);
		System.out.println("декремент \"--\" (только для целых) – уменьшает значение переменной на 1");
		System.out.printf("%d-- = %d \n", a, a--);
		System.out.printf("--%d = %d \n", b, --b);
		System.out.println("--------------------------\n");
		System.out.println("Арифметические бинарные операции:");
		System.out.println("сложение \"+\";");
		System.out.printf("%d + %d = %d \n", a, b, a + b);
		System.out.println("вычитание \"-\";");
		System.out.printf("%d - %d = %d \n", a, b, a - b);
		System.out.println("умножение \"*\";");
		System.out.printf("%d * %d = %d \n", a, b, a * b);
		System.out.println("деление \"/\";");
		System.out.printf("%d / %d = %d \n", a, b, a / b);
		System.out.println(
				"вычисление остатка от деления целых чисел \"%\" (возвращает остаток от деления первого числа на второе,");
		System.out.println(
				"причем результат будет иметь тот же знак, что и делимое), например, результат операции 5%3 будет равен 2,");
		System.out.println("а результат операции (-7)%(-4) будет равен -3.");
		System.out
				.println("В Java операция может использоваться и для вещественных переменных (типа float или double)");
		System.out.printf("%d %% %d = %d \n", a, b, a % b);
		System.out.println("--------------------------\n");
		System.out.println("Побитовые операции:");
		System.out.println(
				"Побитовые операции рассматривают исходные числовые значения как поля битов и выполняют над ними следующие действия:");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если оба бита в i-ых позициях операндов равны 1, или в 0 в противном случае – побитовое И (\"&\");");
		short x = 112;
		// x: 00000000 00000000 00000000 01110000
		short y = 94;
		// y: 00000000 00000000 00000000 01011110
		short z;
		z = (short) (x & y);
		// z=80: 00000000 00000000 00000000 01010000
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x & y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если хотя бы один бит в i-ых позициях операндов равен 1, или в 0 в противном случае – побитовое ИЛИ (\"|\");");
		z = (short) (x | y);
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x | y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если биты в i-ых позициях операндов не равны друг другу, или в 0 в противном случае – побитовое исключающее ИЛИ (\"^\");");
		z = (short) (x ^ y);
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x ^ y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"сдвиг влево битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом не меняется) – побитовый сдвиг влево с учетом знака \"<<\";");
		System.out.print("x = " + x + " [" + Integer.toString(x, 2) + "]\n");
		x = (short) (x << 3);
		System.out.print("x << 3 = " + x + " [" + Integer.toString(x, 2) + "]\n");
		System.out.println(
				"сдвиг вправо битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом не меняется) – побитовый сдвиг вправо с учетом знака \">>\";");
		System.out.print("y = " + y + " [" + Integer.toString(y, 2) + "]\n");
		x = (short) (y >> 3);
		System.out.print("y >> 3 = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.println(
				"сдвиг вправо битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом также сдвигается) – побитовый сдвиг вправо без учета знака \">>>\".");
		System.out.print("z = " + z + " [" + Integer.toString(z, 2) + "]\n");
		x = (short) (z >>> 3);
		System.out.print("z >>> 3 = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println("--------------------------\n");
		System.out.println("Комбинированные операции:");
		x = 8;
		System.out.printf(
				"1. Выражение x += b означает x = x + b. \n\t x = %d \n\t b = %d \n\t x = %d + %d \n\t x = %d\n", x, 12,
				x, 12, x += 12);
		System.out.printf(
				"2. Выражение x -= b означает x = x — b. \n\t x = %d \n\t b = %d \n\t x = %d - %d \n\t x = %d\n", x, 12,
				x, 12, x -= 12);
		System.out.printf(
				"3. Выражение x *= b означает x = x * b. \n\t x = %d \n\t b = %d \n\t x = %d * %d \n\t x = %d\n", x, 12,
				x, 12, x *= 12);
		System.out.printf(
				"4. Выражение x /= b означает x = x / b. \n\t x = %d \n\t b = %d \n\t x = %d / %d \n\t x = %d\n", x, 12,
				x, 12, x /= 12);
		System.out.println("5. Выражение x %= b означает x = x % b.");
		System.out.println("\t x = " + x);
		System.out.println("\t b = " + b);
		System.out.println("\t x = " + x + " % " + b);
		System.out.println("\t x = " + x % b);
		System.out.printf(
				"6. Выражение x &= b означает x = x & b. \n\t x = %d \n\t b = %d \n\t x = %d & %d \n\t x = %d\n", x, 12,
				x, 12, x &= 12);
		System.out.printf(
				"7. Выражение x |= b означает x = x | b. \n\t x = %d \n\t b = %d \n\t x = %d | %d \n\t x = %d\n", x, 12,
				x, 12, x |= 12);
		System.out.printf(
				"8. Выражение x ^= b означает x = x ^ b. \n\t x = %d \n\t b = %d \n\t x = %d ^ %d \n\t x = %d\n", x, 12,
				x, 12, x ^= 12);
		System.out.printf(
				"9. Выражение x <<= b означает x = x << b. \n\t x = %d \n\t b = %d \n\t x = %d << %d \n\t x = %d\n", x,
				12, x, 12, x <<= 12);
		System.out.printf(
				"10. Выражение x >>= b означает x = x >> b. \n\t x = %d \n\t b = %d \n\t x = %d >> %d \n\t x = %d\n", x,
				12, x, 12, x >>= 12);
		System.out.printf(
				"11. Выражение x >>>= b означает x = x >>> b. \n\t x = %d \n\t b = %d \n\t x = %d >> %d \n\t x = %d\n",
				x, 12, x, 12, x >>= 12);
		System.out.println("--------------------------\n");
		System.out.println("Операции сравнения");
		System.out.println("\"==\" (равно)");
		System.out.printf("a == b --> %s \n", a == b);
		System.out.println("\"!=\" (не равно)");
		System.out.printf("a != b --> %s \n", a != b);
		System.out.println("\">\" (больше)");
		System.out.printf("a > b --> %s \n", a > b);
		System.out.println("\">=\" (больше или равно)");
		System.out.printf("a >= b --> %s \n", a >= b);
		System.out.println("\"<\" (меньше)");
		System.out.printf("a < b --> %s \n", a < b);
		System.out.println("\"<=\" (меньше или равно)");
		System.out.printf("a <= b --> %s \n", a <= b);
		System.out.println("");
		System.out.println("--------------------------\n");
		System.out.println("Булевские операции:");
		System.out.println("отрицание \"!\" – замена false на true, или наоборот;");
		System.out.printf("a = %d, b = %d, a != b = %s", a, b, a != b);
		System.out.println(
				"операция И \"&\" – результат равен true, только, если оба операнда равны true, иначе результат – false;");
		System.out.printf("a > b && a == b --> %s \n", a > b && a == b);
		System.out.printf("a == b && a > b --> %s \n", a == b && a > b);
		System.out.printf("a > b & a == b --> %s \n", a > b & a == b);
		System.out.printf("a == b & a > b --> %s \n", a == b & a > b);
		System.out.println(
				"операция ИЛИ \"|\" – результат равен true, только, если хотя бы один из операндов равен true, иначе результат – false.");
		System.out.printf("a > b || a == b --> %s \n", a > b || a == b);
		System.out.printf("a == b || a > b --> %s \n", a == b || a > b);
		System.out.printf("a > b | a == b --> %s \n", a > b | a == b);
		System.out.printf("a == b | a > b --> %s \n", a == b | a > b);
		System.out.println(
				"операция исключающее ИЛИ \"^\" – результат равен true, только, если операнды не равны друг другу, иначе результат – false.");
		a = 4;
		b = 4;
		System.out.printf("a = %d, b = %d, a ^ b = %s\n", a, b, a ^ b);
		b = 5;
		System.out.printf("a = %d, b = %d, a ^ b = %s\n", a, b, a ^ b);
		System.out.println("--------------------------\n");
	}

	public static void testChar() {
		char a = '7';
		char b = 'в';
		System.out.println("Операция присваивания -->  \"=\"");
		System.out.print("a = " + a + " \n");
		System.out.print("b = " + b + " \n");
		System.out.println("--------------------------\n");
		System.out.println("Унарные операции:");
		System.out.println("унарный минус \"-\" – меняет знак числа или выражения на противоположный");
		System.out.printf("-%s = %s \n", b, -b);
		System.out.println("унарный плюс \"+\" – не выполняет никаких действий над числом или выражением");
		System.out.printf("+%s = %s \n", a, +a);
		System.out.println(
				"побитовое дополнение \"~\" (только для целых) – инвертирует все биты поля числа (меняет 0 на 1 и 1 на 0)");
		System.out.println("a = " + Integer.toString(a, 2));
		System.out.println("~a = " + Integer.toString(~a, 2));

		System.out.println("инкремент \"++\" (только для целых) – увеличивает значение переменной на 1");
		System.out.printf("%s++ = %s \n", a, a++);
		System.out.printf("++%s = %s \n", b, ++b);
		System.out.println("декремент \"--\" (только для целых) – уменьшает значение переменной на 1");
		System.out.printf("%s-- = %s \n", a, a--);
		System.out.printf("--%s = %s \n", b, --b);
		System.out.println("--------------------------\n");
		System.out.println("Арифметические бинарные операции:");
		System.out.println("сложение \"+\";");
		System.out.printf("%s + %s = %s \n", a, b, a + b);
		System.out.println("вычитание \"-\";");
		System.out.printf("%s - %s = %s \n", a, b, a - b);
		System.out.println("умножение \"*\";");
		System.out.printf("%s * %s = %s \n", a, b, a * b);
		System.out.println("деление \"/\";");
		System.out.printf("%s / %s = %s \n", a, b, a / b);
		System.out.println(
				"вычисление остатка от деления целых чисел \"%\" (возвращает остаток от деления первого числа на второе,");
		System.out.println(
				"причем результат будет иметь тот же знак, что и делимое), например, результат операции 5%3 будет равен 2,");
		System.out.println("а результат операции (-7)%(-4) будет равен -3.");
		System.out
				.println("В Java операция может использоваться и для вещественных переменных (типа float или double)");
		System.out.printf("%s %% %s = %s \n", a, b, a % b);
		System.out.println("--------------------------\n");
		System.out.println("Побитовые операции:");
		System.out.println(
				"Побитовые операции рассматривают исходные числовые значения как поля битов и выполняют над ними следующие действия:");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если оба бита в i-ых позициях операндов равны 1, или в 0 в противном случае – побитовое И (\"&\");");
		char x = 112;
		char y = 94;
		char z;
		z = (char) (x & y);
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x & y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если хотя бы один бит в i-ых позициях операндов равен 1, или в 0 в противном случае – побитовое ИЛИ (\"|\");");
		z = (char) (x | y);
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x | y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если биты в i-ых позициях операндов не равны друг другу, или в 0 в противном случае – побитовое исключающее ИЛИ (\"^\");");
		z = (char) (x ^ y);
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x ^ y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"сдвиг влево битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом не меняется) – побитовый сдвиг влево с учетом знака \"<<\";");
		System.out.print("x = " + x + " [" + Integer.toString(x, 2) + "]\n");
		x = (char) (x << 3);
		System.out.print("x << 3 = " + x + " [" + Integer.toString(x, 2) + "]\n");
		System.out.println(
				"сдвиг вправо битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом не меняется) – побитовый сдвиг вправо с учетом знака \">>\";");
		System.out.print("y = " + y + " [" + Integer.toString(y, 2) + "]\n");
		x = (char) (y >> 3);
		System.out.print("y >> 3 = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.println(
				"сдвиг вправо битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом также сдвигается) – побитовый сдвиг вправо без учета знака \">>>\".");
		System.out.print("z = " + z + " [" + Integer.toString(z, 2) + "]\n");
		x = (char) (z >>> 3);
		System.out.print("z >>> 3 = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println("--------------------------\n");
		System.out.println("Комбинированные операции:");
		x = 8;
		System.out.printf(
				"1. Выражение x += b означает x = x + b. \n\t x = %s \n\t b = %s \n\t x = %s + %s \n\t x = %s\n", x, 12,
				x, 12, x += 12);
		System.out.printf(
				"2. Выражение x -= b означает x = x — b. \n\t x = %s \n\t b = %s \n\t x = %s - %s \n\t x = %s\n", x, 12,
				x, 12, x -= 12);
		System.out.printf(
				"3. Выражение x *= b означает x = x * b. \n\t x = %s \n\t b = %s \n\t x = %s * %s \n\t x = %s\n", x, 12,
				x, 12, x *= 12);
		System.out.printf(
				"4. Выражение x /= b означает x = x / b. \n\t x = %s \n\t b = %s \n\t x = %s / %s \n\t x = %s\n", x, 12,
				x, 12, x /= 12);
		System.out.println("5. Выражение x %= b означает x = x % b.");
		System.out.println("\t x = " + x);
		System.out.println("\t b = " + b);
		System.out.println("\t x = " + x + " % " + b);
		System.out.println("\t x = " + x % b);
		System.out.printf(
				"6. Выражение x &= b означает x = x & b. \n\t x = %s \n\t b = %s \n\t x = %s & %s \n\t x = %s\n", x, 12,
				x, 12, x &= 12);
		System.out.printf(
				"7. Выражение x |= b означает x = x | b. \n\t x = %s \n\t b = %s \n\t x = %s | %s \n\t x = %s\n", x, 12,
				x, 12, x |= 12);
		System.out.printf(
				"8. Выражение x ^= b означает x = x ^ b. \n\t x = %s \n\t b = %s \n\t x = %s ^ %s \n\t x = %s\n", x, 12,
				x, 12, x ^= 12);
		System.out.printf(
				"9. Выражение x <<= b означает x = x << b. \n\t x = %s \n\t b = %s \n\t x = %s << %s \n\t x = %s\n", x,
				12, x, 12, x <<= 12);
		System.out.printf(
				"10. Выражение x >>= b означает x = x >> b. \n\t x = %s \n\t b = %s \n\t x = %s >> %s \n\t x = %s\n", x,
				12, x, 12, x >>= 12);
		System.out.printf(
				"11. Выражение x >>>= b означает x = x >>> b. \n\t x = %s \n\t b = %s \n\t x = %s >> %s \n\t x = %s\n",
				x, 12, x, 12, x >>= 12);
		System.out.println("--------------------------\n");
		System.out.println("Операции сравнения");
		System.out.println("\"==\" (равно)");
		System.out.printf("a == b --> %s \n", a == b);
		System.out.println("\"!=\" (не равно)");
		System.out.printf("a != b --> %s \n", a != b);
		System.out.println("\">\" (больше)");
		System.out.printf("a > b --> %s \n", a > b);
		System.out.println("\">=\" (больше или равно)");
		System.out.printf("a >= b --> %s \n", a >= b);
		System.out.println("\"<\" (меньше)");
		System.out.printf("a < b --> %s \n", a < b);
		System.out.println("\"<=\" (меньше или равно)");
		System.out.printf("a <= b --> %s \n", a <= b);
		System.out.println("");
		System.out.println("--------------------------\n");
		System.out.println("Булевские операции:");
		System.out.println("отрицание \"!\" – замена false на true, или наоборот;");
		System.out.printf("a = %s, b = %s, a != b = %s", a, b, a != b);
		System.out.println(
				"операция И \"&\" – результат равен true, только, если оба операнда равны true, иначе результат – false;");
		System.out.printf("a > b && a == b --> %s \n", a > b && a == b);
		System.out.printf("a == b && a > b --> %s \n", a == b && a > b);
		System.out.printf("a > b & a == b --> %s \n", a > b & a == b);
		System.out.printf("a == b & a > b --> %s \n", a == b & a > b);
		System.out.println(
				"операция ИЛИ \"|\" – результат равен true, только, если хотя бы один из операндов равен true, иначе результат – false.");
		System.out.printf("a > b || a == b --> %s \n", a > b || a == b);
		System.out.printf("a == b || a > b --> %s \n", a == b || a > b);
		System.out.printf("a > b | a == b --> %s \n", a > b | a == b);
		System.out.printf("a == b | a > b --> %s \n", a == b | a > b);
		System.out.println(
				"операция исключающее ИЛИ \"^\" – результат равен true, только, если операнды не равны друг другу, иначе результат – false.");
		a = 4;
		b = 4;
		System.out.printf("a = %s, b = %s, a ^ b = %s\n", a, b, a ^ b);
		b = 5;
		System.out.printf("a = %s, b = %s, a ^ b = %s\n", a, b, a ^ b);
		System.out.println("--------------------------\n");
	}

	public static void testInt() {
		int a;
		int b;
		System.out.println("Операция присваивания -->  \"=\"");
		System.out.printf("a = %d \n", a = 7);
		System.out.printf("b = %d \n", b = 3);
		System.out.println("--------------------------\n");
		System.out.println("Унарные операции:");
		System.out.println("унарный минус \"-\" – меняет знак числа или выражения на противоположный");
		System.out.printf("-%d = %d \n", b, -b);
		System.out.println("унарный плюс \"+\" – не выполняет никаких действий над числом или выражением");
		System.out.printf("+%d = %d \n", a, +a);
		System.out.println(
				"побитовое дополнение \"~\" (только для целых) – инвертирует все биты поля числа (меняет 0 на 1 и 1 на 0)");
		System.out.println("a = " + Integer.toString(a, 2));
		System.out.println("~a = " + Integer.toString(~a, 2));

		System.out.println("инкремент \"++\" (только для целых) – увеличивает значение переменной на 1");
		System.out.printf("%d++ = %d \n", a, a++);
		System.out.printf("++%d = %d \n", b, ++b);
		System.out.println("декремент \"--\" (только для целых) – уменьшает значение переменной на 1");
		System.out.printf("%d-- = %d \n", a, a--);
		System.out.printf("--%d = %d \n", b, --b);
		System.out.println("--------------------------\n");
		System.out.println("Арифметические бинарные операции:");
		System.out.println("сложение \"+\";");
		System.out.printf("%d + %d = %d \n", a, b, a + b);
		System.out.println("вычитание \"-\";");
		System.out.printf("%d - %d = %d \n", a, b, a - b);
		System.out.println("умножение \"*\";");
		System.out.printf("%d * %d = %d \n", a, b, a * b);
		System.out.println("деление \"/\";");
		System.out.printf("%d / %d = %d \n", a, b, a / b);
		System.out.println(
				"вычисление остатка от деления целых чисел \"%\" (возвращает остаток от деления первого числа на второе,");
		System.out.println(
				"причем результат будет иметь тот же знак, что и делимое), например, результат операции 5%3 будет равен 2,");
		System.out.println("а результат операции (-7)%(-4) будет равен -3.");
		System.out
				.println("В Java операция может использоваться и для вещественных переменных (типа float или double)");
		System.out.printf("%d %% %d = %d \n", a, b, a % b);
		System.out.println("--------------------------\n");
		System.out.println("Побитовые операции:");
		System.out.println(
				"Побитовые операции рассматривают исходные числовые значения как поля битов и выполняют над ними следующие действия:");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если оба бита в i-ых позициях операндов равны 1, или в 0 в противном случае – побитовое И (\"&\");");
		int x = 112;
		// x: 00000000 00000000 00000000 01110000
		int y = 94;
		// y: 00000000 00000000 00000000 01011110
		int z;
		z = (x & y);
		// z=80: 00000000 00000000 00000000 01010000
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x & y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если хотя бы один бит в i-ых позициях операндов равен 1, или в 0 в противном случае – побитовое ИЛИ (\"|\");");
		z = (x | y);
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x | y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если биты в i-ых позициях операндов не равны друг другу, или в 0 в противном случае – побитовое исключающее ИЛИ (\"^\");");
		z = (x ^ y);
		System.out.print(
				"x = " + x + " [" + Integer.toString(x, 2) + "],\ny = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.print("z = x ^ y = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println(
				"сдвиг влево битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом не меняется) – побитовый сдвиг влево с учетом знака \"<<\";");
		System.out.print("x = " + x + " [" + Integer.toString(x, 2) + "]\n");
		x = (x << 3);
		System.out.print("x << 3 = " + x + " [" + Integer.toString(x, 2) + "]\n");
		System.out.println(
				"сдвиг вправо битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом не меняется) – побитовый сдвиг вправо с учетом знака \">>\";");
		System.out.print("y = " + y + " [" + Integer.toString(y, 2) + "]\n");
		x = (y >> 3);
		System.out.print("y >> 3 = " + y + " [" + Integer.toString(y, 2) + "]\n");
		System.out.println(
				"сдвиг вправо битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом также сдвигается) – побитовый сдвиг вправо без учета знака \">>>\".");
		System.out.print("z = " + z + " [" + Integer.toString(z, 2) + "]\n");
		x = (z >>> 3);
		System.out.print("z >>> 3 = " + z + " [" + Integer.toString(z, 2) + "]\n");
		System.out.println("--------------------------\n");
		System.out.println("Комбинированные операции:");
		x = 8;
		System.out.printf(
				"1. Выражение x += b означает x = x + b. \n\t x = %d \n\t b = %d \n\t x = %d + %d \n\t x = %d\n", x, 12,
				x, 12, x += 12);
		System.out.printf(
				"2. Выражение x -= b означает x = x — b. \n\t x = %d \n\t b = %d \n\t x = %d - %d \n\t x = %d\n", x, 12,
				x, 12, x -= 12);
		System.out.printf(
				"3. Выражение x *= b означает x = x * b. \n\t x = %d \n\t b = %d \n\t x = %d * %d \n\t x = %d\n", x, 12,
				x, 12, x *= 12);
		System.out.printf(
				"4. Выражение x /= b означает x = x / b. \n\t x = %d \n\t b = %d \n\t x = %d / %d \n\t x = %d\n", x, 12,
				x, 12, x /= 12);
		System.out.println("5. Выражение x %= b означает x = x % b.");
		System.out.println("\t x = " + x);
		System.out.println("\t b = " + b);
		System.out.println("\t x = " + x + " % " + b);
		System.out.println("\t x = " + x % b);
		System.out.printf(
				"6. Выражение x &= b означает x = x & b. \n\t x = %d \n\t b = %d \n\t x = %d & %d \n\t x = %d\n", x, 12,
				x, 12, x &= 12);
		System.out.printf(
				"7. Выражение x |= b означает x = x | b. \n\t x = %d \n\t b = %d \n\t x = %d | %d \n\t x = %d\n", x, 12,
				x, 12, x |= 12);
		System.out.printf(
				"8. Выражение x ^= b означает x = x ^ b. \n\t x = %d \n\t b = %d \n\t x = %d ^ %d \n\t x = %d\n", x, 12,
				x, 12, x ^= 12);
		System.out.printf(
				"9. Выражение x <<= b означает x = x << b. \n\t x = %d \n\t b = %d \n\t x = %d << %d \n\t x = %d\n", x,
				12, x, 12, x <<= 12);
		System.out.printf(
				"10. Выражение x >>= b означает x = x >> b. \n\t x = %d \n\t b = %d \n\t x = %d >> %d \n\t x = %d\n", x,
				12, x, 12, x >>= 12);
		System.out.printf(
				"11. Выражение x >>>= b означает x = x >>> b. \n\t x = %d \n\t b = %d \n\t x = %d >> %d \n\t x = %d\n",
				x, 12, x, 12, x >>= 12);
		System.out.println("--------------------------\n");
		System.out.println("Операции сравнения");
		System.out.println("\"==\" (равно)");
		System.out.printf("a == b --> %s \n", a == b);
		System.out.println("\"!=\" (не равно)");
		System.out.printf("a != b --> %s \n", a != b);
		System.out.println("\">\" (больше)");
		System.out.printf("a > b --> %s \n", a > b);
		System.out.println("\">=\" (больше или равно)");
		System.out.printf("a >= b --> %s \n", a >= b);
		System.out.println("\"<\" (меньше)");
		System.out.printf("a < b --> %s \n", a < b);
		System.out.println("\"<=\" (меньше или равно)");
		System.out.printf("a <= b --> %s \n", a <= b);
		System.out.println("");
		System.out.println("--------------------------\n");
		System.out.println("Булевские операции:");
		System.out.println("отрицание \"!\" – замена false на true, или наоборот;");
		System.out.printf("a = %d, b = %d, a != b = %s", a, b, a != b);
		System.out.println(
				"операция И \"&\" – результат равен true, только, если оба операнда равны true, иначе результат – false;");
		System.out.printf("a > b && a == b --> %s \n", a > b && a == b);
		System.out.printf("a == b && a > b --> %s \n", a == b && a > b);
		System.out.printf("a > b & a == b --> %s \n", a > b & a == b);
		System.out.printf("a == b & a > b --> %s \n", a == b & a > b);
		System.out.println(
				"операция ИЛИ \"|\" – результат равен true, только, если хотя бы один из операндов равен true, иначе результат – false.");
		System.out.printf("a > b || a == b --> %s \n", a > b || a == b);
		System.out.printf("a == b || a > b --> %s \n", a == b || a > b);
		System.out.printf("a > b | a == b --> %s \n", a > b | a == b);
		System.out.printf("a == b | a > b --> %s \n", a == b | a > b);
		System.out.println(
				"операция исключающее ИЛИ \"^\" – результат равен true, только, если операнды не равны друг другу, иначе результат – false.");
		a = 4;
		b = 4;
		System.out.printf("a = %d, b = %d, a ^ b = %s\n", a, b, a ^ b);
		b = 5;
		System.out.printf("a = %d, b = %d, a ^ b = %s\n", a, b, a ^ b);
		System.out.println("--------------------------\n");

	}

	public static void testLong() {
		long a;
		long b;
		System.out.println("Операция присваивания -->  \"=\"");
		System.out.printf("a = %d \n", a = 7);
		System.out.printf("b = %d \n", b = 3);
		System.out.println("--------------------------\n");
		System.out.println("Унарные операции:");
		System.out.println("унарный минус \"-\" – меняет знак числа или выражения на противоположный");
		System.out.printf("-%d = %d \n", b, -b);
		System.out.println("унарный плюс \"+\" – не выполняет никаких действий над числом или выражением");
		System.out.printf("+%d = %d \n", a, +a);
		System.out.println(
				"побитовое дополнение \"~\" (только для целых) – инвертирует все биты поля числа (меняет 0 на 1 и 1 на 0)");
		System.out.println("a = " + Long.toString(a, 2));
		System.out.println("~a = " + Long.toString(~a, 2));

		System.out.println("инкремент \"++\" (только для целых) – увеличивает значение переменной на 1");
		System.out.printf("%d++ = %d \n", a, a++);
		System.out.printf("++%d = %d \n", b, ++b);
		System.out.println("декремент \"--\" (только для целых) – уменьшает значение переменной на 1");
		System.out.printf("%d-- = %d \n", a, a--);
		System.out.printf("--%d = %d \n", b, --b);
		System.out.println("--------------------------\n");
		System.out.println("Арифметические бинарные операции:");
		System.out.println("сложение \"+\";");
		System.out.printf("%d + %d = %d \n", a, b, a + b);
		System.out.println("вычитание \"-\";");
		System.out.printf("%d - %d = %d \n", a, b, a - b);
		System.out.println("умножение \"*\";");
		System.out.printf("%d * %d = %d \n", a, b, a * b);
		System.out.println("деление \"/\";");
		System.out.printf("%d / %d = %d \n", a, b, a / b);
		System.out.println(
				"вычисление остатка от деления целых чисел \"%\" (возвращает остаток от деления первого числа на второе,");
		System.out.println(
				"причем результат будет иметь тот же знак, что и делимое), например, результат операции 5%3 будет равен 2,");
		System.out.println("а результат операции (-7)%(-4) будет равен -3.");
		System.out
				.println("В Java операция может использоваться и для вещественных переменных (типа float или double)");
		System.out.printf("%d %% %d = %d \n", a, b, a % b);
		System.out.println("--------------------------\n");
		System.out.println("Побитовые операции:");
		System.out.println(
				"Побитовые операции рассматривают исходные числовые значения как поля битов и выполняют над ними следующие действия:");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если оба бита в i-ых позициях операндов равны 1, или в 0 в противном случае – побитовое И (\"&\");");
		long x = 112;
		// x: 00000000 00000000 00000000 01110000
		long y = 94;
		// y: 00000000 00000000 00000000 01011110
		long z;
		z = (x & y);
		// z=80: 00000000 00000000 00000000 01010000
		System.out.print("x = " + x + " [" + Long.toString(x, 2) + "],\ny = " + y + " [" + Long.toString(y, 2) + "]\n");
		System.out.print("z = x & y = " + z + " [" + Long.toString(z, 2) + "]\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если хотя бы один бит в i-ых позициях операндов равен 1, или в 0 в противном случае – побитовое ИЛИ (\"|\");");
		z = (x | y);
		System.out.print("x = " + x + " [" + Long.toString(x, 2) + "],\ny = " + y + " [" + Long.toString(y, 2) + "]\n");
		System.out.print("z = x | y = " + z + " [" + Long.toString(z, 2) + "]\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если биты в i-ых позициях операндов не равны друг другу, или в 0 в противном случае – побитовое исключающее ИЛИ (\"^\");");
		z = (x ^ y);
		System.out.print("x = " + x + " [" + Long.toString(x, 2) + "],\ny = " + y + " [" + Long.toString(y, 2) + "]\n");
		System.out.print("z = x ^ y = " + z + " [" + Long.toString(z, 2) + "]\n");
		System.out.println(
				"сдвиг влево битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом не меняется) – побитовый сдвиг влево с учетом знака \"<<\";");
		System.out.print("x = " + x + " [" + Long.toString(x, 2) + "]\n");
		x = (x << 3);
		System.out.print("x << 3 = " + x + " [" + Long.toString(x, 2) + "]\n");
		System.out.println(
				"сдвиг вправо битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом не меняется) – побитовый сдвиг вправо с учетом знака \">>\";");
		System.out.print("y = " + y + " [" + Long.toString(y, 2) + "]\n");
		x = (y >> 3);
		System.out.print("y >> 3 = " + y + " [" + Long.toString(y, 2) + "]\n");
		System.out.println(
				"сдвиг вправо битов поля первого операнда на количество битов, определяемое вторым операндом (бит знака числа при этом также сдвигается) – побитовый сдвиг вправо без учета знака \">>>\".");
		System.out.print("z = " + z + " [" + Long.toString(z, 2) + "]\n");
		x = (z >>> 3);
		System.out.print("z >>> 3 = " + z + " [" + Long.toString(z, 2) + "]\n");
		System.out.println("--------------------------\n");
		System.out.println("Комбинированные операции:");
		x = 8;
		System.out.printf(
				"1. Выражение x += b означает x = x + b. \n\t x = %d \n\t b = %d \n\t x = %d + %d \n\t x = %d\n", x, 12,
				x, 12, x += 12);
		System.out.printf(
				"2. Выражение x -= b означает x = x — b. \n\t x = %d \n\t b = %d \n\t x = %d - %d \n\t x = %d\n", x, 12,
				x, 12, x -= 12);
		System.out.printf(
				"3. Выражение x *= b означает x = x * b. \n\t x = %d \n\t b = %d \n\t x = %d * %d \n\t x = %d\n", x, 12,
				x, 12, x *= 12);
		System.out.printf(
				"4. Выражение x /= b означает x = x / b. \n\t x = %d \n\t b = %d \n\t x = %d / %d \n\t x = %d\n", x, 12,
				x, 12, x /= 12);
		System.out.println("5. Выражение x %= b означает x = x % b.");
		System.out.println("\t x = " + x);
		System.out.println("\t b = " + b);
		System.out.println("\t x = " + x + " % " + b);
		System.out.println("\t x = " + x % b);
		System.out.printf(
				"6. Выражение x &= b означает x = x & b. \n\t x = %d \n\t b = %d \n\t x = %d & %d \n\t x = %d\n", x, 12,
				x, 12, x &= 12);
		System.out.printf(
				"7. Выражение x |= b означает x = x | b. \n\t x = %d \n\t b = %d \n\t x = %d | %d \n\t x = %d\n", x, 12,
				x, 12, x |= 12);
		System.out.printf(
				"8. Выражение x ^= b означает x = x ^ b. \n\t x = %d \n\t b = %d \n\t x = %d ^ %d \n\t x = %d\n", x, 12,
				x, 12, x ^= 12);
		System.out.printf(
				"9. Выражение x <<= b означает x = x << b. \n\t x = %d \n\t b = %d \n\t x = %d << %d \n\t x = %d\n", x,
				12, x, 12, x <<= 12);
		System.out.printf(
				"10. Выражение x >>= b означает x = x >> b. \n\t x = %d \n\t b = %d \n\t x = %d >> %d \n\t x = %d\n", x,
				12, x, 12, x >>= 12);
		System.out.printf(
				"11. Выражение x >>>= b означает x = x >>> b. \n\t x = %d \n\t b = %d \n\t x = %d >> %d \n\t x = %d\n",
				x, 12, x, 12, x >>= 12);
		System.out.println("--------------------------\n");
		System.out.println("Операции сравнения");
		System.out.println("\"==\" (равно)");
		System.out.printf("a == b --> %s \n", a == b);
		System.out.println("\"!=\" (не равно)");
		System.out.printf("a != b --> %s \n", a != b);
		System.out.println("\">\" (больше)");
		System.out.printf("a > b --> %s \n", a > b);
		System.out.println("\">=\" (больше или равно)");
		System.out.printf("a >= b --> %s \n", a >= b);
		System.out.println("\"<\" (меньше)");
		System.out.printf("a < b --> %s \n", a < b);
		System.out.println("\"<=\" (меньше или равно)");
		System.out.printf("a <= b --> %s \n", a <= b);
		System.out.println("");
		System.out.println("--------------------------\n");
		System.out.println("Булевские операции:");
		System.out.println("отрицание \"!\" – замена false на true, или наоборот;");
		System.out.printf("a = %d, b = %d, a != b = %s", a, b, a != b);
		System.out.println(
				"операция И \"&\" – результат равен true, только, если оба операнда равны true, иначе результат – false;");
		System.out.printf("a > b && a == b --> %s \n", a > b && a == b);
		System.out.printf("a == b && a > b --> %s \n", a == b && a > b);
		System.out.printf("a > b & a == b --> %s \n", a > b & a == b);
		System.out.printf("a == b & a > b --> %s \n", a == b & a > b);
		System.out.println(
				"операция ИЛИ \"|\" – результат равен true, только, если хотя бы один из операндов равен true, иначе результат – false.");
		System.out.printf("a > b || a == b --> %s \n", a > b || a == b);
		System.out.printf("a == b || a > b --> %s \n", a == b || a > b);
		System.out.printf("a > b | a == b --> %s \n", a > b | a == b);
		System.out.printf("a == b | a > b --> %s \n", a == b | a > b);
		System.out.println(
				"операция исключающее ИЛИ \"^\" – результат равен true, только, если операнды не равны друг другу, иначе результат – false.");
		a = 4;
		b = 4;
		System.out.printf("a = %d, b = %d, a ^ b = %s\n", a, b, a ^ b);
		b = 5;
		System.out.printf("a = %d, b = %d, a ^ b = %s\n", a, b, a ^ b);
		System.out.println("--------------------------\n");
	}

	public static void testFloat() {
		float a = 7.5f;
		float b = 3.8f;
		System.out.println("Операция присваивания -->  \"=\"");
		System.out.print("a = " + a + " \n");
		System.out.print("b = " + b + " \n");
		System.out.println("--------------------------\n");
		System.out.println("Унарные операции:");
		System.out.println("унарный минус \"-\" – меняет знак числа или выражения на противоположный");
		System.out.printf("-%f = %f \n", b, -b);
		System.out.println("унарный плюс \"+\" – не выполняет никаких действий над числом или выражением");
		System.out.printf("+%f = %f \n", a, +a);

		System.out.println("инкремент \"++\" (только для целых) – увеличивает значение переменной на 1");
		System.out.printf("%f++ = %f \n", a, a++);
		System.out.printf("++%f = %f \n", b, ++b);
		System.out.println("декремент \"--\" (только для целых) – уменьшает значение переменной на 1");
		System.out.printf("%f-- = %f \n", a, a--);
		System.out.printf("--%f = %f \n", b, --b);
		System.out.println("--------------------------\n");
		System.out.println("Арифметические бинарные операции:");
		System.out.println("сложение \"+\";");
		System.out.printf("%f + %f = %f \n", a, b, a + b);
		System.out.println("вычитание \"-\";");
		System.out.printf("%f - %f = %f \n", a, b, a - b);
		System.out.println("умножение \"*\";");
		System.out.printf("%f * %f = %f \n", a, b, a * b);
		System.out.println("деление \"/\";");
		System.out.printf("%f / %f = %f \n", a, b, a / b);
		System.out.println(
				"вычисление остатка от деления целых чисел \"%\" (возвращает остаток от деления первого числа на второе,");
		System.out.println(
				"причем результат будет иметь тот же знак, что и делимое), например, результат операции 5%3 будет равен 2,");
		System.out.println("а результат операции (-7)%(-4) будет равен -3.");
		System.out
				.println("В Java операция может использоваться и для вещественных переменных (типа float или double)");
		System.out.printf("%f %% %f = %f \n", a, b, a % b);
		System.out.println("--------------------------\n");
		System.out.println("Побитовые операции:");
		float x = 112.1f;
		float y = 94.4f;
		float z;
		System.out.println("--------------------------\n");
		System.out.println("Комбинированные операции:");
		System.out.printf(
				"1. Выражение x += b означает x = x + b. \n\t x = %f \n\t b = %f \n\t x = %f + %f \n\t x = %f\n", x,
				12f, x, 12f, x += 12f);
		System.out.printf(
				"2. Выражение x -= b означает x = x — b. \n\t x = %f \n\t b = %f \n\t x = %f - %f \n\t x = %f\n", x,
				12f, x, 12f, x -= 12f);
		System.out.printf(
				"3. Выражение x *= b означает x = x * b. \n\t x = %f \n\t b = %f \n\t x = %f * %f \n\t x = %f\n", x,
				12f, x, 12f, x *= 12f);
		System.out.printf(
				"4. Выражение x /= b означает x = x / b. \n\t x = %f \n\t b = %f \n\t x = %f / %f \n\t x = %f\n", x,
				12f, x, 12f, x /= 12f);
		System.out.println("5. Выражение x %= b означает x = x % b.");
		System.out.println("\t x = " + x);
		System.out.println("\t b = " + b);
		System.out.println("\t x = " + x + " % " + b);
		System.out.println("\t x = " + x % b);
		System.out.println("--------------------------\n");
		System.out.println("Операции сравнения");
		System.out.println("\"==\" (равно)");
		System.out.printf("a == b --> %s \n", a == b);
		System.out.println("\"!=\" (не равно)");
		System.out.printf("a != b --> %s \n", a != b);
		System.out.println("\">\" (больше)");
		System.out.printf("a > b --> %s \n", a > b);
		System.out.println("\">=\" (больше или равно)");
		System.out.printf("a >= b --> %s \n", a >= b);
		System.out.println("\"<\" (меньше)");
		System.out.printf("a < b --> %s \n", a < b);
		System.out.println("\"<=\" (меньше или равно)");
		System.out.printf("a <= b --> %s \n", a <= b);
		System.out.println("");
		System.out.println("--------------------------\n");
		System.out.println("Булевские операции:");
		System.out.println("отрицание \"!\" – замена false на true, или наоборот;");
		System.out.printf("a = %f, b = %f, a != b = %s", a, b, a != b);
		System.out.println(
				"операция И \"&\" – результат равен true, только, если оба операнда равны true, иначе результат – false;");
		System.out.printf("a > b && a == b --> %s \n", a > b && a == b);
		System.out.printf("a == b && a > b --> %s \n", a == b && a > b);
		System.out.printf("a > b & a == b --> %s \n", a > b & a == b);
		System.out.printf("a == b & a > b --> %s \n", a == b & a > b);
		System.out.println(
				"операция ИЛИ \"|\" – результат равен true, только, если хотя бы один из операндов равен true, иначе результат – false.");
		System.out.printf("a > b || a == b --> %s \n", a > b || a == b);
		System.out.printf("a == b || a > b --> %s \n", a == b || a > b);
		System.out.printf("a > b | a == b --> %s \n", a > b | a == b);
		System.out.printf("a == b | a > b --> %s \n", a == b | a > b);
		System.out.println("--------------------------\n");
	}

	public static void testDouble() {
		double a;
		double b;
		System.out.println("Операция присваивания -->  \"=\"");
		System.out.printf("a = %f \n", a = 7.5);
		System.out.printf("b = %f \n", b = 3.8);
		System.out.println("--------------------------\n");
		System.out.println("Унарные операции:");
		System.out.println("унарный минус \"-\" – меняет знак числа или выражения на противоположный");
		System.out.printf("-%f = %f \n", b, -b);
		System.out.println("унарный плюс \"+\" – не выполняет никаких действий над числом или выражением");
		System.out.printf("+%f = %f \n", a, +a);

		System.out.println("инкремент \"++\" (только для целых) – увеличивает значение переменной на 1");
		System.out.printf("%f++ = %f \n", a, a++);
		System.out.printf("++%f = %f \n", b, ++b);
		System.out.println("декремент \"--\" (только для целых) – уменьшает значение переменной на 1");
		System.out.printf("%f-- = %f \n", a, a--);
		System.out.printf("--%f = %f \n", b, --b);
		System.out.println("--------------------------\n");
		System.out.println("Арифметические бинарные операции:");
		System.out.println("сложение \"+\";");
		System.out.printf("%f + %f = %f \n", a, b, a + b);
		System.out.println("вычитание \"-\";");
		System.out.printf("%f - %f = %f \n", a, b, a - b);
		System.out.println("умножение \"*\";");
		System.out.printf("%f * %f = %f \n", a, b, a * b);
		System.out.println("деление \"/\";");
		System.out.printf("%f / %f = %f \n", a, b, a / b);
		System.out.println(
				"вычисление остатка от деления целых чисел \"%\" (возвращает остаток от деления первого числа на второе,");
		System.out.println(
				"причем результат будет иметь тот же знак, что и делимое), например, результат операции 5%3 будет равен 2,");
		System.out.println("а результат операции (-7)%(-4) будет равен -3.");
		System.out
				.println("В Java операция может использоваться и для вещественных переменных (типа float или double)");
		System.out.printf("%f %% %f = %f \n", a, b, a % b);
		System.out.println("--------------------------\n");
		System.out.println("Побитовые операции:");
		double x = 112.1;
		System.out.println("--------------------------\n");
		System.out.println("Комбинированные операции:");
		System.out.printf(
				"1. Выражение x += b означает x = x + b. \n\t x = %f \n\t b = %f \n\t x = %f + %f \n\t x = %f\n", x,
				12d, x, 12d, x += 12d);
		System.out.printf(
				"2. Выражение x -= b означает x = x — b. \n\t x = %f \n\t b = %f \n\t x = %f - %f \n\t x = %f\n", x,
				12d, x, 12d, x -= 12d);
		System.out.printf(
				"3. Выражение x *= b означает x = x * b. \n\t x = %f \n\t b = %f \n\t x = %f * %f \n\t x = %f\n", x,
				12d, x, 12d, x *= 12d);
		System.out.printf(
				"4. Выражение x /= b означает x = x / b. \n\t x = %f \n\t b = %f \n\t x = %f / %f \n\t x = %f\n", x,
				12d, x, 12d, x /= 12d);
		System.out.println("5. Выражение x %= b означает x = x % b.");
		System.out.println("\t x = " + x);
		System.out.println("\t b = " + b);
		System.out.println("\t x = " + x + " % " + b);
		System.out.println("\t x = " + x % b);
		System.out.println("--------------------------\n");
		System.out.println("Операции сравнения");
		System.out.println("\"==\" (равно)");
		System.out.printf("a == b --> %s \n", a == b);
		System.out.println("\"!=\" (не равно)");
		System.out.printf("a != b --> %s \n", a != b);
		System.out.println("\">\" (больше)");
		System.out.printf("a > b --> %s \n", a > b);
		System.out.println("\">=\" (больше или равно)");
		System.out.printf("a >= b --> %s \n", a >= b);
		System.out.println("\"<\" (меньше)");
		System.out.printf("a < b --> %s \n", a < b);
		System.out.println("\"<=\" (меньше или равно)");
		System.out.printf("a <= b --> %s \n", a <= b);
		System.out.println("");
		System.out.println("--------------------------\n");
		System.out.println("Булевские операции:");
		System.out.println("отрицание \"!\" – замена false на true, или наоборот;");
		System.out.printf("a = %f, b = %f, a != b = %s", a, b, a != b);
		System.out.println(
				"операция И \"&\" – результат равен true, только, если оба операнда равны true, иначе результат – false;");
		System.out.printf("a > b && a == b --> %s \n", a > b && a == b);
		System.out.printf("a == b && a > b --> %s \n", a == b && a > b);
		System.out.printf("a > b & a == b --> %s \n", a > b & a == b);
		System.out.printf("a == b & a > b --> %s \n", a == b & a > b);
		System.out.println(
				"операция ИЛИ \"|\" – результат равен true, только, если хотя бы один из операндов равен true, иначе результат – false.");
		System.out.printf("a > b || a == b --> %s \n", a > b || a == b);
		System.out.printf("a == b || a > b --> %s \n", a == b || a > b);
		System.out.printf("a > b | a == b --> %s \n", a > b | a == b);
		System.out.printf("a == b | a > b --> %s \n", a == b | a > b);
		System.out.println("--------------------------\n");
	}

	public static void testBoolean() {
		boolean a = true;
		boolean b = false;
		System.out.println("Операция присваивания -->  \"=\"");
		System.out.print("a = " + a + "\n");
		System.out.print("b = " + b + " \n");
		System.out.println("--------------------------\n");
		System.out.println("Унарные операции:");
		System.out.println("--------------------------\n");
		System.out.println("Арифметические бинарные операции:");
		System.out.println("--------------------------\n");
		System.out.println("Побитовые операции:");
		System.out.println(
				"Побитовые операции рассматривают исходные числовые значения как поля битов и выполняют над ними следующие действия:");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если оба бита в i-ых позициях операндов равны 1, или в 0 в противном случае – побитовое И (\"&\");");
		boolean x = true;
		boolean y = false;
		boolean z;
		z = x & y;
		System.out.print("x = " + x + ",\ny = " + y + "\n");
		System.out.print("z = x & y = " + z + "\n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если хотя бы один бит в i-ых позициях операндов равен 1, или в 0 в противном случае – побитовое ИЛИ (\"|\");");
		z = (x | y);
		System.out.print("x = " + x + " ,\ny = " + y + " \n");
		System.out.print("z = x | y = " + z + " \n");
		System.out.println(
				"установка бита в i-ой позиции поля результата в 1, если биты в i-ых позициях операндов не равны друг другу, или в 0 в противном случае – побитовое исключающее ИЛИ (\"^\");");
		z = (x ^ y);
		System.out.print("x = " + x + " ,\ny = " + y + " \n");
		System.out.print("z = x ^ y = " + z + " \n");
		System.out.println("--------------------------\n");
		System.out.println("Комбинированные операции:");
		System.out.printf(
				"6. Выражение x &= b означает x = x & b. \n\t x = %b \n\t b = %b \n\t x = %b & %b \n\t x = %b\n", x,
				true, x, true, x &= true);
		System.out.printf(
				"7. Выражение x |= b означает x = x | b. \n\t x = %b \n\t b = %b \n\t x = %b | %b \n\t x = %b\n", x,
				true, x, 12, x |= true);
		System.out.printf(
				"8. Выражение x ^= b означает x = x ^ b. \n\t x = %b \n\t b = %b \n\t x = %b ^ %b \n\t x = %b\n", x,
				true, x, 12, x ^= true);
		System.out.println("--------------------------\n");
		System.out.println("Операции сравнения");
		System.out.println("\"==\" (равно)");
		System.out.printf("a == b --> %b \n", a == b);
		System.out.println("\"!=\" (не равно)");
		System.out.printf("a != b --> %b \n", a != b);
		System.out.println("--------------------------\n");
		System.out.println("Булевские операции:");
		System.out.println("отрицание \"!\" – замена false на true, или наоборот;");
		System.out.printf("a = %b, b = %b, a != b = %b", a, b, a != b);
		System.out.println(
				"операция И \"&\" – результат равен true, только, если оба операнда равны true, иначе результат – false;");
		System.out.printf("a == b && a != b --> %b \n", a == b && a != b);
		System.out.printf("a == b && a == b --> %b \n", a == b && a == b);
		System.out.println(
				"операция ИЛИ \"|\" – результат равен true, только, если хотя бы один из операндов равен true, иначе результат – false.");
		System.out.printf("a > b || a == b --> %b \n", a == b || a != b);
		System.out.printf("a == b || a > b --> %b \n", a == b || a == b);
		System.out.println(
				"операция исключающее ИЛИ \"^\" – результат равен true, только, если операнды не равны друг другу, иначе результат – false.");
		System.out.printf("a = %b, b = %b, a ^ b = %b\n", a, b, a ^ b);
		System.out.println("--------------------------\n");
	}

	public static void testStudent() {
		Student studentKB = new Student();
		studentKB.setAge(22);
		studentKB.setName("Kostia");
		studentKB.setSurename("Bukin");
		Student studentChP = new Student("Chijick", "Pijick", 19);
		studentKB.sayPhrase("Hello everyone!!!!");
		StringJoiner sj = new StringJoiner(" ");
		sj.add("Hello. I am").add(studentChP.getName()).add(studentChP.getSurename() + ".").add("Let's be friends!");
		studentChP.sayPhrase(sj.toString());
		studentChP.setFriend(studentKB);
		studentKB.setFriend(studentChP);

		studentKB.startLern();
		if (studentKB.isAlive() && studentKB.isLearn()) {
			studentKB.sayPhrase("I am now beasy. I am learning Java.");
		}

	}

}
