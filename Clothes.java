package PracticeFile.Extends.InclusionRelationship;

public class Clothes extends Wardrobe {
    String style;

    // 생성자에 super를 이용해 부모의 속상값과 현재 클래스의 속성값 추가
    public Clothes(String color, String material, String brand, String name, String style, boolean dressed) {
        super(color, material, brand, name, dressed);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    // body 클래스의 메서드 오버라이드, 객체에 맞는 문자열 리턴값에 추가
    @Override
    public String getDressed(String productName) {
        return super.getDressed(productName) + " 의류 장착";
    }

    @Override
    public String unDressed(String productName) {
        return super.unDressed(productName) + " 의류 해제";
    }

    // 클래스의 담긴 속성값 출력을 위해 자바의 최상위클래스인 Object의 toString() 메서드를 오버라이드후 재정의
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" +
                "style: '" + style + '\'' +
                ", 색상: '" + color + '\'' +
                ", 재질: '" + material + '\'' +
                ", 브랜드: '" + brand + '\'' +
                ", 제품명: '" + name + '\'' +
                ", 착용상태: " + dressed +
                ']';
    }
}
