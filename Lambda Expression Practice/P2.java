package PracticeOfLambdaExp;

//...........[Easy Question]...........//
//....(2)Check if Number is Even/Odd....//

interface I2{
	void checkWeatherOfNumber(int num);
	
}
public class P2 {
	public static void main(String[] args) {
		I2 i = (num) -> {if(num%2 == 0) {
			System.out.println("Even");
			}else System.out.println("Odd");
		};
		i.checkWeatherOfNumber(10);
	}
}
