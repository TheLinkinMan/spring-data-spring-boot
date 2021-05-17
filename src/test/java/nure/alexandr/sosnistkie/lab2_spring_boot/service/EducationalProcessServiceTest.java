package nure.alexandr.sosnistkie.lab2_spring_boot.service;

import nure.alexandr.sosnistkie.lab2_spring_boot.entity.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EducationalProcessServiceTest {

    @Autowired
    EducationalProcessService SUP;

    @Before
    public void setUp() {
    }

    @Test
    public void saveStudent() {
        SUP.deleteAllStudent();

        Student student = new Student(0L, "fio", "address",
                "998825552", "mail@mail.ru", null, null);

        SUP.save(student);

        List<Student> students = SUP.findAllStudent();

        assertThat(students).hasSize(1);
    }

    @Test
    public void saveSubject() {
        SUP.deleteAllSubject();

        Subject subject = new Subject(0L, "name", 16, null, null);

        SUP.save(subject);

        List<Subject> subjects = SUP.findAllSubject();

        assertThat(subjects).hasSize(1);
    }

    @Test
    public void saveAvatar() {
        SUP.deleteAllAvatar();

        Avatar avatar = new Avatar(0L, "fwfwefwefwefw");

        SUP.save(avatar);

        List<Avatar> avatars = SUP.findAllAvatar();

        assertThat(avatars).hasSize(1);
    }

    @Test
    public void saveLanguage() {
        SUP.deleteAllLanguage();

        Language language = new Language(0L, "English", null);

        SUP.save(language);

        List<Language> languages = SUP.findAllLanguage();

        assertThat(languages).hasSize(1);
    }

    @Test
    public void saveTeacher() {
        SUP.deleteAllTeacher();

        Teacher teacher = new Teacher(0L, "fio", "515151551",
                "A125wdE41", null, null, null);

        SUP.save(teacher);

        List<Teacher> teachers = SUP.findAllTeacher();

        assertThat(teachers).hasSize(1);
    }

    @Test
    public void saveTimetable() {
        SUP.deleteAllTimetable();

        TimetablePK timetablePK = new TimetablePK(SUP.findAllSubject().get(0), new Timestamp(121, 4, 30, 14, 30, 0, 0));

        Timetable timetable = new Timetable(timetablePK,
                new Timestamp(121, 4, 30, 16, 0, 0, 0));

        SUP.save(timetable);

        List<Timetable> timetables = SUP.findAllTimetable();

        assertThat(timetables).hasSize(1);
    }

    @Test
    public void findByIdStudent() {
        Student student = SUP.findAllStudent().get(0);

        assertThat(student).isNotNull();

        Long id = student.getId();

        assertThat(SUP.existsByIdStudent(id)).isTrue();
    }

    @Test
    public void findByIdSubject() {
        Subject subject = SUP.findAllSubject().get(0);

        assertThat(subject).isNotNull();

        Long id = subject.getId();

        assertThat(SUP.existsByIdSubject(id)).isTrue();
    }

    @Test
    public void findByIdTeacher() {
        Teacher teacher = SUP.findAllTeacher().get(0);

        assertThat(teacher).isNotNull();

        Long id = teacher.getId();

        assertThat(SUP.existsByIdTeacher(id)).isTrue();
    }

    @Test
    public void findByIdAvatar() {
        Avatar avatar = SUP.findAllAvatar().get(0);

        assertThat(avatar).isNotNull();

        Long id = avatar.getId();

        assertThat(SUP.existsByIdAvatar(id)).isTrue();
    }

    @Test
    public void findByIdLanguage() {
        Language language = SUP.findAllLanguage().get(0);

        assertThat(language).isNotNull();

        Long id = language.getId();

        assertThat(SUP.existsByIdLanguage(id)).isTrue();
    }

    @Test
    public void findByIdTimetable() {
        Timetable timetable = SUP.findAllTimetable().get(0);

        assertThat(timetable).isNotNull();

        TimetablePK id = timetable.getId();

        assertThat(SUP.existsByIdTimetable(id)).isTrue();
    }
}