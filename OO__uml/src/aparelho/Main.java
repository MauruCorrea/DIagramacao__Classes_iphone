package device;

/**
 * Classe para testar as saídas.
 */
public class Main {

  public static void main(String[] args) {
    DeviceMultiuso Device = new DeviceMultiuso();

    device.selecionarMusica("Led Zepelin");
    device.sing();
    device.pause();
    device.answer();
    device.start();
    device.call(481551648267);
    device.showPage();
    device.updatePage();
    device.addNew();

  }

}