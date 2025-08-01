package ch04_class;

public class game03 {
    private String name;
    private double hp;
    private double mp ;
    private double st;
    private double dt;
    private double speed;
    private String position;

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSt() {
        return st;
    }

    public void setSt(double st) {
        this.st = st;
    }

    public double getDt() {
        return dt;
    }

    public void setDt(double dt) {
        this.dt = dt;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHp() {
        return hp;
    }

    String Tierinfo() {
        double newspeed = speed / 10.0;
        double tot = (st + dt + newspeed) / 3;
        String total = "";
        if (tot >= 35) {
            total = "1티어";
        } else if (tot >= 30) {
            total = "2티어";
        } else if (tot >= 25) {
            total = "3티어";
        } else if (tot >= 20) {
            total = "4티어";
        } else {
            total = "5티어";
        }
        String message = name + "는 " + total + " 챔프입니다.";
        return message;
    }

}
