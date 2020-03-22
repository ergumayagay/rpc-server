package org.emil.rpc_server.service;

import org.springframework.stereotype.Component;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;

@SofaService(interfaceType = SampleService.class, bindings = {@SofaServiceBinding(bindingType = "bolt")})
@Component
public class SampleServiceImpl implements SampleService {

	@Override
	public String helloWorld() {
		return "Hello World";
	}

}
