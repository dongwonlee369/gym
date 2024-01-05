package com.nowgnodeel.gym.trainer.repository;

import com.nowgnodeel.gym.trainer.domain.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
