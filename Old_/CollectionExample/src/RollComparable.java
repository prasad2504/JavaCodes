import java.util.Comparator;

public class RollComparable implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getRoll()>s2.getRoll()) {
			return 1 ;
		}
		else if (s1.getRoll()<s2.getRoll()) {
			return -1;
		}
		// TODO Auto-generated method stub
		return 0;
	}

}
