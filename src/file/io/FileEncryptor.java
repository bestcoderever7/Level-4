package file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

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

	public static String encrypt(String encryptMe) throws IOException {
		// TODO Auto-generated method stub
		String placeholder = encryptMe;
		encryptMe = "";
		HashMap<Integer, String> getLetter = new HashMap<Integer, String>();
		HashMap<String, Integer> getNumber = new HashMap<String, Integer>();
		File file = new File("Directory/key");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		int lines = 0;
		String line = "";
		String line2 = "";
		String line3 = "";
		while(((line = reader.readLine())) != null)
		{
			System.out.println(line);
			getLetter.put(Integer.parseInt(line), reader.readLine());
			getNumber.put(reader.readLine(), Integer.parseInt(reader.readLine()));
		}
		int length = placeholder.length();
		for(int i = 0; i < length; i++)
		{
			int number = getNumber.get(Character.toString(placeholder.charAt(i))) - 2;
			if(number == 0)
			{
				number = 26;
			} else if(number == -1)
			{
				number = 25;
			}
			encryptMe = encryptMe + getLetter.get(number);
		}
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
