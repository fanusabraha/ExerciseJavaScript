package exercise.ExerciseJavaScript.repository;

import exercise.ExerciseJavaScript.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
@Repository
public interface UserRepository extends JpaRepository <User,Long> {
}
