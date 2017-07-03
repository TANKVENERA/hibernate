package belski.ru.repository.model;

import java.io.Serializable;

/**
 * Created by Администратор on 02.07.2017.
 */
public class UserInformation implements Serializable {

    private Integer id;
    private String address;
    private User user;

    public UserInformation() {
    }

    public UserInformation(Integer id, String address, User user) {
        this.id = id;
        this.address = address;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
