package Button;

public abstract class AbstractButton {
    abstract void onClick();

    boolean isClicked= false;
    //클릭이 되었는지
    public boolean isClicked(){
        return isClicked;
    }

    //코드상에서 누르기
    public void perform(){
        onClick();
    }
}
