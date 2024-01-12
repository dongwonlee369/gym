package com.nowgnodeel.gym.trainer.controller;

import com.nowgnodeel.gym.trainer.common.TrainerDTO;
import com.nowgnodeel.gym.trainer.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/trainers")
public class TrainerController {
  private final TrainerService trainerService;

  @GetMapping("")
  public String getTrainerList(Model model) {
    model.addAttribute("trainerLists", trainerService.getTrainerList());
    return "admins/trainerManagement";
  }

  @PostMapping
  public String createTrainer(TrainerDTO form) {
    trainerService.createTrainer(form);
    return "redirect:/trainers";
  }

  @PostMapping("/remove")
  public String removeTrainer(@RequestParam("trainerId") Long id) {
    trainerService.removeTrainer(id);
    return "redirect:/trainers";
  }

  /* 미완성 */
  @PostMapping("/update")
  public String updateTrainer(TrainerDTO dto, @RequestParam("trainerId") Long trainerId) {
    trainerService.updateTrainer(trainerId, dto);
    return "admins/trainerUpdate";
  }
}
