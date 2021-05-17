package nure.alexandr.sosnistkie.lab2_spring_boot.reposotory;

import nure.alexandr.sosnistkie.lab2_spring_boot.entity.Timetable;
import nure.alexandr.sosnistkie.lab2_spring_boot.entity.TimetablePK;
import org.springframework.data.repository.CrudRepository;

public interface TimetableRepository extends CrudRepository<Timetable, TimetablePK> {
}
