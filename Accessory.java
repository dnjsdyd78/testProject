package PracticeFile.Extends.InclusionRelationship;

public class Accessory extends Wardrobe{
    String location;

    // 생성자에 super를 이용해 부모의 속상값과 해당 클래스의 속성값 추가
    public Accessory(String color, String material, String brand, String name, String location, boolean dressed) {
        super(color, material, brand, name, dressed);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // body 클래스의 메서드를 오버라이드, 객체에 맞는 문자열 리턴값에 추가
    @Override
    public String getDressed(String productName) {
        return super.getDressed(productName) + " 악세서리 장착";
    }

    @Override
    public String unDressed(String productName) {
        return super.unDressed(productName) + " 악세서리 해제";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" +
                "착용위치: '" + location + '\'' +
                ", 색상: '" + color + '\'' +
                ", 재질: '" + material + '\'' +
                ", 브랜드: '" + brand + '\'' +
                ", 제품명: '" + name + '\'' +
                ", 착용상태: " + dressed +
                ']';
    }
}
