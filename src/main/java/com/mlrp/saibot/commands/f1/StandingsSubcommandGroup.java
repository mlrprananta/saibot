package com.mlrp.saibot.commands.f1;

import com.mlrp.saibot.commands.Subcommand;
import com.mlrp.saibot.commands.SubcommandGroup;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class StandingsSubcommandGroup extends SubcommandGroup<F1Command> {

  public StandingsSubcommandGroup(List<Subcommand<StandingsSubcommandGroup>> subcommands) {
    super(subcommands);
  }

  @Override
  public String getCommandName() {
    return "standings";
  }

  @Override
  public String getDescription() {
    return "Get the standings for the current season!";
  }
}
