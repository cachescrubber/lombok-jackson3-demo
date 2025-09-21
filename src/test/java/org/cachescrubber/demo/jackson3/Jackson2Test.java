package org.cachescrubber.demo.jackson3;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class Jackson2Test {

  public static ObjectMapper objectMapper = new ObjectMapper();

  @Test
  void testDeserializeDelombokedTestEntity() throws JacksonException {
    DelombokedTestEntity source = DelombokedTestEntity
        .builder().id("23").name("tim").build();
    String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(source);
    System.out.println(json);

    DelombokedTestEntity entity = objectMapper.readValue(json, DelombokedTestEntity.class);
    assertThat(entity).isEqualTo(source);
  }

  @Test
  void testDeserializeLombokTestEntity() throws JacksonException {
    TestEntity source = TestEntity.builder()
        .id("23").name("tim").build();
    String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(source);
    System.out.println(json);

    TestEntity entity = objectMapper.readValue(json, TestEntity.class);
    assertThat(entity).isEqualTo(source);
  }

}
