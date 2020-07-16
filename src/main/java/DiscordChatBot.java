
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class DiscordChatBot {
    public static void main(String[] args) throws Exception{
//testbot
        JDA jda = new JDABuilder("NzMyNzIxMjM4NTUxNjkxNDE1.Xw4t6g.CL_OpOrT3hXjeV_L5LpB-WwxGnQ").build();

        jda.addEventListener(new FirstEvent());
    }
}
