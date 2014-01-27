package com.bestsales.sales.domain;

import java.io.Serializable;

public class Table implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -465769342645078148L;

	private int tableId;
	
	private int tableSize;
	
	private int tableLevel;

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public int getTableSize() {
		return tableSize;
	}

	public void setTableSize(int tableSize) {
		this.tableSize = tableSize;
	}

	public int getTableLevel() {
		return tableLevel;
	}

	public void setTableLevel(int tableLevel) {
		this.tableLevel = tableLevel;
	}
	
	
}
