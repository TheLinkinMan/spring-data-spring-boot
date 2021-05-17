package nure.alexandr.sosnistkie.lab2_spring_boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "timetable")
public class Timetable {
    @EmbeddedId
    private TimetablePK id;

    @Column(name = "time_end")
    private Timestamp timeEnd;
}
