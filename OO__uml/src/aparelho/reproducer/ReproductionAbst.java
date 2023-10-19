package device.reproducer;

public abstract class ReproductionAbst implements ReproductionIntfc {

  protected String name;

  public ReproductionAbst(String name) {
    this.name = name;
  }

  @Override
  public void sing() {
    System.out.println(name + " playing ");
  }

  @Override
  public void pause() {
    System.out.println(name + " freeze!");
  }

  @Override
  public void selectMusic(String name) {
    this.name = name;
    System.out.println(name + " selected");
  }

  public String getname() {
    return name;
  }
}
