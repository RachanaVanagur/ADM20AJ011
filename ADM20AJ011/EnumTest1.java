class EnumTest1 
{
	static void getDirections(Directions dir){
		switch(dir){
			//case Directions.NORTH: //error: an enum switch case label must be the unqualified name of an enumeration constant
			case NORTH:
				System.out.println("Moving in the NORTH Direction");
				break;
			case SOUTH:
				System.out.println("Moving in the SOUTH Direction");
				break;
			case EAST:
				System.out.println("Moving in the EAST Direction");
				break;
			case WEST:
				System.out.println("Moving in the WEST Direction");
				break;
		}
	}

	public static void main(String[] args) 
	{
		Directions movement = Directions.NORTH;
		System.out.println(movement.getClass().getName());
		
		getDirections(Directions.SOUTH);
		getDirections(movement);

		//to iterate through an Enum variable?
		System.out.print("Pre-defined Directions are:      ");
		Directions[] dirs = Directions.values();
		for(Directions dir : dirs){
			System.out.print(dir + " | ");
		}
		System.out.println();

		System.out.println(Directions.valueOf("NORTH"));//NORTH
	}
}
