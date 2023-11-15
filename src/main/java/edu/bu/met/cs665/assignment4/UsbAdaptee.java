/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/23
 * File Name: UsbAdaptee.java
 * Description: This is the adaptee class, it
 * implements the CustomerDataUsb() interface
 */

package edu.bu.met.cs665.assignment4;

public class UsbAdaptee implements CustomerDataUsb {
  @Override
  public void getCustomer_Usb(int customerId) {
    System.out.println("Print customer data from USB: " + customerId);
  }

  @Override
  public void printCustomer(int customerId) {
    System.out.println("Get customer data from USB: " + customerId);
  }
}

