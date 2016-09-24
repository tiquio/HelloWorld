package com.sawyereffect.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import java.io.IOException;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SimpleServletTest {

  private SimpleServlet simpleServlet;

  @Mock
  private SlingHttpServletRequest request;

  @Mock
  private SlingHttpServletResponse response;

  @Mock
  private ServletOutputStream outputStream;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    simpleServlet = new SimpleServlet();
  }

  @Test
  public void shouldDoGet() throws ServletException, IOException {

    when(response.getOutputStream()).thenReturn(outputStream);

    simpleServlet.doGet(request, response);

    verify(outputStream).println(anyString());
  }

}