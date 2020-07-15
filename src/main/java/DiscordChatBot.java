import events.FirstEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class DiscordChatBot {
    public static void main(String[] args) throws Exception{
//testbot
        JDA jda = new JDABuilder("token").build();

        jda.addEventListener(new FirstEvent());
    }
}
