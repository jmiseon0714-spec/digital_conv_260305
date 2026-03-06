package 시스템출력실습;



public class SystemOutEx {
     public static void main(String[] args) {
         String name = "곰돌이";
         int age = 25;
         String hobby = "코딩, 독서, 운동";


         System.out.println("================================");
         System.out.println("나를 소개합니다!");
         System.out.println("================================");
         System.out.println("이름 : " + name);
         System.out.println("나이 : " + age + "세");
         System.out.println("취미 : " + hobby);
         System.out.println("한마디 : 안녕하세요, 잘 부탁드립니다!");
         System.out.println("================================");

         System.out.println("================================");
         System.out.println("\t\t☕ JAVA CAFE 영수증");
         System.out.println("================================");
         System.out.printf("%-16s %3s %,6d원\n", "아메리카노", "2잔", 9000);
         System.out.println("카페라떼 1잔 5,500원");
         System.out.println("치즈케이크 1조각 6,800원");
         System.out.println("--------------------------------");
         System.out.println("합계 21,300원");
         System.out.println("================================");
         System.out.println("감사합니다. 또 방문해주세요!");

         System.out.println("─────────────────────");
         System.out.println("\t\t구구단 3단");
         System.out.println("-".repeat(32));
         System.out.println("구구단 3단");
         for (int i =1; i <= 9; i++) {
             System.out.printf("%d x %d = %2d\n", i, 3, i * 3);
         }






    }
}
