package 도서관리시스템;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BookHashSetTest {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        books.add(new Book(101, "자바의 정석", "남궁성"));
        books.add(new Book(102, "클린코드", "로버트 마틴"));
        books.add(new Book(103, "운영체제", "공룡책"));
        books.add(new Book(103, "리팩터링", "마틴 파울러"));

        for (Book book : books) {
            System.out.println(book);
        }

        // 합집합 : 모든 요소가 포함됨, 단 중복은 제거됨
        // Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 또는 아래처럼
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        // set1.addAll(set2);  // 합집합
        // set1.retainAll(set2);  // 교집합 : 양쪽에 모두 존재하는 것
        set1.removeAll(set2);  // 차집합 : 앞에서 뒤를 빼고 남는 것
        System.out.println(set1);

    }
}
class Book {
    int isbn; // 고유 도서 번호
    String title; // 도서 제목
    String author; // 저자

    Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public int hashCode() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {  // 다운 캐스팅을 위해서 원래 클래스 타입을 확인
            Book book = (Book) obj;  // 원래의 타입으로 형변환
            if (isbn == book.isbn) return true;
            else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ISBN : " + isbn + "\n" + "Title : " + title + "\n" + "Author : " + author + "\n" + "---------------------\n";

    }
}
