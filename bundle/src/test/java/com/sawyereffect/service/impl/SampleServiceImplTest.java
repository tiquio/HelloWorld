package com.sawyereffect.service.impl;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class SampleServiceImplTest {

  private SampleServiceImpl sampleService;

  Map<String, String> properties = new HashMap<String, String>();

  @Before
  public void setup() throws Exception {
    sampleService = new SampleServiceImpl();
  }

  @Test
  public void shouldActivate() throws Exception {
    sampleService.activate(properties);
    assertTrue(true);
  }

  @Test
  public void shouldInit() throws Exception {
    sampleService.activate(properties);
    String value = sampleService.init();
    assertEquals("test", value);
  }

}
