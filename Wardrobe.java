package PracticeFile.Extends.InclusionRelationship;

    // 의류와 악세서리 객체들의 공통된 특징을 속성값으로 정의하기위한 부모클래스 생성
public class Wardrobe extends Body {
    String color;
    String material;
    String brand;
    String name;

    // 생성자에 super를 이용해 body 클래스의 행동에 관한 속상값과 현재클래스의 속성값을 생성자에 추가
    public Wardrobe(String color, String material, String brand, String name, boolean dressed) {
        super(dressed);
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
