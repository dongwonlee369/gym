package com.nowgnodeel.gym.trainer.repository;

import com.nowgnodeel.gym.trainer.domain.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
  Trainer findByNickname(String nickname);
}
