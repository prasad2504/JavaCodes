
public class Main {
	
	public static void main(String[] args) {
		Result r1 = new Result();
		r1.setData(1,"prasad");
		r1.setMarks(50,25);
		r1.setSportsMarks();
		r1.setDanceMarks();
		r1.setMusicMarks();
		
		
		r1.showData();  
		r1.showSportsMarks();
		r1.showDanceMarks();
		r1.showMusicMarks();
		
		r1.showResult();
		
	}
	

}
