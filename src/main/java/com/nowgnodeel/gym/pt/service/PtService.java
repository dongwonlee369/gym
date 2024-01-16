package com.nowgnodeel.gym.pt.service;

import com.nowgnodeel.gym.member.domain.Member;
import com.nowgnodeel.gym.member.repository.MemberRepository;
import com.nowgnodeel.gym.pt.common.PtDTO;
import com.nowgnodeel.gym.pt.domain.Pt;
import com.nowgnodeel.gym.pt.repository.PtRepository;
import com.nowgnodeel.gym.trainer.domain.Trainer;
import com.nowgnodeel.gym.trainer.repository.TrainerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PtService {
  private final PtRepository ptRepository;
  private final TrainerRepository trainerRepository;
  private final MemberRepository memberRepository;

  /* 리스트 생성 */
  @Transactional
  public List<Pt> getPtList() {
    return ptRepository.findAll();
  }

  /* pt 생성 */
  @Transactional
  public void createPt(PtDTO dto, Long trainerId, Long memberId) {
    Trainer trainer = trainerRepository.findById(trainerId).orElseThrow();
    Member member = memberRepository.findById(memberId).orElseThrow();
    Pt pt = dto.toEntity();
    pt.setTrainer(trainer);
    pt.setMember(member);
    ptRepository.save(pt);
  }

  /* pt 삭제 */
  @Transactional
  public void removePt(Long id) {
    ptRepository.deleteById(id);
  }
}
