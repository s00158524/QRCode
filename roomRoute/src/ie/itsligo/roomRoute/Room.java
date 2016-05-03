package ie.itsligo.roomRoute;

public class Room {
	private String room;

	public Room() {
		
	}
	
	public String get(String data)
	{
		room = "ParseDoesnotWork";
		// TODO extract the room number eg E2004 from the data passed in
		// Here you write the code to parse the data string and extract
		// the room0
		String str = data;
		String delims = "[: \n]+";
		String[] tokens = str.split(delims);
		room = tokens[12];
		
		
		
		
		return(room);
	}

}
