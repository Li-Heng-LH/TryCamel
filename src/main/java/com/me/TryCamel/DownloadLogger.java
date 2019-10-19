package com.me.TryCamel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DownloadLogger implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println("MessageID: "
                + exchange.getIn().getMessageId());

        System.out.println("We just downloaded: "
                + exchange.getIn().getHeader("CamelFileName"));

        System.out.println("The content is: \n"
                + exchange.getIn().getBody(String.class));
    }
}
