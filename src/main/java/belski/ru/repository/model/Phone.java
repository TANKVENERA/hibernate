package belski.ru.repository.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Администратор on 01.07.2017.
 */
public class Phone implements Serializable{
    private Integer id;
    private String phoneNumber;
    private Integer FK_User;
    private User user;


    public Phone() {
    }

    public Phone(Integer id, String phoneNumber, Integer FK_User, User user) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.FK_User = FK_User;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public Integer getFK_User() {
        return FK_User;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFK_User(Integer FK_User) {
        this.FK_User = FK_User;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(id, phone.id) &&
                Objects.equals(phoneNumber, phone.phoneNumber) &&
                Objects.equals(FK_User, phone.FK_User) &&
                Objects.equals(user, phone.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber, FK_User, user);
    }
}
