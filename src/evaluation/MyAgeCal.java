package evaluation;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/*
[요구사항]
-클래스명 : MyAgeCal
-birthYear : 태어난 년도 1994를 대입한다.
-nowYear : 현재 년도를 대입한다. 단, Calendar클래스를 사용해야 한다.
-myAge : 현재 년도에서 태어난 년도의 차를 구해 대입한다.
마지막 부분에 계산한 나이를 출력한다.
[샘플코드]
public class MyAgeCal {
    public static void main(String[] args) {
        int birthYear = _작성_;
        int nowYear = _작성_;
        int myAge = _작성_;
        System.out.println(_작성_);
    }
}
[출력결과] 내 나이는 27살 입니다.
 */
public class MyAgeCal
{

	public static void main(String[] args)
	{
		Calendar calendar = Calendar.getInstance();
		
	    int birthYear = 1994;
        int nowYear = calendar.get(Calendar.YEAR);
        int myAge = (calendar.get(Calendar.YEAR)-birthYear);
        System.out.println("내 나이는" + myAge +"살 입니다.");
	}
}
