package com.company.technique;

import java.util.ArrayList;

public class ServiceCas4 {

	private ArrayList<Boolean> tables = null;
	
	public void loadSetup(ArrayList<Boolean> tableData) {
		this.tables = tableData;
	}
	
	/**
	 * Get First available table
	 * @return
	 */
	public int getAvailableTable() {
		int firstAvailable = 0;
		while ( firstAvailable < tables.size() && !tables.get(firstAvailable) ) {
			firstAvailable++;
		}
		
		if ( firstAvailable == tables.size() ) {
			return -1;
		} else {
			return firstAvailable;
		}
	}
	
}
