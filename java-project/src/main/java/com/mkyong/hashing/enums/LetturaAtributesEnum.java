package com.mkyong.hashing.enums;

import java.lang.reflect.Method;
import java.util.function.Function;

import org.apache.poi.ss.usermodel.Cell;

import com.mkyong.hashing.FunctionUtils;
import com.mkyong.hashing.Veicolo;

public enum LetturaAtributesEnum {
	MARCA("marca", 0 , FunctionUtils.getStringByCell, String.class, Veicolo.getSetterMarca()), 
	TARGA("targa", 1, FunctionUtils.getStringByCell, String.class, Veicolo.getSetterTarga()),
	COLORE("colore", 2, FunctionUtils.getStringByCell, String.class, Veicolo.getSetterColore()),
	MODELLO("modello", 3, FunctionUtils.getStringByCell, String.class, Veicolo.getSetterModello()),
	ANNOIMMATRICOLAZIONE("annoImmatricolazione", 4, FunctionUtils.getIntByCell, Double.class, Veicolo.getSetterAnnoImmatricolazione()), 
	POTENZA("potenza", 5, FunctionUtils.getIntByCell, Double.class, Veicolo.getSetterPotenza());
	
	
	public String name;
	public int idx;
	public Function<Cell, Object> function;
	@SuppressWarnings("rawtypes")
	public Class clazz;
	public Method method;

	LetturaAtributesEnum(String name, int idx, Function<Cell, Object> function, @SuppressWarnings("rawtypes") Class clazz, Method method) {
		this.name = name;
		this.idx = idx;
		this.function = function;
		this.clazz = clazz;
		this.method = method;
	}
	
	public static LetturaAtributesEnum getEnumByIdxColumn(int idx) {
		for (LetturaAtributesEnum iterable_element : LetturaAtributesEnum.values()) {
			if (idx == iterable_element.idx) {
				return iterable_element;
			}
		}
		return null;		
	}
}
