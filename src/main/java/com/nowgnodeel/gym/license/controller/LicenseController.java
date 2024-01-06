package com.nowgnodeel.gym.license.controller;

import com.nowgnodeel.gym.license.common.LicenseDTO;
import com.nowgnodeel.gym.license.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/licenses")
public class LicenseController {
  private final LicenseService licenseService;

  @GetMapping()
  public String getLicenseList(@RequestParam("trainerId") Long id, Model model) {
    model.addAttribute("licenseLists", licenseService.getLicenseList(id));
    return "admins/trainerLicense";
  }

  /* 수정 해야함.. */
  @PostMapping
  public String createLicense(Long id, @RequestBody LicenseDTO form) {
    licenseService.createLicense(id, form);
    return "redirect:/licenses?trainerId=" + id;
  }
}
