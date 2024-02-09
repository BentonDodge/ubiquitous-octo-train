import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.middleman.GuildMessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.guild.GenericGuildEvent;
public class CoinExchange extends ListenerAdapter {

    private User user;
    public int[] memberCash;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        User author = event.getAuthor();
        Message message1 = event.getMessage();
        String message = event.getMessage().getContentRaw();
        String cobCoin = "<:CobCoin:1050270865813680208>";
        if(message.contains(cobCoin)){
            if(message.contains("@")) {
                //if()
                event.getChannel().sendMessage("THX ;) " + author.getName()).queue();
            }
        }
    }
}

