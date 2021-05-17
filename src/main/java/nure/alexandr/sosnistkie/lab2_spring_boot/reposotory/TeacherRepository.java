package nure.alexandr.sosnistkie.lab2_spring_boot.reposotory;

import nure.alexandr.sosnistkie.lab2_spring_boot.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
