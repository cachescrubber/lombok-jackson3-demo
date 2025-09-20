package org.cachescrubber.demo.jackson3;

@tools.jackson.databind.annotation.JsonDeserialize(builder = DelombokedTestEntity.PlainTestEntityBuilderImpl.class)
//@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DelombokedTestEntity.PlainTestEntityBuilderImpl.class)
public class DelombokedTestEntity {

  private final String id;

  private final String name;

  protected DelombokedTestEntity(PlainTestEntityBuilder<?, ?> b) {
    this.id = b.id;
    this.name = b.name;
  }

  public static PlainTestEntityBuilder<?, ?> builder() {
    return new PlainTestEntityBuilderImpl();
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
    return "PlainTestEntity(id=" + this.getId() + ", name=" + this.getName() + ")";
  }

  public PlainTestEntityBuilder<?, ?> toBuilder() {
    return new PlainTestEntityBuilderImpl().$fillValuesFrom(this);
  }

  public static abstract class PlainTestEntityBuilder<C extends DelombokedTestEntity, B extends PlainTestEntityBuilder<C, B>> {
    private String id;
    private String name;

    private static void $fillValuesFromInstanceIntoBuilder(DelombokedTestEntity instance,
        PlainTestEntityBuilder<?, ?> b) {
      b.id(instance.id);
      b.name(instance.name);
    }

    public B id(String id) {
      this.id = id;
      return self();
    }

    public B name(String name) {
      this.name = name;
      return self();
    }

    protected B $fillValuesFrom(C instance) {
      PlainTestEntityBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
      return self();
    }

    protected abstract B self();

    public abstract C build();

    public String toString() {
      return "PlainTestEntity.PlainTestEntityBuilder(id=" + this.id + ", name=" + this.name + ")";
    }
  }

  @tools.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "", buildMethodName = "build")
//  @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "", buildMethodName = "build")
  static final class PlainTestEntityBuilderImpl
      extends PlainTestEntityBuilder<DelombokedTestEntity, PlainTestEntityBuilderImpl> {
    private PlainTestEntityBuilderImpl() {
    }

    protected PlainTestEntityBuilderImpl self() {
      return this;
    }

    public DelombokedTestEntity build() {
      return new DelombokedTestEntity(this);
    }
  }
}