package com.hemanshi;

public interface Operation {
  float doOperation(String left, String right) throws Exception;
  void verifyArguments(String left, String right) throws Exception;
}
