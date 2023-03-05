// import java.io.IOException;
// import java.lang.System.Logger;
// import java.lang.System.Logger.Level;
// import java.util.Arrays;
// import java.util.concurrent.ThreadLocalRandom;
// import java.util.logging.FileHandler;
// import java.util.logging.Handler;
// import java.util.logging.SimpleFormatter;

// public class seminar2 {
// public static void main(String[] args) throws IOException {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter massive size: ");
// int num = input.nextInt();
// int[] array = new int[num];
// SortMas(array, num);
// System.out.println(Arrays.toString(array));
// }

// private static void SortMas(int[] arr, int n) throws IOException {
// Logger logger = Logger.getLogger(task2.class.getName());
// ((Handler) logger).setLevel(null);(Level.INFO);
// FileHandler file = new FileHandler("task2_log.xml", true);
// ((Object) logger).addHandler(file);
// file.setFormatter(new SimpleFormatter());
// logger.log(Level.INFO, "Massive before: " + Arrays.toString(arr) + "\n");
// System.out.println(Arrays.toString(arr));
// logger.log(Level.INFO, "Massive after: " + Arrays.toString(arr) + "\n");

// ThreadLocalRandom randomNum = ThreadLocalRandom.current();
// for (int i = 0; i < arr.length; i++) {
// arr[i] = (randomNum.nextInt(0, 10));
// }

// logger.log(Level.INFO, "Massive before: " + Arrays.toString(arr) + "\n");

// for (int i = 0; i < n; i++) {
// for (int j = i; j < n; j++) {
// if (arr[i] > arr[j]) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// logger.log(Level.INFO, Arrays.toString(arr) + "\n");
// }
// }
// }
// logger.log(Level.INFO, "Massive after: " + Arrays.toString(arr) + "\n");
// file.close();
// }
// }

// public class seminar2 {

// public static void main(String[] args) {
// String s = "шалаш";
// if (palindrom(s)) {
// System.out.println("\nВведенная строка - палиндром!\n");
// } else {
// System.out.println("\nВведенная строка - НЕ палиндром!\n");
// }
// }

// public static boolean palindrom(String s) {
// String temp = "";
// int l = s.length();
// for (int i = 0; i < l; i++) {
// temp = temp + s.charAt(l - i - 1);
// }
// if (temp.equals(s)) {
// return true;
// } else {
// return false;
// }
// }
// }

// public class seminar2

// {
// public static void main(String[] args) {
// String json =
// "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
// "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
// "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
// String[] res = json.replaceAll("[^a-zA-Zа-яА-Я0-9:,]", "")
// .replaceAll("[^a-zA-Zа-яА-Я0-9]", " ")
// .split(" ");
// StringBuilder result = new StringBuilder();
// for (int i = 0; i < res.length; i += 6) {
// result.append("Студент ")
// .append(res[i + 1])
// .append(" получил ")
// .append(res[i + 3])
// .append(" по предмету ")
// .append(res[i + 5])
// .append(".\n");
// }
// System.out.println(result);
// }
// }