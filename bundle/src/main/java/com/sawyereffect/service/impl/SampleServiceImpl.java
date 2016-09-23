package com.sawyereffect.service.impl;


import com.sawyereffect.service.SampleService;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

import java.util.Map;

@Service
@Component(label = "Sample service", description = "This is a sample service", metatype = true)
public class SampleServiceImpl implements SampleService {

  /* OSGi Properties */
  private static final String DEFAULT_VALUE = "test";

  @Property(label = "Default value",
          description = "Sample value",
          value = DEFAULT_VALUE)
  public static final String PROP_VALUE = "value";

  private String value;

  @Activate
  protected final void activate(final Map<String, String> properties) throws Exception {
    // Read in OSGi Properties for use by the OSGi Service in the Activate method
    this.value = properties.getOrDefault(PROP_VALUE, DEFAULT_VALUE);
  }

  public String init() {
    return value;
  }

}
