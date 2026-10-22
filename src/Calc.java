import java.time.LocalDate;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bYear = 1984;
		int thisYear = LocalDate.now().getYear();
		int age = thisYear - bYear;
		
		System.out.printf("당신은 만%d 살입니다. %d가 맞습니까?" , age ,age);
		
	}

}
