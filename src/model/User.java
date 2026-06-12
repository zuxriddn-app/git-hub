package model;

public class User {
    int yosh;
    String name;

    public int getYosh() {
        return yosh;
    }

    public void setYosh(int yosh) {
        this.yosh = yosh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(int yosh, String name) {
        this.yosh = yosh;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "yosh=" + yosh +
                ", name='" + name + '\'' +
                '}';
    }
}
