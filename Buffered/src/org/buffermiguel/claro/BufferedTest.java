package org.buffermiguel.claro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class BufferedTest {

	private static final Logger LOGGER = Logger.getLogger(BufferedTest.class.getName());

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("D:\\fichero1.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\fichero1.txt"));) {

			escribirFichero(bw);

			leerFichero(br);

		} catch (IOException e) {

			LOGGER.info("error");

		}

	}

	private static void leerFichero(BufferedReader br) throws IOException {

		String linea = br.readLine();

		while (linea != null) {
			LOGGER.info(linea);
			linea = br.readLine();

		}
		br.close();

	}

	private static void escribirFichero(BufferedWriter bw) throws IOException {

		bw.write("mate1 ");
		bw.newLine();
		bw.write("traductores");
		bw.flush();
		bw.close();
	}
}
