package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Scanner;

public class FirstEvent extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        Scanner s = new Scanner(System.in);
        String messageSent = event.getMessage().getContentRaw();
        String name = event.getMember().getUser().getName();

        if (messageSent.equalsIgnoreCase("hi")) {
            event.getChannel().sendMessage("hello").queue();
        }
    }
}
