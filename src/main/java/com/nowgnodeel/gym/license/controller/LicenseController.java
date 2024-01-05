package com.nowgnodeel.gym.license.controller;

import com.nowgnodeel.gym.license.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/licenses")
public class LicenseController {
  private final LicenseService licenseService;

  @GetMapping
  public String getLicenseList(@RequestParam("trainerId") Long id, Model model) {
    model.addAttribute("licenseLists", licenseService.getLicenseList(id));
    return "admins/trainerLicense";
  }
}
