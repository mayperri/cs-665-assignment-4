/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/23
 * File Name: HttpToUsbAdapter.java
 * Description: This is the adapter class.
 */

package edu.bu.met.cs665.assignment4;

public class HttpsToUsbAdapter implements CustomerDataUsb {
  private final CustomerDataHttps customerData;

  /**
   * Constructor takes an object as input and initializes
   * the customerData field. The printCustomer() and getCusomter_Usb()
   * method implements CustomerDataUsb interface.
   *
   */
  public HttpsToUsbAdapter(CustomerDataHttps customerData) {
    this.customerData = customerData;
  }


  @Override
  public void printCustomer(int customerId) {
    customerData.printCustomer(customerId);
  }

  @Override
  public void getCustomer_Usb(int customerId) {
    customerData.getCustomer_Https(customerId);
  }
}
