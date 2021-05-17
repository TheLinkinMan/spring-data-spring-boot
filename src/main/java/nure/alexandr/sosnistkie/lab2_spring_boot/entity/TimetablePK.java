package nure.alexandr.sosnistkie.lab2_spring_boot.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class TimetablePK implements Serializable {
    @ManyToOne(targetEntity = Subject.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_subject")
    private Subject subject;

    @Column(name = "time_start")
    private Timestamp timeStart;
}
