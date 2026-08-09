package dorm.dao;

import dorm.model.DormApplication;
import dorm.model.Student;

import java.util.List;
import java.util.Optional;

public interface ApplicationRepository {

    Optional<DormApplication> findByStudent(Student student);

    List<DormApplication> findAll();

    void save(DormApplication application);

    void update(DormApplication application);

    void delete(DormApplication application);
}
