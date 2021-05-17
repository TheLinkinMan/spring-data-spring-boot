package nure.alexandr.sosnistkie.lab2_spring_boot.reposotory;

import nure.alexandr.sosnistkie.lab2_spring_boot.entity.Language;
import org.springframework.data.repository.CrudRepository;

public interface LanguageRepository extends CrudRepository<Language, Long> {
}
