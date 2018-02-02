import java.util.Scanner;

public class Lab02{
	public static void main(String[] args){
		System.out.println("Необходимо спроектировать и разработать простейшее интерактивное");
		System.out.println("приложение, которое бы спрашивала у пользователя соответствующую");
		System.out.println("информацию о нём (к примеру, дату рождения, где работает, кем работает,");
		System.out.println("хобби и увлечения, любимый афоризм или лозунг, семейное положение,");
		System.out.println("сколько в день работает, отдыхает и т.д.), а затем выводит всю введённую");
		System.out.println("пользователем информацию в табличном виде на экран монитора.");
		System.out.println("");
		String name = "";
		String numGroup = "";
		String job = "";
		String hobby = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите свое имя");
		name = scanner.nextLine();
		System.out.println("Введите номер группы");
		numGroup = scanner.nextLine();
		System.out.println("Введите основной вид деятельности");
		job = scanner.nextLine();
		System.out.println("Введите увлечения");
		hobby = scanner.nextLine();
		System.out.println("=============================");
		System.out.println("Вас зовут " + name);
		System.out.println("Вы учитесь в " + numGroup + " группе");
		System.out.println("Ваш основной вид деятельности - " + job);
		System.out.println("Ваши увлечения - " + hobby);
		System.out.println("=============================");
	}
}