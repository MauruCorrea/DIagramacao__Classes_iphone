package device;

import device.devicetelefonico.PhoneIntfc;
import device.navbrowser.navIntf;
import device.reproducer.ReproductionIntfc;
i

/**
 * Classe com Herança Múltipla.
 */
public class deviceMultiuso implements ReproductionIntfc, PhoneIntfc, NavIntf {


  @Override
  public void sing() {
    System.out.println("Lintening =)");
  }

  @Override
  public void pause() {
    System.out.println("Pauserd '-' ");
  }

  @Override
  public void selectMusic(String name) {
    System.out.println(name + " <= selected");
  }

  @Override
  public void call(int number) {
    System.out.println("Call to " + number);
  }

  @Override
  public void answer() {
    System.out.println("Answer!");
  }

  @Override
  public void start() {
    System.out.println("voice.");
  }

  @Override
  public void showPage() {
    System.out.println("Show Page.");
  }

  @Override
  public void addNew() {
    System.out.println("New Page.");
  }

  @Override
  public void updatePage() {
    System.out.println("Update.");
  }
}
