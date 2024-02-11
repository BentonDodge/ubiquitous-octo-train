import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Listeners extends ListenerAdapter {
    public static ArrayList<String> Cash = new ArrayList<String>();
    private User user;
    private EmbedBuilder embedBuilder = new EmbedBuilder();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        User author = event.getAuthor();
        Message message1 = event.getMessage();
        String message = event.getMessage().getContentRaw();
        if(message.contains("BlackJack")){
            embedBuilder.setTitle("BlackJack");
        }
        if(message.contains(Container.cobCoins)){
            if(message.contains("@")) {
                event.getChannel().sendMessage("THX ;) " + author.getName()).queue();
                Cash.add("howdy");
            }
        }
        if (message.contains("ShutDown")){
            event.getChannel().sendMessage("LeaderBoard:").queue();
            for(int i = 0; i<Cash.size();i++){
                event.getChannel().sendMessage(Cash.get(i)).queue();
            }
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.exit(0);
        }
    }
    public void onMemberJoin(GuildMemberJoinEvent event){
        Guild guild = event.getGuild();
        String memberName = event.getMember().getNickname();
        Member member = event.getMember();
        int memberCash = 0;
        if (!event.getUser().isBot()){
            Cash.add(memberName + memberCash);
            Role role = guild.getRoleById("1047945240100732958");

            guild.addRoleToMember(member, role).queue();

        }
    }
}

