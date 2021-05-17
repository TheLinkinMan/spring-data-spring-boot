package nure.alexandr.sosnistkie.lab2_spring_boot.reposotory;

import nure.alexandr.sosnistkie.lab2_spring_boot.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
