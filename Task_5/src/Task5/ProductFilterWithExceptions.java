package Task5;

import java.io.*;
import java.util.*;

public class ProductFilterWithExceptions {
	public static void main(String[] args) {
		String inputFile = "products.csv";
		String outputFile = "expensive_products.csv";
		double priceThreshold = 100.0;

		BufferedReader reader = null;
		BufferedWriter writer = null;

		try {
			reader = new BufferedReader(new FileReader(inputFile));
			writer = new BufferedWriter(new FileWriter(outputFile));

			String line;
			while ((line = reader.readLine()) != null) {
				try {
					String[] parts = line.split(",");
					if (parts.length != 2) {
						throw new InvalidProductDataException("Invalid row: " + line);
					}

					String name = parts[0].trim();
					double price;

					try {
						price = Double.parseDouble(parts[1].trim());
					} catch (NumberFormatException e) {
						throw new InvalidProductDataException("Invalid price format in row: " + line);
					}

					if (price > priceThreshold) {
						writer.write(name + "," + price);
						writer.newLine();
					}
				} catch (InvalidProductDataException e) {
					System.err.println("Skipping row - " + e.getMessage());
				}
			}

			System.out.println("Expensive products have been written to " + outputFile);
		} catch (FileNotFoundException e) {
			System.err.println("File not found:" + inputFile);
		} catch (IOException e) {
			System.err.println("Error reading/writing file: " + e.getMessage());
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				System.err.println("Error closing resources: " + e.getMessage());
			}
		}
	}
}
