package Button;

public class MainActivity {
    public static void main(String str[]){

        InheritImpt inheritImpt = new InheritImpt();
        inheritImpt.inheritMain();

        AbstractButton abstractButton = new AbstractButton() {
            @Override
            void onClick() {
                System.out.println("추상클래스");
            }
        };
        abstractButton.perform();
        // 익명객체로 던지기
        Button button = new Button(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("이걸 왜하고 있지"); // 클릭 했을 때 로직
            }
        });

        button.perform();
        // 람다식은 인터페이스를 구현할때 로직만 넘기는 기법
        Button button1 = new Button( ()-> System.out.println("람다식"));
        button1.perform();
    }
}
