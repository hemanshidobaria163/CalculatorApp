package com.hemanshi;

import static java.lang.Float.parseFloat;


public class Substraction implements Operation {
  @Override public void verifyArguments(String left, String right) {
    parseFloat(left);
    parseFloat(right);
  }

  @Override public float doOperation(String left, String right) {
    verifyArguments(left, right);
    return parseFloat(left) - parseFloat(right);
  }
}
