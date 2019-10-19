package com.me.TryCamel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Map;

public class DownloadLogger implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println("We just downloaded: "
                + exchange.getIn().getHeader("CamelFileName"));

        System.out.println("MessageID: "
                + exchange.getIn().getMessageId());

        System.out.println("The headers are: ");
        for (Map.Entry<String, Object> entry : exchange.getIn().getHeaders().entrySet()) {
            System.out.println(entry);
        }

        System.out.println("The content is: \n"
                + exchange.getIn().getBody(String.class));
    }
}
