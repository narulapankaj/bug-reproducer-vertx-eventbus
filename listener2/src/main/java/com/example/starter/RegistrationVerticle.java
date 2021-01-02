package com.example.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.eventbus.EventBus;

public class RegistrationVerticle extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    EventBus eb = vertx.eventBus();

    eb.consumer("ping-address", message -> {
      System.out.println("Received message: " + message.body());
      // Now send back reply
      message.reply("pong! from Registration verticle");
    });

    System.out.println("Receiver ready!");
  }
}
