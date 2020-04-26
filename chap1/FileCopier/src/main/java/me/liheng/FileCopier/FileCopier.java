package me.liheng.FileCopier;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopier {

    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes( new RouteBuilder() {
            public void configure() {
                from("file:data/inbox?noop=true").to("file:data/outbox"); //Important: Do NOT leave space behind colon
            }
        });
        context.start();
        Thread.sleep(5000); //allow this simple Camel application time to copy the files
        context.stop();
    }
}
