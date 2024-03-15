package ch7.ch7;

public class ch6_classTraining {
    private String name;
    private int age;
    private String address;
    private String mbti;
    private int personalNum;

    public ch6_classTraining() {  // 기본생성자
    }
    
    //public void 메소드이름(파라미터)
    //파라미터 == 매개변수

    //getter & setter
    //getter : 읽는 녀석 read
    //setter : 쓰는 녀석 write
    //안쓰면 에러남 주의
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMbti() {
        return mbti;
    }

    public void setMbti(String mbti) {
        this.mbti = mbti;
    }

    public int getPersonalNum() {
        return personalNum;
    } // private 메소드를 생성하고 setter을 없애면 수정이 안되며 정보를 숨길 수 있다.


    //생성자
    public ch6_classTraining(String name, int age, String address, String mbti, int personalNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mbti = mbti;
        this.personalNum = personalNum;
    }

    public ch6_classTraining(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mbti = mbti;
        this.personalNum = personalNum;
    }

    public void displayName() { // 메소드
        System.out.println(this.name);
    }
    public void displayAge() {
        System.out.println(this.age);
    }
    public void displayAddress() {
        System.out.println(this.address);
    }
    public void displayAll() {
        System.out.println(this.name + " " + this.age + " " + this.address + " " + this.mbti + " " + this.personalNum);
    }
}   // 실습결과는 main class 에 출력하였다.

