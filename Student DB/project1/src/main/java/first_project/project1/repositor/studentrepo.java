package first_project.project1.repositor;

import first_project.project1.model.students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepo extends JpaRepository<students,Integer> {
}
