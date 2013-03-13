import java.io.IOException;
import java.util.Formatter;
import java.util.Date;

public class CreateFile {
	private Formatter file;
	Date date = new Date();

	public void openFile(){
		try {
			//Sets the status of Formatter file so that it edits LogFile.txt.
			// If LogFile.txt does not exist, then it will be created in the root directory.
			String fileName = "LogFile.txt";
			file = new Formatter(fileName);

			//Basic headers for the log file. Inputs the date of when the file was created.
			file.format(fileName);
			file.format("\nThis file was created on %1$tA, %1$td %1$tB %1$tY. %1$TH:%1$TM:%1$TS\n", date);
		}
		//In case the file is not found.
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void addToFile(String add){
		file.format("\n%1$TH:%1$TM:%1$TS ", date);
		file.format(add);
	}

	public void closeFile(){
		file.close();
	}
}
