package com.mkyong.hashing;

import java.util.function.Function;

import org.apache.poi.ss.usermodel.Cell;


public class FunctionUtils {

	public static Function<Cell, Object> getStringByCell = (cell) -> { return cell.getStringCellValue();};
	
	public static Function<Cell, Object> getDoubleByCell = (cell) -> { return cell.getNumericCellValue();};

	public static Function<Cell, Object> getIntByCell = (cell) -> { return (int)cell.getNumericCellValue();};

}
