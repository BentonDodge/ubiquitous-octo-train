import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.ApplicationTeam;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.ArrayList;
import java.util.List;

public class Main extends MemberEncyclopedia {

    public static void main(String[] args) {
        JDA jda = JDABuilder.createLight("MTA1MDI0MTQ1MTY3NTYzNTc0Mw.GeXOLa.poA_k437aUNxzZz7APuQyaqsVthoqsT8rJk_AI", GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS)
                .addEventListeners(new CoinExchange())
                .build();
        Bot.Bot();

    }
}
