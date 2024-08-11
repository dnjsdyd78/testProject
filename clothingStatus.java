package PracticeFile.Extends.InclusionRelationship;


    // 데이터의 무결성을 위한 클래스를 별도로 생성하여 객체데이터값을 정의
public final class clothingStatus {

    Clothes[] clothes = new Clothes[]{
            new Pants("black", "nylon", "adidas", "sportsWearPants", "sports", false),
            new Top("white","nylon","adidas","sportsWearTop","sports",false),
            new Shoes("white","leather", "nike","airForce1","sports",false)
    };

    Accessory[] accessories = new Accessory[]{
            new Ring("platinum", "metal", "bvlgari", "B.Zero1.Ring", "Left", false),
            new Bracelet("navyBlue","metal","tagHeuer","까레라 크로노그래프","Right",false)
    };

}
