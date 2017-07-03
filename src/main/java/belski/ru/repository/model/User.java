package belski.ru.repository.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Администратор on 28.06.2017.
 */
public class User implements Serializable {
        private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String login;
    private UserInformation userInformation;
    private Set<Meetings> meetings = new HashSet<>(0); // many-to-many relationship


    public User() {
    }

    public User(Integer id, String name, String login, UserInformation userInformation, Set<Meetings> meetings) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.userInformation = userInformation;
        this.meetings = meetings;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public Set<Meetings> getMeetings() {
        return meetings;
    }

    public void setMeetings(Set<Meetings> meetings) {
        this.meetings = meetings;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(login, user.login) &&
                Objects.equals(userInformation, user.userInformation) &&
                Objects.equals(meetings, user.meetings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, login, userInformation, meetings);
    }
}
