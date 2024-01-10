package com.nowgnodeel.gym.license.service;

import com.nowgnodeel.gym.license.common.LicenseDTO;
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

  /* 관리자 자격증 리스트 보기 */
  @Transactional
  public List<License> getLicenseList(Long id) {
    Trainer trainer = trainerRepository.findById(id).orElseThrow();
    return licenseRepository.findByTrainer(trainer);
  }

  /* 관리자 자격증 추가 하기 */
  @Transactional
  public void createLicense(Long id, LicenseDTO form) {
    Trainer trainer = trainerRepository.findById(id).orElseThrow();
    License license = form.toEntity();
    license.setTrainer(trainer);
    licenseRepository.save(license);
  }

  /* 관리자 자격증 삭제 하기 */
  @Transactional
  public void removeLicense(Long licenseId) {
    licenseRepository.deleteById(licenseId);
  }
}