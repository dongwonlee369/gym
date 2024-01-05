package com.nowgnodeel.gym.license.repository;

import com.nowgnodeel.gym.license.domain.License;
import com.nowgnodeel.gym.trainer.domain.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LicenseRepository extends JpaRepository<License, Long> {
  List<License> findByTrainer(Trainer trainer);
}
