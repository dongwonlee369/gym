package com.nowgnodeel.gym.trainer.service;

import com.nowgnodeel.gym.trainer.common.TrainerDTO;
import com.nowgnodeel.gym.trainer.domain.Trainer;
import com.nowgnodeel.gym.trainer.repository.TrainerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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
    if (trainerRepository.findByNickname(form.nickname()) != null) {
      throw new IllegalStateException("이미 있는 트레이너입니다.");
    } else {
      trainerRepository.save(form.toEntity());
    }
  }

  /* 트레이너 삭제 하기 */
  @Transactional
  public void removeTrainer(Long id) {
    trainerRepository.deleteById(id);
  }
}
