package com.zkbizz.ddm.web.filters;

import com.zkbizz.ddm.annotations.Compress;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
@Compress
public class CompressionFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println("CompressionFilter was called only for you....");
    }
}
