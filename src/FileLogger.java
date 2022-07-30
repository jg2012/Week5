import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogger implements Logger{

	private BufferedWriter writer; 
	
	public FileLogger() {
		try {
			writer = new BufferedWriter(new FileWriter("logs.txt"));
			writer.newLine(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void info(String info) {
		Date date = new Date(); 
		try {
			writer.append("Info: " + date.toString() + " - " + info);
			writer.newLine(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	public void warning(String warning) {
		Date date = new Date(); 
		try {
			writer.append("WARNING: " + date.toString() + " - " + warning);
			writer.newLine(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
	}

	@Override
	public void error(String error) {
		Date date = new Date(); 
		try {
			writer.append("ERROR: " + date.toString() + " - " + error);
			writer.newLine(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date(); 
		try {
			writer.append("WARNING: " + date.toString() + " - " + fatal);
			writer.newLine(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void close() {
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

}
