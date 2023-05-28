package Abstract_program;

public class SubjectA extends Marks{
	
	float total;

	SubjectA(int science, int social, int english ){
		
		total = science + social + english;
		
	}
	
	float getPercentage() {
		
		float percent = total/3;
		return percent;
		
	}
	
	

}
