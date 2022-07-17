package by.academy.deal;

import java.util.Objects;

public class User {
    private String userName;
    private double userMoney;
    private String dateOfBirthday;
    private String phone;
    private String email;

    public User() {
        super();
    }

    public User(String userName, double userMoney) {
        this.userName = userName;
        this.userMoney = userMoney;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserMoney(double userMoney) {
        this.userMoney = userMoney;
    }

    public double getUserMoney() {
        return userMoney;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                     // ссылается на себя ?
        if (!(o instanceof User)) return false;         // принадлежит к классу User ?
        User user = (User) o;                           //  равны ли объекты?
        return Double.compare(user.userMoney, userMoney) == 0 && userName.equals(user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userMoney);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userMoney=" + userMoney +
                '}';
    }
}
