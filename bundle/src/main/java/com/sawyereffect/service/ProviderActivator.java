package com.sawyereffect.service;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

//import com.sawyereffect.service.HelloworldInt;
//import com.sawyereffect.service.HelloWorldService;

public class ProviderActivator implements BundleActivator{
    private ServiceRegistration registration;

    @Override
     public void start(BundleContext bundleContext) throws Exception{
        registration = bundleContext.registerService(
                HelloworldInt.class.getName(),
                new HelloWorldService(),
                null);

    }
    @Override
    public void stop(BundleContext bundleContext) throws Exception{
        registration.unregister();
    }

}

