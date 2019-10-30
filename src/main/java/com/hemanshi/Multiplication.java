package com.hemanshi;

import static java.lang.Float.parseFloat;


public class Multiplication implements Operation {
  @Override public float doOperation(String left, String right) throws Exception {
    verifyArguments(left, right);

    return parseFloat(left)*parseFloat(right);
  }

  @Override public void verifyArguments(String left, String right) throws Exception {
    parseFloat(left);
    parseFloat(right);
  }
}
