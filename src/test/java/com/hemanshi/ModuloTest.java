package com.hemanshi;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


public class ModuloTest {
  @Rule public ExpectedException exceptionRule = ExpectedException.none();

  @Test public void testDoOperation() throws Exception {

    Modulo mod = new Modulo();
    assertEquals(1, mod.doOperation("3", "2"), 0);
  }

  @Test public void testDoOperationException() throws Exception {

    Modulo mod = new Modulo();
    exceptionRule.expect(Exception.class);
    exceptionRule.expectMessage("Can not mod by 0!");
    mod.doOperation("1", "0");
  }
}
