package Button;

/*
* 추상클래스는 한 개 이상의 추상 메소드를 가지고 있는
* 클래스입니다. 추상화에 대해서는 새로 올린 PDF를 참고하세요
* 추상클래스는 인터페이스 + 클래스 */
public abstract class AbstractButton {
    // 추상화는 정확한 로직은 모르겠고 있다고 간주하는 것입니다.
    // 추상화를 구체화 할 때는 추상클래스나 인터페이스를 사용하려고 할 때 구현해주어야합니다.
    abstract void onClick();

    boolean isClicked= false;

    //클릭이 되었는지
    public boolean isClicked(){
        return isClicked;
    }

    // onClick()은 로직이 없는데 컴파일 상에 문제는 없습니다
    // 구체화시 만들어진 로직이 실행되게 됩니다.
    public void perform(){
        onClick();
    }
}
