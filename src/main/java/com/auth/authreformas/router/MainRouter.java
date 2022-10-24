package com.auth.authreformas.router;

import org.apache.camel.builder.RouteBuilder;

public class MainRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer:foo")
			.log("Hello world");
	}
}
