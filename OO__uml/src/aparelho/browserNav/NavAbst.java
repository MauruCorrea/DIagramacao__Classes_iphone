package device.navbrowser;

public abstract class NavAbst implements NavIntf {

  @Override
  public void showPage() {
    System.out.println("Show Page.");
  }

  @Override
  public void addNew() {
    System.out.println("Add New PAge.");
  }

  @Override
  public void updatePage() {
    System.out.println("Update Page.");
  }
}
