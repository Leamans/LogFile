import java.util.Date;

public class Main {
    public static void main(String[] args) {
		//This main file is just for testing the CreateFile.
		// You can print anything you would like to to the LogFile.txt.

		CreateFile file = new CreateFile();
		Date date = new Date();

		int[] intArray = new int[8];
		int element = 2;

		file.openFile();
		for(int i = 0; i < intArray.length; i++){
			intArray[i] = element;
			element *= 2;
		}

		try {
			for(int pos = 0; pos < 15; pos++){
				file.addToFile("Index " + pos + ": " + intArray[pos]);

				System.out.println(intArray[pos]);
			}
		} catch(ArrayIndexOutOfBoundsException e){
			file.addToFile("ERROR! You have an error relating to " + e.getClass() + "\nIndex " + e.getLocalizedMessage() + " does not exist.");
		}
		file.closeFile();
    }
}
