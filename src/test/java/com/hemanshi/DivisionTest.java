package com.hemanshi;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


public class DivisionTest {
  @Rule public ExpectedException exceptionRule = ExpectedException.none();

  @Test public void testDoOperation() throws Exception {

    Division div = new Division();
    assertEquals(1, div.doOperation("2", "2"), 0);
  }

  @Test public void testDoOperationException() throws Exception {

    Division div = new Division();
    exceptionRule.expect(Exception.class);
    exceptionRule.expectMessage("Can not divide by 0!");
    div.doOperation("1", "0");
  }
}
