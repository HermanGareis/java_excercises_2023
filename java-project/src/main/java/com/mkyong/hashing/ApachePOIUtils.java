package com.mkyong.hashing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mkyong.hashing.enums.LetturaAtributesEnum;

public class ApachePOIUtils {

	public static void readFile(String filePath, List<Veicolo> vehicles) throws IOException {

		try {

			FileInputStream file = new FileInputStream(new File(filePath));
			Workbook workbook = new XSSFWorkbook(file);

			Sheet sheet = workbook.getSheetAt(0);

			int i;
			for (Row row : sheet) {
				Veicolo automobile = new Automobile();
				i = 0;
				for (Cell cell : row) {
					LetturaAtributesEnum laEnum = LetturaAtributesEnum.getEnumByIdxColumn(i);

					Object result = laEnum.function.apply(cell);

					if (laEnum.clazz == Double.class) {						
						//Double temp = (Double) result;						
						laEnum.method.invoke(automobile, (int)result);								
					} else {
						laEnum.method.invoke(automobile, (String) result);	
					}
					
					i++;
				}
				vehicles.add(automobile);
			}

			workbook.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
};
