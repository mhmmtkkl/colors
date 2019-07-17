package src;


import java.util.ArrayList;
//comment

public class Colors {
	private ArrayList<String> colorsList = new ArrayList<String>();
	
//	you dont need to touch until line 25 
	public Colors (ArrayList<String> colors) {
		if(colors!= null)
		this.colorsList = colors;
	}

	public ArrayList<String> getColorsList() {
		return colorsList;
	}

	public void setColorsList(ArrayList<String> colorsList) {
		this.colorsList = colorsList;
	}
	
	
	
//	add parameter color tp arrayList colorsList
	public void addColor(String color) {
//	 write code here
		
		
		colorsList.add(color);
		
		
	}
	
//	add colors arraylist to colorsList arraylist
	public void addColors(ArrayList<String> colors) {
//		 write code here
		
	}
	
//	change even numbers to Orange like list 0 = Orange ,, list 2 = Orange
	public ArrayList<String> changeSecondToOrange() {
	
//		 write code here
		ArrayList<String> newColorsList = new ArrayList<String>();
		 
		return newColorsList;
	}
	
//	find color in the list and return the position of it if color is not in the list return -1
	public int findColor(String color) {
		 
//		 write code here
		return 0;
	}
	
//	get how many color in the list Like orange 2 or red 3 if color is not in the list return 0
	public int getColorCount(String color) {
//		 write code here 
		
		return 0;
	}
	
//	if there is a duplicates in the list remove them like = red red orange return== red orange
	public void removeDuplicates() {
		 
	}
	
//	replace color1 to replacementColor 
	public boolean replaceColor(String color1, String replacementColor) {
		 
		return false;
		
	}

}
