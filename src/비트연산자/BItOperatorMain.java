package 비트연산자;
// 비트연산자 : 정보의 최소 단위인 비트끼리 연산을 수행함
// 주로 하드웨어 제어, 네트워킹, 데이터 압축 등에 사용됨
// 비트 연산을 위해서 2진법에 대한 이해가 필요


public class BItOperatorMain {
    public static void main(String[] args) {
        int x = 10, y = 12;
        System.out.println(x & y);  // 비트 AND : 두개의 비트가 모두 1이면 1, 8
        System.out.println(x | y);  // 비트 OR : 둘 중 하나만 1이면 1, 14
        System.out.println(x ^ y);  // 비트 XOR : 비트 값이 다른 경우에 1, 6
        System.out.println(~x);  // 비트 NOT : 각 비트를 반전 시킴, -11
        System.out.println(x << 1);  // 비트 SHIFT : 왼쪽으로 하나씩 이동, 20
        System.out.println(x >> 1);  // 오른쪽으로 하나씩 이동, 5

    }
}
