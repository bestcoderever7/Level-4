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
		while (line != null) {
			s = s + line;
			line = reader.readLine();
		}
		reader.close();
		return s;
	}

	public static String encrypt(String encryptMe) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("called");
		HashMap<Integer, String> getLetter = new HashMap<Integer, String>();
		HashMap<String, Integer> getNumber = new HashMap<String, Integer>();
		File file = new File("Directory/key");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		String line = "";
		while (((line = reader.readLine())) != null) {
			getNumber.put(line.substring(3), Integer.parseInt(line.substring(0, 2)));
			getLetter.put(Integer.parseInt(line.substring(0, 2)), line.substring(3));
		}
		reader.close();
		fr.close();
		String backup = encryptMe;
		encryptMe = "";
		int i = 0;
		while (encryptMe.length() < backup.length()) {
			if (Character.toString(backup.charAt(i)).equals(" ")) {
				encryptMe = encryptMe + Character.toString(backup.charAt(i));
			} else {
				System.out.println(Character.toString(backup.charAt(i)));
				int num = (getNumber.get(Character.toString(backup.charAt(i)))) + 2;
				if (num == 27) {
					num = 1;
				} else if (num == 28) {
					num = 2;
				}
				encryptMe = encryptMe + getLetter.get(num);
			}
			i++;
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

	public static Object decrypt(String decryptMe) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		HashMap<Integer, String> getLetter = new HashMap<Integer, String>();
		HashMap<String, Integer> getNumber = new HashMap<String, Integer>();
		File file = new File("Directory/key");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		String line = "";
		while (((line = reader.readLine())) != null) {
			getNumber.put(line.substring(3), Integer.parseInt(line.substring(0, 2)));
			getLetter.put(Integer.parseInt(line.substring(0, 2)), line.substring(3));
		}
		reader.close();
		fr.close();
		String backup = decryptMe;
		decryptMe = "";
		int i = 0;
		while (decryptMe.length() < backup.length()) {
			if (Character.toString(backup.charAt(i)).equals(" ")) {
				decryptMe = decryptMe + Character.toString(backup.charAt(i));
			} else {
				System.out.println(Character.toString(backup.charAt(i)));
				int num = (getNumber.get(Character.toString(backup.charAt(i)))) - 2;
				if (num == 0) {
					num = 26;
				} else if (num == -1) {
					num = 25;
				}
				decryptMe = decryptMe + getLetter.get(num);
			}
			i++;
		}
		return decryptMe;
	}

}
