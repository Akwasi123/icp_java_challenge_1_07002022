import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InventoryProgram{
	// Creating instance variables for the inventory class
	private static String  itemName;
	private static int quantity;
	private static double price;
	
	//Creating main and backup files
	static File fileName =new File("essentials.txt");
	static File fileName2=new File("backup_essentials.txt");
	
	public InventoryProgram() {
		itemName = "No Item";
		quantity = 0;
		price = 0.00;
		
	}
	
	//Method to retrieve Item Name 
	public static String getItemName() {
		return itemName;
	}
	// Method to retrieve the Quantity
	//(Static Method because we want to access them throughout the program
	public static int getQuantity() {
		return quantity;
	}
	//Method to retrieve the Price of the product or Item
	public static double getPrice() {
		return price;
	}
	// Used the Scanner object to retrieve input from the user
	// Item name is passed as input in this method
	@SuppressWarnings("resource")
	public void setItemName() {
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter item Name here: ");
		itemName = input1.nextLine();
	}
	// Used the Scanner object to retrieve input from the user
	// Quantity is passed as input in this method
	@SuppressWarnings("resource")
	public void setQuantity() {
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter Quantity here: ");
		quantity = input2.nextInt();
	}
	
	// Used the Scanner object to retrieve input from the user
	// Price is passed as input in this method
	@SuppressWarnings("resource")
	public void setPrice() {
		Scanner input3 = new Scanner(System.in);
		System.out.print("Enter Price here: ");
		price = input3.nextDouble();
	}
	
	// Method to create inventory of items and store the data into a file
	public void CreateItem() {
		setItemName();
		setQuantity();
		setPrice();
		WriteToFile();
	}
	
	// Method that allows the information or data to be written to the file
	public void WriteToFile() {
		try {
			PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileName,true));
			PrintWriter printWriter1 = new PrintWriter(new FileOutputStream(fileName2,true));
			printWriter.println("Item: " +getItemName() + "  \nQuantity: " +getQuantity()+ "  \nPrice: " +getPrice()+ "\n" +  "---------------------------------------------------------" );
			System.out.println();
			printWriter1.println("Item: " +getItemName() + "  \nQuantity: " +getQuantity()+ "  \nPrice: " +getPrice()+ "\n" +  "---------------------------------------------------------");
			printWriter.close();
			printWriter1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Displays the contents of the file from both the main and backup files
	public static  void DisplayContent()throws FileNotFoundException{
		System.out.println("Output of essentials_stock.txt: ");
		Scanner readfile = new Scanner(fileName);
		while(readfile.hasNextLine())
		{System.out.println(readfile.nextLine());}
		readfile.close();
		System.out.println();
		
		System.out.println("Output of backup_essentials_stock.txt: ");
		Scanner readfile2 = new Scanner(fileName2);
		while(readfile2.hasNextLine())
		{System.out.println(readfile2.nextLine());}
		readfile2.close();
		
	}	
	
	
}
