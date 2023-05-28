package Abstract_program;

public class SubjectB extends Marks{
	
	float total;

	SubjectB(int science, int social, int english, int viva ){
		
		total = science + social + english + viva;
		
	}
	
	float getPercentage() {
		
		float percent = total/4;
		return percent;
		
	}

}
