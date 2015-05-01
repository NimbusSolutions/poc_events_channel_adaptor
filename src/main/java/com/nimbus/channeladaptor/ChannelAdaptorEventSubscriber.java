package com.nimbus.channeladaptor;

import com.nimbus.poc.events.Event;
import com.nimbus.poc.events.EventSubscriber;
import org.springframework.stereotype.Component;

/**
 * Created by Kye on 01/05/15.
 */
@Component
public class ChannelAdaptorEventSubscriber implements EventSubscriber {

    @Override
    public void onEvent(Event event) {

        System.out.println("Channel Adaptor received event: "+ event);
        System.out.println("Channel Adaptor HTTP POST http://<.com channel>/update/refdata");
        System.out.println("Channel Adaptor HTTP POST http://<mobile channel>/update/refdata");
    }
}
