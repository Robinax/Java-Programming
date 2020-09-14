
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parse {
	public static int i = 0;
	public static String COMMA_DELIMITER = ",";
	public static int workApp = 0;
	public static String Lines = "\n";

	public static void main(String[] args) {
		List<List<String>> records = new ArrayList<>();
		int row = 1;
		try (Scanner scanner = new Scanner(new File("sample.csv"), "UTF-8");) {
			while (scanner.hasNextLine()) {

				records.add(getRecordFromLine(scanner.nextLine(), row));

			}
			records.remove(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (List<String> b : records) {
			System.out.println(b);
		}
		List<String> nameswithA = new ArrayList<String>();
		for (int i = 0; i < records.size(); i++) {
			List<String> localValules = records.get(i);
			if (localValules.get(1).toLowerCase().contains("a")) {
				nameswithA.add(localValules.get(1));
			}
			if (localValules.get(2).toLowerCase().contains("a")) {
				nameswithA.add(localValules.get(2));
			}

		} // checks records and stores all the names that contains an a.

		List<Integer> checkTime = new ArrayList<>();
		for (int i = 0; i < records.size(); i++) {
			List<String> checkline = records.get(i);
			for (List<String> line : records) {

				if ((!line.equals(checkline)) && (line.get(0).equals(checkline.get(0)))) {

					checkTime.add(i);
				}
			}
		}

		System.out.println("\n\n");
		System.out.println("There is " + nameswithA.size() + " with the letter a in their name");
		System.out.println("\n");

		System.out.println("There are " + checkTime.size() + " groups that have the same Timestamps:");

		for (Integer i : checkTime) {
			System.out.print("Group: ");
			System.out.print(records.get(i).get(1));
			System.out.print(" and ");
			System.out.print(records.get(i).get(2));
			System.out.println(".");
		}
	
		System.out.println("\n");
		System.out.println("There is " + workApp + " that are gonna work with Android apps.");

	}

	private static List<String> getRecordFromLine(String lines, int i) {
		List<String> values = new ArrayList<String>();
		try (Scanner rowScanner = new Scanner(lines)) {
			rowScanner.useDelimiter(COMMA_DELIMITER);

			while (rowScanner.hasNext()) {
				values.add(rowScanner.next());
			}
			if (values.get(6).contains("Android App")) {// here i check how many will be working with the android app.
				workApp++;
				workApp++;
			}
		}
		return values;
	}

}
