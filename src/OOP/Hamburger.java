package OOP;

public class Hamburger {

    String patty;
    String bread;
    String vegetable;
    String source;

    public Hamburger(String patty, String bread, String vegetable, String source) {
        this.patty = patty;
        this.bread = bread;
        this.vegetable = vegetable;
        this.source = source;
    }

    void serveThis(int customerNum){
        System.out.println(customerNum + "번 손님! 후딱 가져가세요");
        sayMyName("");
    }

    void eatThis(){
        System.out.println("손님이 가져갑니다!");
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("손님이 자리앉아 햄버거를 집어듭니다");
                Thread.sleep(1000);
                System.out.println("쿰척쿰척쿰척쿰척쿰척쿰척쿰척쿰척쿰척쿰척쿰척쿰척쿰척쿰척쿰척쿰척");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).run();
    }

    boolean sayMyName(String name){
        if(name != "") {
            System.out.println("맼섬노잊!");
            System.out.println("새마넴!");
            System.out.println("꺄아아아아앜" + name + "!!!!");
            return true;
        }else{
            return false;
        }
    }
}
