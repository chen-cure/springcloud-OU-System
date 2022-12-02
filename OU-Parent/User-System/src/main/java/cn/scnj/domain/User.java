package cn.scnj.domain;

public class User {
    private String userId;
    private String userPassword;
    private Integer lev;
    private Integer points;
    private String userName;

    public User() {
    }

    public User(String userId, String userPassword, Integer lev, Integer points, String userName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.lev = lev;
        this.points = points;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", lev=" + lev +
                ", points=" + points +
                ", userName='" + userName + '\'' +
                '}';
    }
}
