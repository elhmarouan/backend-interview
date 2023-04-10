package com.happn.interview;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UsersMock {

  public static User currentUserById(final String userId) {
    return User.builder().userId("user1").fullName("John Smith")
        .lastPosition(new Position(37.7749, -122.4194)).build();
  }

  public static List<User> nearbyUsers(final String userId, final Position position) {
    return List.of(
        User.builder().userId("user2").fullName("Jane Doe")
            .lastPosition(new Position(37.7748, -122.4193)).build(),
        User.builder().userId("user3").fullName("Bob Johnson")
            .lastPosition(new Position(37.7747, -122.4192)).build(),
        User.builder().userId("user4").fullName("Alice Smith")
            .lastPosition(new Position(37.7746, -122.4191)).build(),
        User.builder().userId("user5").fullName("David Lee")
            .lastPosition(new Position(37.7745, -122.4190)).build(),
        User.builder().userId("user6").fullName("Sarah Brown")
            .lastPosition(new Position(37.7744, -122.4189)).build(),
        User.builder().userId("user7").fullName("Mark Davis")
            .lastPosition(new Position(37.7743, -122.4188)).build(),
        User.builder().userId("user8").fullName("Jessica Smith")
            .lastPosition(new Position(37.7742, -122.4187)).build(),
        User.builder().userId("user9").fullName("Andrew Johnson")
            .lastPosition(new Position(37.7741, -122.4186)).build(),
        User.builder().userId("user10").fullName("Emily Davis")
            .lastPosition(new Position(37.7740, -122.4185)).build()
    );
  }
}
