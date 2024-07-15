package Operation;

public class Ex1 {
	public static void main(String[] args) {
		int month = 13;
		String season;
		if(month==1 || month == 2 || month == 12) {
			season = " 겨울이 왔어요 ";
		}else if(month >= 3 && month <= 5) {
			season = " 봄 ";
		}else if(month >=6 && month <=8) {
			season = " 여름 ";
		}else if(month >= 9 && month <= 11) {
			season = "가을";
		}else {
			season = " 잘못 입력하셨습니다.";
		}
		System.out.println(season);
	}

}
