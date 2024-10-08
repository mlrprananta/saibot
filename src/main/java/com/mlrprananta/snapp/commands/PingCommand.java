package com.mlrprananta.snapp.commands;

import discord4j.core.event.domain.interaction.ChatInputInteractionEvent;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class PingCommand extends SlashCommand {
  @Override
  public String getCommandName() {
    return "ping";
  }

  @Override
  public String getDescription() {
    return "It's ping pong time.";
  }

  @Override
  public Mono<Void> handle(ChatInputInteractionEvent event) {
    return event.reply("Pong!");
  }
}
