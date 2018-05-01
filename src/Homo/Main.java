package Homo;

public class Main {
    public static void main(String args[]){

        YoungJoon youngJoon = new YoungJoon();
        HomoSapience homoYoungjoon = (HomoSapience) new YoungJoon();

        youngJoon.sendKakaoTalk();

        // Youngjoon으로 객체를 만들었어도, 호모사피엔스의 그릇으로 생성되었음
        // 그러므로 호모사피엔스의 기능만 쓸수 있으나, 아래는 Youngjoon의 메소드를
        // 사용하려해서 안됌.
        homoYoungjoon.sendKakaoTalk();

        youngJoon.drive();
        youngJoon.drive("쏘나타");


        youngJoon.drive();
        youngJoon.makeTogi();

        homoYoungjoon.makeTogi();

        // Snake는 상속 계층에 속하지 않기 떄문에 캐스팅이 불가능하다.
        Snake snakeYoungjoon = new YoungJoon();

    }
}
