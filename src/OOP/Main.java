package OOP;

public class Main {

    public static void main(String args[]){
        Hamburger hamburger;


//         설계도, 제조법으로는 아무것도 모른다.
//         Hamburger.serveThis(10);
//         Hamburger.eatThis();

//         new 연산자는 생성자를 호출합니다!
        hamburger = new Hamburger("소고기", "참깨빵","양상추","퀘촵");

//        결국 사용되는 것은 인스턴스
        hamburger.serveThis(10);
        hamburger.eatThis();
    }
}
