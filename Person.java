package PracticeFile.Extends.InclusionRelationship;

public class Person {

    // 데이터값이 담긴 인스턴스 생성
    static clothingStatus wardrobeBox = new clothingStatus();

    public static void main(String[] args) {

        // 재정의한 toString 메서드를 이용하여 객체클래스에 담긴 속성값 출력(착용메서드 실행전)
        for (Clothes clothes : wardrobeBox.clothes) {
            System.out.println(clothes.toString());
        }

        for (Accessory accessory : wardrobeBox.accessories) {
            System.out.println(accessory.toString());
        }

        // 줄바꿈
        System.out.println();

        // 데이터값에 담긴 의류의 착용메서드 실행과 출력
        for (Clothes clothes : wardrobeBox.clothes) {
            System.out.println(clothes.getDressed(clothes.getName()));
        }

        for (Accessory accessory : wardrobeBox.accessories) {
            System.out.println(accessory.getDressed(accessory.getName()));
        }

        // 줄바꿈
        System.out.println();

        // 재정의한 toString 메서드를 이용하여 객체클래스에 담긴 속성값 출력(착용메서드 실행후)
        for (Clothes clothes : wardrobeBox.clothes) {
            System.out.println(clothes.toString());
        }

        for (Accessory accessory : wardrobeBox.accessories) {
            System.out.println(accessory.toString());
        }

    }
}
