package uk.ac.uk.b3030113.csc2022.prototpye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BudgetDataInput {
	
	public static ArrayList<String[]> getData(){
		
		
		
		String[][] source = {{"Utilities","100","02/03/15","02/04/15","100"}
		,{"Fuel","30","05/03/15","05/04/15","25"}
		,{"Food","70","08/03/15","08/04/15","35"}
		,{"Personal","40","04/03/15","04/04/15","5"},{"Personel","40","04/03/15","04/04/15","5"}};
		
		
		ArrayList<String[]> budgetData = new ArrayList<String[]>();
		
		for ( int i = 0 ; i< source.length; i++)
		{
			budgetData.add(source[i]);
		}
		
		return budgetData;
		
	}
	
	
	
}
