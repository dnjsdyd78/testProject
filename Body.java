package PracticeFile.Extends.InclusionRelationship;

// 행동에 관한 클래스 객체를 별도로 분리하여 행동관련 속성값과 메서드 정의
public class Body {
    boolean dressed = false;

    public Body(boolean dressed) {
        this.dressed = dressed;
    }

    public boolean isDressed() {
        return dressed;
    }

    public void setDressed(boolean dressed) {
        this.dressed = dressed;
    }

    // 착용과 해제의 행동을 정의한 메서드
    public String getDressed(String productName) {
        this.dressed = true;
        return productName;
    }

    public String unDressed(String productName) {
        this.dressed = false;
        return productName;
    }
}


