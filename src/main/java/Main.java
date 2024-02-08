import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.ApplicationTeam;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;

import java.util.ArrayList;
import java.util.List;

public class Main extends MemberEncyclopedia {

    public static void main(String[] args) {
        JDA jda = JDABuilder.createDefault("MTA1MDI0MTQ1MTY3NTYzNTc0Mw.GeXOLa.poA_k437aUNxzZz7APuQyaqsVthoqsT8rJk_AI").build();
        Bot.Bot();
        jda.addEventListener(new CoinExchange());
    }
}
