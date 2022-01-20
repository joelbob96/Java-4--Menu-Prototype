public class Main{

	public static void main(String[] args){
	 
	 //MenuItem defaultItem = new MenuItem();
	 
	 MenuItem Item1 = new MenuItem("Cheeseburger", 3.99, "A Hamburger with cheese on it", 1);
	 
	 MenuItem Item2 = new MenuItem("Fries", 1.99, "10 ounces of French fries", 2);
	 
	 MenuItem Item3 = new MenuItem("Nuggets", 2.49, "10 of our crispy chicken nugggets", 3);
	 
	 MenuItem Item4 = new MenuItem("Chicken Sandwich", 3.49, "A fried crispy chicken sandwich", 4);
	 
	 MenuItem Item5 = new MenuItem("Breakfast sandwich", 3.99, "A sausage egg and cheese sandwich on a biscuit", 5);
	 
	 MenuItem Item6 = new MenuItem("Baconburger", 4.49, "A hamburger with bacon and cheese on it", 6);
	 
	 MenuItem Item7 = new MenuItem("Salad", 3.49, "A salad with iceburg lettace, carrots, spinich, and ranch", 7);
	 
	 MenuItem Item8 = new MenuItem("MonsterBurger", 5.49, "a 3 patty burger with bacon, cheese, and onions", 8);
	 
	 MenuItem Item9 = new MenuItem("Kids burger", 2.49, "A slightly smaller burger", 9);
	 
	 MenuItem Item10 = new MenuItem("Drink", 1.77, "a 12 oz drink of your choice", 10);
	 
	 //System.out.println(Item1);
	 
	 //System.out.println(defaultItem);
	 
	 Menu Menu1 = new Menu("Joel's Menu");
	 
	 Menu1.addItem(Item1);
	 
	 Menu1.addItem(Item2);
	 
	 Menu1.addItem(Item3);
	 
	 Menu1.addItem(Item4);
	 
	 Menu1.addItem(Item5);
	 
	 Menu1.addItem(Item6);
	 
	 Menu1.addItem(Item7);
	 
	 Menu1.addItem(Item8);
	 
	 Menu1.addItem(Item9);
	 
	 Menu1.addItem(Item10);
	 
	 //Menu1.addItem(defaultItem);
	 
	 System.out.println(Menu1);
	 
	 Ticket Ticket1 = new Ticket(12);
	 
	 Ticket1.addItem(Item1);
	 
	 Ticket1.addItem(Item10);
	 
	 Ticket1.addItem(Item2);
	 
	 System.out.println(Ticket1);
	 
	 Ticket Ticket2 = new Ticket(5);
	 
	 Ticket2.addItem(Item4);
	 
	 Ticket2.addItem(Item7);
	 
	 Ticket2.addItem(Item9);
	 
	 System.out.println(Ticket2);
	 
	 //System.out.println(Item1.getDescription());
	 
	 //Item1.setDescription("A patty made with high quality ground beef of a whole wheat bun with Lettace tomatoe and American Cheese");
	 
	 //System.out.println(Item1.getDescription());
	}
}