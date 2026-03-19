package 날짜와시간;
// Date : JDK1.0에서부터 포함됨, UTC 개념 기반으로 시간 관리, 로케일 처리, 윤년 처리 등에 취약해서 요즘 안쓰임
// Calendar : JDK1.1 추가됨

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//
//        // 원하는 형식으로 변경해서 출력
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
//        SimpleDateFormat sdf3 = new SimpleDateFormat("HH시 mm분 ss초");
//
//        System.out.println(sdf2.format(date));
//
//        Calendar cal = Calendar.getInstance();  // Calendar는 get으로, 추상 클래스
//        int year = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH);

        // java.time 패키지 : JDK8 이후 도입, 가장 권장되는 방식
        LocalDate date = LocalDate.now();  // 오늘 날짜 가져옴
        LocalTime time = LocalTime.now();  // 현재 시간
        LocalDateTime dateTime = LocalDateTime.now();  // 날짜와 시간
        ZonedDateTime zoned = ZonedDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zoned);

        // 날짜 포맷으로 출력하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        System.out.println(dateTime.format(formatter));

        // 다양한 포맷 패턴
        String[] patterns = {  // 배열로
                "yyyy-MM-dd HH:mm:ss",
                "yyyy/MM/dd",
                "yyyy년 MM월 dd일",
                "HH:mm:ss",
                "hh:mm a",
                "yyyy-MM-dd E요일",
                "yyyyMMddHHmmss",
                "yyyy-MM-dd G "
        };

        System.out.println("------------------------------");
        for (String pattern : patterns) {
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern);
            String rst =  dateTime.format(formatter2);
            System.out.println(rst);
        }

        // 시간대 처리
        ZonedDateTime zoned2 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(zoned2);
        ZonedDateTime zoned3 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zoned3);
        ZonedDateTime zoned4 = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(zoned4);



    }
}
