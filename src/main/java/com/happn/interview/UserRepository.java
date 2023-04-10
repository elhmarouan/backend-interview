package com.happn.interview;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  public User getUserBydId(final String userId) {
    return UsersMock.currentUserById(userId);
  }

  public List<User> getNearbyUsers(final String userId, final Position position) {
    return UsersMock.nearbyUsers(userId, position);
  }
}
