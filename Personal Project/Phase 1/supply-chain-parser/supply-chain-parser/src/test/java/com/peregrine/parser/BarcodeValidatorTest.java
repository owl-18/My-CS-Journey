package com.peregrine.parser;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/** Unit test for simple App. */
public class BarcodeValidatorTest extends TestCase {
  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public BarcodeValidatorTest(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(BarcodeValidatorTest.class);
  }

  /** Rigourous Test :-) */
  public void testApp() {
    assertTrue(true);
  }
}
