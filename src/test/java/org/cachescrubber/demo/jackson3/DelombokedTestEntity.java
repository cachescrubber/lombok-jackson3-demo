package org.cachescrubber.demo.jackson3;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DelombokedTestEntity.DelombokedTestEntityBuilderImpl.class)
@tools.jackson.databind.annotation.JsonDeserialize(builder = DelombokedTestEntity.DelombokedTestEntityBuilderImpl.class)
public class DelombokedTestEntity {

  @JsonProperty
  private final String id;

  private final String name;

  protected DelombokedTestEntity(DelombokedTestEntityBuilder<?, ?> b) {
    this.id = b.id;
    this.name = b.name;
  }

  public static DelombokedTestEntityBuilder<?, ?> builder() {
    return new DelombokedTestEntityBuilderImpl();
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public boolean equals(final Object o) {
    if (o == this)
      return true;
    if (!(o instanceof DelombokedTestEntity))
      return false;
    final DelombokedTestEntity other = (DelombokedTestEntity) o;
    if (!other.canEqual((Object) this))
      return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id))
      return false;
    final Object this$name = this.getName();
    final Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name))
      return false;
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof DelombokedTestEntity;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    return result;
  }

  public String toString() {
    return "DelombokedTestEntity(id=" + this.getId() + ", name=" + this.getName() + ")";
  }

  public DelombokedTestEntityBuilder<?, ?> toBuilder() {
    return new DelombokedTestEntityBuilderImpl().$fillValuesFrom(this);
  }

  public static abstract class DelombokedTestEntityBuilder<C extends DelombokedTestEntity, B extends DelombokedTestEntityBuilder<C, B>> {
    private String id;
    private String name;

    private static void $fillValuesFromInstanceIntoBuilder(DelombokedTestEntity instance,
                                                           DelombokedTestEntityBuilder<?, ?> b) {
      b.id(instance.id);
      b.name(instance.name);
    }

    @JsonProperty
    public B id(String id) {
      this.id = id;
      return self();
    }

    public B name(String name) {
      this.name = name;
      return self();
    }

    protected B $fillValuesFrom(C instance) {
      DelombokedTestEntityBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
      return self();
    }

    protected abstract B self();

    public abstract C build();

    public String toString() {
      return "DelombokedTestEntity.DelombokedTestEntityBuilder(id=" + this.id + ", name=" + this.name + ")";
    }
  }

  @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "", buildMethodName = "build")
  @tools.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "", buildMethodName = "build")
  static final class DelombokedTestEntityBuilderImpl
      extends DelombokedTestEntityBuilder<DelombokedTestEntity, DelombokedTestEntityBuilderImpl> {
    private DelombokedTestEntityBuilderImpl() {
    }

    protected DelombokedTestEntityBuilderImpl self() {
      return this;
    }

    public DelombokedTestEntity build() {
      return new DelombokedTestEntity(this);
    }
  }
}