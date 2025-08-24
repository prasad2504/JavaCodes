
public class Player {
	
	int player_id;
	String player_name;
	String game;
	String country;
	
	public void setPlayer_id(int p) {
		player_id = p;
	}
	public int getPlayer_id() {
		return player_id;
	}
	
	
	public void setPlayer_name(String s) {
		player_name = s;		
	}
	public String getPlayer_name() {
		return player_name;
	}
	
	
	public void setGame(String g) {
		game = g;
	}
	public String getGame() {
		return game;
	}
	
	public void setCountry(String a) {
		country = a;
	}
	public String getCountry() {
		return country;
	}
	

	public void printData() {
		System.out.println("Player_id :" + player_id);
		System.out.println("Player_name:" + player_name);
		System.out.println("Game Name :" + game);
		System.out.println("Country Name :" + country);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p1=new Player();
		p1.setPlayer_id(1);
		p1.setPlayer_name("Rohit-Sharma");
		p1.setGame("Cricket");
		p1.setCountry("India");
		p1.printData();
		
		Player p2=new Player();
		p2.setPlayer_id(2);
		p2.setPlayer_name("Ronaldo");
		p2.setGame("Football");
		p2.setCountry("portugal");
		p2.printData();
		
	}	

}
