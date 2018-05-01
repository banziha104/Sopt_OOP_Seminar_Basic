package ISP;

/**
 * 인터페이스 분할의 원칙.
 * 쓰이지 않는 인터페이스는 없어야한다.
 */
public class Main implements OnClick {

    @Override
    public void onClick() {

    }

    @Override
    public boolean isOnClicked() {
        return false;
    }
}
