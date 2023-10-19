package device.devicetelefonico;

public abstract class PhoneAbst implements PhoneIntfc {

  @Override
  public void call(int number) {
    System.out.println("call to " + number);
  }

  @Override
  public void answer() {
    System.out.println("answer.");
  }

  @Override
  public void start() {
    System.out.println("voice.");
  }
}
