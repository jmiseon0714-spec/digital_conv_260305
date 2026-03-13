package 회원관리시스템;



public class Member {
    static int totalCount = 0;  // 전체 가입 회원 수
    private int id; // 회원번호 (자동부여)
    private String name; // 회원 이름
    private String userId; // 회원 아이디
    private String password; // 회원 비밀번호
    private int age; //회원 나이


    public Member (String name, String userId, String password, int age) {
        totalCount++;
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.age = age;
        id = totalCount + 0; // 회원 식별용 번호 자동 생성

    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public static  void decreaseCount() {  // 회원 삭제 시 감소
        if (totalCount > 0) totalCount--;
    }
    public static int getTotalCount() {
        return totalCount;
    }

    public String getUserId() {
        return userId;
    }

    public boolean login(String userId, String password) {
        return this.userId.equals(userId) && this.password.equals(password);


    }
    public void changePassword(String oldPw, String newPw) {
        if  (this.password.equals(oldPw)) {
            this.password = newPw;
            System.out.println("비밀번호를 : " + newPw + "로 변경했습니다.");

        }else {
            System.out.println("기존 비밀번호가 일치하지 않습니다.");
        }
    }
    public void updateInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("회원번호 : " + id + ", 이름 : " + name + ", 아이디 : " + userId + ", 나이 : " + age);
    }
}
