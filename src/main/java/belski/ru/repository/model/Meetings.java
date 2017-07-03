package belski.ru.repository.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Администратор on 03.07.2017.
 */
public class Meetings implements Serializable {
    private Integer id;
    private String meetingName;
    private Set<User> users = new HashSet<>(0); // create an empty set for many-to-many dependency
    // reference entity user
    private Room room;

    public Meetings() {
    }

    public Meetings(Integer id, String meetingName, Set<User> users, Room room) {
        this.id = id;
        this.meetingName = meetingName;
        this.users = users;
        this.room = room;
    }

    public Integer getId() {
        return id;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meetings meetings = (Meetings) o;
        return Objects.equals(id, meetings.id) &&
                Objects.equals(meetingName, meetings.meetingName) &&
                Objects.equals(users, meetings.users) &&
                Objects.equals(room, meetings.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, meetingName, users, room);
    }
}
