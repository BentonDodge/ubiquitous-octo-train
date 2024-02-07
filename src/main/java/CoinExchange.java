import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.middleman.GuildMessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.guild.GenericGuildEvent;
public class CoinExchange extends ListenerAdapter {

    private User user;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        User author = event.getAuthor();
        Message message = event.getMessage();
        if (author.getIdLong() == this.user.getIdLong()) {
            // Update user from message instance (likely more up-to-date)
            this.user = author;
            // Print the message of the user
            System.out.println(author.getAsTag() + ": " + message.getContentDisplay());
        }
    }
//    public void onCoinEmojiSent(){
//
//    }

}
