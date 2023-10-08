package vmsmelo.santanderdevweek2023.service.impl;

import org.springframework.stereotype.Service;
import vmsmelo.santanderdevweek2023.domain.model.User;
import vmsmelo.santanderdevweek2023.domain.repository.UserRepository;
import vmsmelo.santanderdevweek2023.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account Number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
