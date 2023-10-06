package vmsmelo.santanderdevweek2023.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vmsmelo.santanderdevweek2023.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
