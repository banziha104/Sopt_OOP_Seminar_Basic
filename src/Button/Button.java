package Button;

// Button 클래스를 구현하는 나는 클릭되었을 때 어떤 동작을 할지 모릅니다. 단지 시그니쳐만 알고 있습니다
// 고로 로직은 주옥까고, 시그니쳐만으로 코딩하는 것입니다. (오류나면 런타임에서 오류나겠죠 뭐)
public class Button {

    // click 했을때의 로직은 유저에게 '위임' 합니다
    OnClickListener listener;

    boolean isClicked = false;

    public Button(OnClickListener listener) {
        this.listener = listener;
    }

    //클릭이 되었는지
    public boolean isClicked(){
        return isClicked;
    }

    //코드상에서 누르기
    public void perform(){
        listener.onClick();
    }
}
