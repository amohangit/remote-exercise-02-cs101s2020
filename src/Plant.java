public class Plant{
	public String[] plantProcessor(FileUtility util){
		int size = util.size();
		int marker = 0;
		String filecontents = "";
		for (int i = 0; i < size; i++){
			String line = util.read();	
			if (line.contains("<PLANT>")){
				if (marker > 0)
					filecontents += "\n";
				marker = i;
			}
			if ((i - marker) > 0 && (i - marker) <= 6)
				filecontents += line;	
			
		}
		util.reset();
		String[] listOfPlants = filecontents.split("\n");
		return listOfPlants;
	}
	public void displayPlants(String[] listOfPlants){
		/*
		for (String item: listOfPlants){
			System.out.println(item);
		}  // This will simply print all the plant items.
		*/

		for(int i =0; i < listOfPlants.length; i++){
			System.out.println(listOfPlants[i]);
		}


	}

	/*
		more operations - 
		addPlant, deletePlant, updatePlant operations ...
	*/
	
	/*
		more implementation (analysis) - 
		// Let us ask some questions on the data:
		// q1 - show the plants that are priced less than 5$?
		// q2 - show the plants that require sunlight?
		// q3 - show the plants that are from planting zone 3?
	*/

}