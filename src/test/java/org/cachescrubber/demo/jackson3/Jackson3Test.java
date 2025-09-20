package org.cachescrubber.demo.jackson3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;

class Jackson3Test {

  public static ObjectMapper objectMapper = JsonMapper.builder().build();

  @Test
  void testDeserializeDelombokedTestEntity() {
    DelombokedTestEntity source = DelombokedTestEntity
        .builder().id("23").name("tim").build();
    String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(source);
    System.out.println(json);

    DelombokedTestEntity entity = objectMapper.readValue(json, DelombokedTestEntity.class);
    assertThat(entity).isEqualTo(source);
  }

  @Test
  void testDeserializeLombokTestEntity() {
    TestEntity source = TestEntity.builder()
        .id("23").name("tim").build();
    String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(source);
    System.out.println(json);

    TestEntity entity = objectMapper.readValue(json, TestEntity.class);
    assertThat(entity).isEqualTo(source);
  }

}
