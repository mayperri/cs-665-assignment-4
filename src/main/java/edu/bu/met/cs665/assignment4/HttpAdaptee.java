/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/23
 * File Name: HttpAdaptee.java
 * Description: This is the adaptee class, it
 * implements the CustomerDataHttps() interface.
 */

package edu.bu.met.cs665.assignment4;

public class HttpAdaptee implements CustomerDataHttps {
  @Override
  public void getCustomer_Https(int customerId) {
    System.out.println("Print customer data from HTTPS: " + customerId);
  }

  @Override
  public void printCustomer(int customerId) {
    System.out.println("Get customer data from HTTPS: " + customerId);
  }
}
