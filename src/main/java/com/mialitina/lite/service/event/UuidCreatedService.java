package com.mialitina.lite.service.event;

import com.mialitina.lite.PojaGenerated;
import com.mialitina.lite.endpoint.event.gen.UuidCreated;
import com.mialitina.lite.repository.DummyUuidRepository;
import com.mialitina.lite.repository.model.DummyUuid;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class UuidCreatedService implements Consumer<UuidCreated> {

  private final DummyUuidRepository dummyUuidRepository;

  @Override
  public void accept(UuidCreated uuidCreated) {
    var dummyUuid = new DummyUuid();
    dummyUuid.setId(uuidCreated.getUuid());
    dummyUuidRepository.save(dummyUuid);
  }
}
