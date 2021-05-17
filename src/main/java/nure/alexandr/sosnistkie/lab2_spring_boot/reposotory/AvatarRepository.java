package nure.alexandr.sosnistkie.lab2_spring_boot.reposotory;

import nure.alexandr.sosnistkie.lab2_spring_boot.entity.Avatar;
import org.springframework.data.repository.CrudRepository;

public interface AvatarRepository extends CrudRepository<Avatar, Long> {
}
