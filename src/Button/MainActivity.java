package Button;

public class MainActivity {
    public static void main(String str[]){

        InheritImpt inheritImpt = new InheritImpt();
        inheritImpt.inheritMain();

        // 추상클래스는 인스턴스를 생성할때 추상화된 메소드를 구체화 해주어야함
        AbstractButton abstractButton = new AbstractButton() {
            @Override
            void onClick() {
                System.out.println("추상클래스");
            }
        };

        abstractButton.perform();

        // 인터페이스도 인스턴스를 생성할때 로직을 구현(위임)
        Button button = new Button(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("이걸 왜하고 있지"); // 클릭 했을 때 로직
            }
        });

        // 람다식은 인터페이스를 구현할때 로직만 넘기는 기법
        // 자세한건 구글링 해보면 많이 나옮
        Button button1 = new Button( ()-> System.out.println("람다식"));
        button1.perform();
    }
}
