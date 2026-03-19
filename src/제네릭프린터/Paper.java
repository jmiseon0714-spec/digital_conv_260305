package 제네릭프린터;

public class Paper extends Material{
    public void doPrinting() {
        System.out.println("Paper 재료로 출력합니다.");
    }
    public String toString() {
        return "재료는 Paper 입니다.";
    }
}
