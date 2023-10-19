package LSP;

import java.util.Date;

abstract class Product {
  abstract String getName();

  abstract Date getExpiredDate();

  /**
   * Function to get all of information about product
   */
  public void getProductInfo() {
    // Some Magic Code
  }
}