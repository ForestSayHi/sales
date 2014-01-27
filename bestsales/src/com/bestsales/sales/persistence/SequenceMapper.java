package com.bestsales.sales.persistence;

import com.bestsales.sales.domain.Sequence;

public interface SequenceMapper {

  Sequence getSequence(Sequence sequence);
  void updateSequence(Sequence sequence);
}
