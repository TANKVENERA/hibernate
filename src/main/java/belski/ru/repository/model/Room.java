package belski.ru.repository.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Администратор on 03.07.2017.
 */
public class Room implements Serializable{
    private Integer id;
    private Meetings meetings;
    private Integer roomNumber;
    private String roomName;

    public Room() {
    }

    public Room(Integer id, Meetings meetings, Integer roomNumber, String roomName) {
        this.id = id;
        this.meetings = meetings;
        this.roomNumber = roomNumber;
        this.roomName = roomName;
    }

    public Integer getId() {
        return id;
    }

    public Meetings getMeetings() {
        return meetings;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMeetings(Meetings meetings) {
        this.meetings = meetings;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(id, room.id) &&
                Objects.equals(meetings, room.meetings) &&
                Objects.equals(roomNumber, room.roomNumber) &&
                Objects.equals(roomName, room.roomName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, meetings, roomNumber, roomName);
    }
}
