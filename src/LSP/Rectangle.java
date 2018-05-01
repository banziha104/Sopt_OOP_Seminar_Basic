package LSP;

/**
 * 리스코프 치환의 원칙
 * 상위객체가 하위 객체로 캐스팅 되어도 문제없어야한다.
 * Rectangle
 */
class Rectangle {
    private int width;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public int area() {
        return this.width * this.height;
    }
}
