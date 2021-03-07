package com.orkun.osgi.impl;

import com.orkun.osgi.SampleService;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        name = "SampleService",
        property = {
                "service.exported.interfaces=com.orkun.osgi.SampleService",
                "service.exported.configs=org.apache.cxf.rs",
                "org.apache.cxf.rs.address=/sample"
        }
)
public class SampleServiceImpl implements SampleService {

    @Override
    public String getFoo(String id) {
        return id;
    }
}
