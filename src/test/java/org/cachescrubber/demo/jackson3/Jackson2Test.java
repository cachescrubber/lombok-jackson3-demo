package org.cachescrubber.demo.jackson3;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class Jackson2Test {

  public static ObjectMapper objectMapper = new ObjectMapper();

  @Test
  void testDeserializeLombokTestEntity() throws JsonProcessingException {
    TestEntity source = TestEntity.builder()
        .id("23").name("tim").build();
    String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(source);
    System.out.println(json);

    TestEntity entity = objectMapper.readValue(json, TestEntity.class);
    assertThat(entity).isEqualTo(source);
  }

}
