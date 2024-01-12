package com.nowgnodeel.gym.pt.service;

import com.nowgnodeel.gym.pt.common.PtDTO;
import com.nowgnodeel.gym.pt.domain.Pt;
import com.nowgnodeel.gym.pt.repository.PtRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PtService {
  private final PtRepository ptRepository;

  /* 리스트 생성 */
  @Transactional
  public List<Pt> getPtList() {
    return ptRepository.findAll();
  }

  /* pt 생성 */
  @Transactional
  public void createPt(PtDTO dto) {
    ptRepository.save(dto.toEntity());
  }

  /* pt 삭제 */
  @Transactional
  public void removePt(Long id) {
    ptRepository.deleteById(id);
  }
}
