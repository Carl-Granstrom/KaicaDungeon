package Kaica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "room", schema = "kaicadungeon")
public class RoomEntity {
    private int roomId;

    @Id
    @Column(name = "roomID")
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomEntity that = (RoomEntity) o;
        return roomId == that.roomId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId);
    }
}
