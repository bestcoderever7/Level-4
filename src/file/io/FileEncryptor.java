package file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryptor {

	public static File openSecretFile() throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Directory/Untitled3");
		return file;
	}

	public static Object readOneLine(File file) throws IOException {
		// TODO Auto-generated method stub
		file = new File("Directory/Untitled3");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		return reader.readLine();
	}

	public static String readFileContents(File file) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String s = "";
		String line = reader.readLine();
		while(line!=null)
		{
			s = s + line;
			line = reader.readLine();
		}
		reader.close();
		return s;
	}

	public static String encrypt(String encryptMe) {
		// TODO Auto-generated method stub
		encryptMe = encryptMe.replaceAll("l", "n");
		encryptMe = encryptMe.replaceAll("a", "c");
		return encryptMe;
	}

	public static File saveFile(String string) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Directory/" + string);
		FileWriter writer = new FileWriter(file);
		writer.write("hi");
		writer.close();
		return file;
	}

	public static void saveStuffInAFile(String string, File file) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter(file);
		writer.write(string);
		writer.close();
	}

	public static Object decrypt(String decryptMe) {
		// TODO Auto-generated method stub
		decryptMe = decryptMe.replaceAll("n", "l");
		decryptMe = decryptMe.replaceAll("c", "a");
		return decryptMe;
	}

}
