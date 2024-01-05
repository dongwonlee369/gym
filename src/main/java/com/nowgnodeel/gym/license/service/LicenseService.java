package com.nowgnodeel.gym.license.service;

import com.nowgnodeel.gym.license.domain.License;
import com.nowgnodeel.gym.license.repository.LicenseRepository;
import com.nowgnodeel.gym.trainer.domain.Trainer;
import com.nowgnodeel.gym.trainer.repository.TrainerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LicenseService {
  private final LicenseRepository licenseRepository;
  private final TrainerRepository trainerRepository;

  @Transactional
  public List<License> getLicenseList(Long id) {
    Trainer trainer = trainerRepository.findById(id).orElseThrow();
    return licenseRepository.findByTrainer(trainer);
  }
}