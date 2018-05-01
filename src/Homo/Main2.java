package Homo;

public class Main2 {
    public void casting(){
        YoungJoon youngJoon = new YoungJoon();
        HomoSapience homoSapience = new HomoSapience();


        // 명시적 업캐스팅
        HomoSapience homoSapience1 = (HomoSapience) youngJoon;

        // 명시적 다운캐스팅
        YoungJoon youngJoon1 = (YoungJoon) homoSapience;

        // 암묵적 업캐스팅
        HomoSapience homoSapience2 = new YoungJoon();

        // Java에 한해서 다운캐스팅 & 암묵적 캐스팅 은 없음. (방법은 있지만 쓸일이 없음)
//        YoungJoon youngJoon2 = homoSapience2;
    }
}
