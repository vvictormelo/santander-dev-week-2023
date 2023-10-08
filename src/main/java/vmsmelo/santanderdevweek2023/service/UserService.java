package vmsmelo.santanderdevweek2023.service;

import vmsmelo.santanderdevweek2023.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
