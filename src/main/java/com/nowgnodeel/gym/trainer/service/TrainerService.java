package com.nowgnodeel.gym.trainer.service;

import com.nowgnodeel.gym.trainer.common.TrainerDTO;
import com.nowgnodeel.gym.trainer.domain.Trainer;
import com.nowgnodeel.gym.trainer.repository.TrainerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainerService {
  private final TrainerRepository trainerRepository;

  /* 관리자 트레이너 리스트 보기 */
  @Transactional
  public List<Trainer> getTrainerList() {
    return trainerRepository.findAll();
  }

  /* 관리자 트레이너 추가 하기 */
  @Transactional
  public void createTrainer(TrainerDTO form) {
    trainerRepository.save(form.toEntity());
  }
}
