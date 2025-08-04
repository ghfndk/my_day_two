package ch05_package_inheritance.testsport;

public class Sport {
    private String name ;
    private int entry;

    public Sport(String name , int entry){
        this.name = name;
        this.entry = entry ;
    }

    protected void SportINfo(){
        System.out.println(name+"는 "+entry+"명의 엔트리로 구성이 됩니다.");
    }
}
