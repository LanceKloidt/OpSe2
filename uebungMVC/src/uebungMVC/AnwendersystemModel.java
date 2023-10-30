package uebungMVC;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AnwendersystemModel {
	public String getUeberschrift() {
		return "Hallo";
	}
	
	public void schreibeDatei(String inhalt) throws IOException {
		
			BufferedWriter writer = new BufferedWriter(new FileWriter("ausgabe.txt"));
		writer.write(inhalt);
		writer.close();
		System.out.println("Text ausgegeben");
	}
}
