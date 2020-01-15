package services;

import models.api.User;

public interface AuthService extends BasicService {

    User createUser(User user);

    User login(User user);

}
