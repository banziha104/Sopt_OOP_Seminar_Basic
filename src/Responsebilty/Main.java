package Responsebilty;

// 진입점 및 프로그램 실행의 책임
public class Main {
    public static void main(String args[]){
        // 의존성 주입
        // 인스턴스 생성
        // 인스턴스를 생성함 = 의존관계를 가짐
        DataController dataController = new DataController();

        //
        dataController.receiveHttpData();
        dataController.transHttpData();
    }
}
