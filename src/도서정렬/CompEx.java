package 도서정렬;

import java.util.ArrayList;
import java.util.List;

public class CompEx {
    public static void main(String[] args) {
        // list 생성
        List<Book> list = new ArrayList<>();
        list.add(new Book("곰", "안유진", 10000, 2018));
        list.add(new Book("여우", "김유진", 15000, 2011));
        list.add(new Book("강아지", "장원영", 14000, 2014));
        list.add(new Book("앵무새", "이원영", 16000, 2013));
        list.add(new Book("토끼", "최가을", 17000, 2016));
        list.add(new Book("북극곰", "장가을", 12000, 2017));
        list.add(new Book("판다", "김이서", 11000, 2016));
        list.add(new Book("사막여우", "주이서", 13000, 2019));
        list.add(new Book("기린", "곰돌이", 14000, 2020));
        list.add(new Book("호랑이", "사자", 18000, 2013));

        System.out.println("======= 가격 오름 차순 ======");
        list.sort(new PriceComparator());

        for (Book book : list) {
            System.out.println(book);
        }
        System.out.println("\n");

        System.out.println("======= 최신 출판 순 =======");
        list.sort(new YearComparator());

        for (Book book : list) {
            System.out.println(book);
        }

        // 가격 오름차순 정렬 후 출력

        // 최신 출판 순 정렬 후 출력

    }
}
class Book {
    // 필드에는 제목, 저자, 가격, 출판연도
    String title;
    String author;
    int price;
    int year;
    // 매개변수가 전부 있는 생성자
    public Book(String title, String author, int price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
    // toString() 오버라이딩해서 출력
    @Override
    public String toString() {
        return title + " " + author + " " + price + " " + year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// 가격 오름차순 : Comparator<Book>
class PriceComparator implements java.util.Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPrice() - o2.getPrice();  // 앞의 값이 크면 양수가 되기 때문에 정렬 조건, 오름차순
        // if (o1.price > o2.price) return 1;  //  또는 정렬조건
        // else if (o1.price == o2.price) return 0;  // 두 개의 값이 일치
        // else return -1;  // 정렬하지 않는 조건
    }
}
class YearComparator implements java.util.Comparator<Book> {
    // 출판연도 내림차순 : Comparator<Book>
    @Override
    public int compare(Book o1, Book o2) {
        return o2.getYear() - o1.getYear();
        // if (o1.year < o2. year) return 1;  // 내림차순 정렬
        // else if( o1.year == o2.year) return 0;
        // else return -1;
        }
    }

