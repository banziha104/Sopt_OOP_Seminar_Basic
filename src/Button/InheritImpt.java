package Button;

// OnClickListener를 implements 했으므로, 해당 객체의 특성을 가져오게 됩니다.
// 이제 OnClickListner로 업캐스팅이 가능합니다.
public class InheritImpt implements OnClickListener{
    int num = 30;

    public void inheritMain(){
        /**
         * Button은 OnClickListener를 인자로 받습니다.
         * this는 InheritImpt 클래스 그자체를 가르킵니다.
         * this는 OnClickListener와 그 외 기능을 가지고 있습니다
         * 그러나 인자가 OnClcikListener이기 떄문에, 그릇이 너무 작아
         * OnClickLitener의 기능만 암묵적 업캐스팅 되어 가게됩니다.
         *
         */
        Button button = new Button(this); // this(Inherit)에서 OnClickLitener로 암묵적 업캐스팅이 되서 전달
        button.perform();
    }

    /**
     * 전달되는 부분.
     * 중요한건 InheritImpt의 num을 참조하고있음.
     * OnClickListener로 업캐스팅 될떄 OnClickListenr의 기능인
     * OnClcik()뿐만 아니라, OnClick이 참고하고 있는 레퍼런스(num)도 같이 전달됌.
     */
    @Override
    public void onClick() {
        System.out.println(num + "상속받아서 구현");
    }
}
