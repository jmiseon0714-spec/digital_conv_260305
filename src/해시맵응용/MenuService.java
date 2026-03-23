package 해시맵응용;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuService {
    private final Map<String, Menu> map = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    // 초기 데이터
    public void initMenu() {    // 키, 값
        map.put("Americano", new Menu("Americano", 2000, "Coffee", "기본커피"));
        map.put("Espresso", new Menu("Espresso", 2500, "Coffee", "진한커피"));
        map.put("Latte", new Menu("Latte", 4000, "Coffee", "우유포함"));
    }

    // 전체 조회
    public void menuList() {
        System.out.println("======= 전체 메뉴 보기 ========");
        for (String key : map.keySet()) {  // map에서 키를 뽑아서 키를 기준으로 반복 순회
            System.out.println(map.get(key));  // 키 값으로 엔티티(키, 값)를 가져옴
        }
    }

    // 메뉴 검색 containsKey
     public void searchMenu(String key) {
        System.out.print("메뉴 검색 : ");
        if (map.containsKey(key)) { // map에 해당 키의 존재 여부 확인
            System.out.println(map.get(key));
        } else System.out.println("해당 메뉴가 존재하지 않습니다.");
    }

    // 메뉴 추가 put
    public void insertMenu(String key, int price, String category, String desc) {
        if (!map.containsKey(key)) {
            map.put(key, new Menu(key, price, category, desc));
            System.out.println("메뉴가 추가되었습니다.");
        } else {
            System.out.println("해당 메뉴가 이미 존재합니다.");
        }
    }

    // 메뉴 삭제 remove
    public void removeMenu(String key) {
        if (map.containsKey(key)) {
            map.remove(key);  // key를 이용해 엔티티(키, 값) 삭제
            System.out.println(key + " 메뉴를 삭제했습니다.");
        } else {
            System.out.println("삭제할 메뉴가 없습니다.");
        }
    }

    // 메뉴 수정 replace
    public void updateMenu(String key, int price, String category, String desc) {
        if (map.containsKey(key)) {
            map.replace(key, new Menu(key, price, category, desc));
            System.out.println("메뉴가 수정되었습니다.");
        } else {
            System.out.println("수정할 메뉴가 없습니다.");
        }
    }

}
