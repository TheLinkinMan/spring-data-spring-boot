package nure.alexandr.sosnistkie.lab2_spring_boot.service;


import lombok.AllArgsConstructor;
import nure.alexandr.sosnistkie.lab2_spring_boot.entity.*;
import nure.alexandr.sosnistkie.lab2_spring_boot.reposotory.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Transactional
@Service
public class EducationalProcessService implements IEducationalProcessService {

    private final StudentRepository studentRepository;

    private final SubjectRepository subjectRepository;

    private final TeacherRepository teacherRepository;

    private final AvatarRepository avatarRepository;

    private final LanguageRepository languageRepository;

    private final TimetableRepository timetableRepository;


    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void save(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void save(Avatar avatar) {
        avatarRepository.save(avatar);
    }

    @Override
    public void save(Language language) {
        languageRepository.save(language);
    }

    @Override
    public void save(Timetable timetable) {
        timetableRepository.save(timetable);
    }

    @Override
    public boolean existsByIdStudent(Long id) {
        return studentRepository.existsById(id);
    }

    @Override
    public boolean existsByIdSubject(Long id) {
        return subjectRepository.existsById(id);
    }

    @Override
    public boolean existsByIdTeacher(Long id) {
        return teacherRepository.existsById(id);
    }

    @Override
    public boolean existsByIdAvatar(Long id) {
        return avatarRepository.existsById(id);
    }

    @Override
    public boolean existsByIdLanguage(Long id) {
        return languageRepository.existsById(id);
    }

    @Override
    public boolean existsByIdTimetable(TimetablePK id) {
        return timetableRepository.existsById(id);
    }

    @Override
    public Student findByIdStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Subject findByIdSubject(Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    @Override
    public Teacher findByIdTeacher(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public Avatar findByIdAvatar(Long id) {
        return avatarRepository.findById(id).orElse(null);
    }

    @Override
    public Language findByIdLanguage(Long id) {
        return languageRepository.findById(id).orElse(null);
    }

    @Override
    public Timetable findByIdTimetable(TimetablePK id) {
        return timetableRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public List<Subject> findAllSubject() {
        return (List<Subject>) subjectRepository.findAll();
    }

    @Override
    public List<Teacher> findAllTeacher() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @Override
    public List<Avatar> findAllAvatar() {
        return (List<Avatar>) avatarRepository.findAll();
    }

    @Override
    public List<Language> findAllLanguage() {
        return (List<Language>) languageRepository.findAll();
    }

    @Override
    public List<Timetable> findAllTimetable() {
        return (List<Timetable>) timetableRepository.findAll();
    }


    @Override
    public void deleteAllStudent() {
        studentRepository.deleteAll();
    }

    @Override
    public void deleteAllSubject() {
        subjectRepository.deleteAll();
    }

    @Override
    public void deleteAllTeacher() {
        teacherRepository.deleteAll();
    }

    @Override
    public void deleteAllAvatar() {
        avatarRepository.deleteAll();
    }

    @Override
    public void deleteAllLanguage() {
        languageRepository.deleteAll();
    }

    @Override
    public void deleteAllTimetable() {
        timetableRepository.deleteAll();
    }
}
