package com.najus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * Created by najus on 7/20/17.
 */

@EnableBinding(Sink.class)
public class ConsoleConsumer {
    private static Logger logger = LoggerFactory.getLogger(ConsoleConsumer.class);

    @ServiceActivator(inputChannel = Sink.INPUT)
    public void consoleSink(Object payload){
        logger.info("Type: "+ payload.getClass() + " which is byte array");
        logger.info( "Payload: " + new String((byte[])payload));
    }
}
