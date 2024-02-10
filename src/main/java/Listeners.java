import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

public class Listeners extends ListenerAdapter {
    public List<String> Cash;
    private User user;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        User author = event.getAuthor();
        Message message1 = event.getMessage();
        String message = event.getMessage().getContentRaw();
        if(message.contains(Container.cobCoins)){
            if(message.contains("@")) {
                //if()
                event.getChannel().sendMessage("THX ;) " + author.getName()).queue();
            }
        }
    }
    public void onMemberJoin(GuildMemberJoinEvent event){
        String memberName = event.getMember().getNickname();
        int memberCash = 0;
        if (!event.getUser().isBot()){
            Cash.add(memberName + memberCash);

        }
    }
}

