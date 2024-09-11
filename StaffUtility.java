package math.examples;

import java.util.ArrayList;

public class StaffUtility {
	
	public static void main(String[] args) {
		
		int cutoff = 26; 
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		ArrayList<Employee> searchResults = searchStaffByAge(employees, cutoff);
		
	}
	
	/**
	 * Return a list of all employees in input list at or below cut off age (inclusive)
	 * @param inputList
	 * @param cutoff
	 * @return
	 */
	public static ArrayList<Employee> searchStaffByAge(ArrayList<Employee> inputList, int cutoff) throws IllegalArgumentException {
		// check for input list empty or null
		
		if(inputList == null) {
			throw new IllegalArgumentException("Null input list not valid");
		}
		
		// check for negative cut off value
		if(cutoff < 0) {
			throw new IllegalArgumentException("cutoff below 0 not valid for search");
		}
		
		// consider throwing illegalArgument Exception in those cases...
		
		ArrayList<Employee> results = new ArrayList<Employee>();
		
		for (Employee e : inputList) {
			if(e.getAge()<= cutoff) {
				results.add(e);
			}
		}

		return results;
	}

	
	
	
}
