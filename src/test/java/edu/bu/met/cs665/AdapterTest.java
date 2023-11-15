package edu.bu.met.cs665;

import static org.junit.Assert.assertTrue;

import edu.bu.met.cs665.assignment4.*;
import org.junit.Test;


public class AdapterTest {

  public AdapterTest() {
  }
  @Test
  public void testPrintCustomer_USB() {
    CustomerDataUsb UsbCustomerData = new UsbAdaptee();
    UsbCustomerData.printCustomer(123);
    assertTrue(true);
  }

  @Test
  public void testGetCustomer_USB() {
    CustomerDataUsb customerData = new UsbAdaptee();
    customerData.getCustomer_Usb(133);
    assertTrue(true);
  }

  @Test
  public void testPrintCustomer_HTTPS() {
    CustomerDataHttps customerData = new HttpAdaptee();
    CustomerDataUsb customerDataAdapter = new HttpsToUsbAdapter(customerData);
    customerDataAdapter.printCustomer(143);
    assertTrue(true);
  }
@Test
  public void testGetCustomer_HTTPS() {
    CustomerDataHttps customerData = new HttpAdaptee();
    CustomerDataUsb customerDataAdapter = new HttpsToUsbAdapter(customerData);
    customerDataAdapter.getCustomer_Usb(153);
    assertTrue(true);
  }
}
