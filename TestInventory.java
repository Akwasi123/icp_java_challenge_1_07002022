public class TestInventory{
  public static void main(String args[]) throws FileNotFoundException {
		//Creating inventory objects
		System.out.println("----Taking an Inventory----");
		InventoryProgram item1 = new InventoryProgram();
		InventoryProgram item2 = new InventoryProgram();
		InventoryProgram item3 = new InventoryProgram();
		InventoryProgram item4 = new InventoryProgram();
		InventoryProgram item5 = new InventoryProgram();
		InventoryProgram item6 = new InventoryProgram();
		InventoryProgram item7 = new InventoryProgram();
		InventoryProgram item8 = new InventoryProgram();
		InventoryProgram item9 = new InventoryProgram();
		InventoryProgram item10 = new InventoryProgram();
		
		// Calling methods to create the inventory items and add to the file
		item1.CreateItem();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		item2.CreateItem();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		item3.CreateItem();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		item4.CreateItem();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		item5.CreateItem();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		item6.CreateItem();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		item7.CreateItem();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		item8.CreateItem();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		item9.CreateItem();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		item10.CreateItem();
		System.out.println("----------------------------------------------------------------");
		InventoryProgram.DisplayContent();
		
		
		
		

	}
}
