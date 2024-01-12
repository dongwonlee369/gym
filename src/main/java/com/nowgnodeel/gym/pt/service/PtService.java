package com.nowgnodeel.gym.pt.service;

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

  @Transactional
  public List<Pt> getPtList() {
    return ptRepository.findAll();
  }
}
