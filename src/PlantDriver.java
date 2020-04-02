public class PlantDriver{
	public static void main(String[] args){
		FileUtility util = new FileUtility("../data/plant.txt");
		Plant plant = new Plant();
		String[] lsOfPlants = plant.plantProcessor(util);
		plant.displayPlants(lsOfPlants);
		
		
	}
}