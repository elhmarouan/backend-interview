package com.happn.interview;

import jakarta.websocket.server.PathParam;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/{user_id}/crossings")
public class CrossingsController {

  private final CrossingsService crossingsService;

  @GetMapping
  List<Crossing> findNearbyUsers(@PathParam("user_id") final String userId,
      @ModelAttribute Position position) {
    return crossingsService.findCrossingsForUser(userId, position);
  }

}
