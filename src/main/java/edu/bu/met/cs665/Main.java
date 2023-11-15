/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/23
 * File Name: Main.java
 * Description: This is the client. Using the adaptor design pattern,
 * this code implements the old system interface with the new system
 * interface.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment4.CustomerDataHttps;
import edu.bu.met.cs665.assignment4.CustomerDataUsb;
import edu.bu.met.cs665.assignment4.HttpAdaptee;
import edu.bu.met.cs665.assignment4.HttpsToUsbAdapter;
import edu.bu.met.cs665.assignment4.UsbAdaptee;

/**
 * This is the Main class.
 **/
public class Main {

  /**
   * It first creates instances of both new and old systems and then an adapter instance.
   **/
  public static void main(String[] args) {
    // Create instances of the USB-based and HTTPS-based customer data
    CustomerDataUsb usbCustomer = new UsbAdaptee();
    CustomerDataHttps httpsData = new HttpAdaptee();

    // Create an adapter instance that adapts the HTTPS-based customer data to the USB interface
    CustomerDataUsb customerAdapter = new HttpsToUsbAdapter(httpsData);

    // Use the USB-based customer data instance to print and retrieve customer data
    usbCustomer.printCustomer(131);
    usbCustomer.getCustomer_Usb(131);

    // Use the adapter instance to print and retrieve
    // customer data from the HTTPS-based customer data source
    // also convert usb to https
    customerAdapter.printCustomer(108);
    customerAdapter.getCustomer_Usb(108);
  }

}
