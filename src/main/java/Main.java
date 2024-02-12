import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main{

    public static void main(String[] args) {
        System.out.println(Cards.Cards);
        JDA jda = JDABuilder.createLight("MTA1MDI0MTQ1MTY3NTYzNTc0Mw.GeXOLa.poA_k437aUNxzZz7APuQyaqsVthoqsT8rJk_AI", GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS)
                .addEventListeners(new Listeners())
                .build();



    }
}
