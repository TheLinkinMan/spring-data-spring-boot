package nure.alexandr.sosnistkie.lab2_spring_boot.service;

import nure.alexandr.sosnistkie.lab2_spring_boot.entity.*;

import java.util.List;

public interface IEducationalProcessService {

    void save(Student student);

    void save(Subject subject);

    void save(Teacher teacher);

    void save(Avatar avatar);

    void save(Language language);

    void save(Timetable timetable);


    boolean existsByIdStudent(Long id);

    boolean existsByIdSubject(Long id);

    boolean existsByIdTeacher(Long id);

    boolean existsByIdAvatar(Long id);

    boolean existsByIdLanguage(Long id);

    boolean existsByIdTimetable(TimetablePK id);


    Student findByIdStudent(Long id);

    Subject findByIdSubject(Long id);

    Teacher findByIdTeacher(Long id);

    Avatar findByIdAvatar(Long id);

    Language findByIdLanguage(Long id);

    Timetable findByIdTimetable(TimetablePK id);


    List<Student> findAllStudent();

    List<Subject> findAllSubject();

    List<Teacher> findAllTeacher();

    List<Avatar> findAllAvatar();

    List<Language> findAllLanguage();

    List<Timetable> findAllTimetable();



    void deleteAllStudent();

    void deleteAllSubject();

    void deleteAllTeacher();

    void deleteAllAvatar();

    void deleteAllLanguage();

    void deleteAllTimetable();
}
