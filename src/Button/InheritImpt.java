package Button;

public class InheritImpt implements OnClickListener{

    public void inheritMain(){
        Button button = new Button(this); // 암묵적 업캐스팅 Inherit에서 OnClickLitener로
        button.perform();
    }
    @Override
    public void onClick() {
        System.out.println("상속받아서 구현");
    }
}
