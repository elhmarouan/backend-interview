package com.happn.interview;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CrossingsService {

  private final UserRepository userRepository;

  public List<Crossing> findCrossingsForUser(final String userId, final Position position) {
    final User currentUser = userRepository.getUserBydId(userId);

    return userRepository.getNearbyUsers(userId, position).stream()
        .map(nearbyUser -> Crossing.builder()
            .userA(currentUser)
            .userB(nearbyUser)
            .build()).toList();
  }

}
