package PracticeFile.Extends.InclusionRelationship;

    // 부모클래스로부터 속성값과 메서드를 물려받은 하위 클래스와 생성자
public class Bracelet extends Accessory{
    public Bracelet(String color, String material, String brand, String name, String location, boolean dressed) {
        super(color, material, brand, name, location, dressed);
    }
}
