
public class Result extends Exam implements Sports,Music,Dance {

	int spmarks;
	int mumarks;
	int dmarks;
	int total;

	
//	----------------------------------------------------------------------
	@Override
	public void setDanceMarks() {
		dmarks=6;
		
	}	
	public void showDanceMarks() {
		System.out.println("Dance Marks :" +dmarks);
	}
	
//----------------------------------------------------------------------
	@Override
	public void setMusicMarks() {
		mumarks = 5;
		
		
	}
	public void showMusicMarks() {
		System.out.println("Music Marks :" +mumarks);
	}
	
//------------------------------------------------------------------------------
	@Override
	public void setSportsMarks() {
		spmarks =10;
		
	
		
	}
	public void showSportsMarks() {
		System.out.println("Sports Marks :" +spmarks);
	}
	

//--------------------------------------------------------------------------
	
	public void showResult() {
		total = mark1+mark2+dmarks+spmarks+mumarks;
		System.out.println("Total marks :" + total);
		System.out.println("Average marks :" +total/5);
		
	}
	

}

//---------------------------------------------------------------------------
