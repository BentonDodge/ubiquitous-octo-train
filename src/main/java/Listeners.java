import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Integer.parseInt;

public class Listeners extends ListenerAdapter {
    public static ArrayList<String> Cash = new ArrayList<>();

    private User user;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        EmbedBuilder blackJack = new EmbedBuilder():
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
            EmbedBuilder embedBuilder = new EmbedBuilder();
            event.getChannel().sendMessage("LeaderBoard:").queue();
            embedBuilder.setTitle("LeaderBoard:",null);
            embedBuilder.setDescription("Sent Whenever Bot stops");
            embedBuilder.setColor(Color.DARK_GRAY);
            MemberEncyclopedia.MemberList();
            Boolean LeaderBoardinline=true;
            for(int i = 0; i<Cash.size();i++){
                LeaderBoardinline=!LeaderBoardinline;
                event.getChannel().sendMessage(Cash.get(i)).queue();
                String[] x = Cash.get(i).split(": ");
                embedBuilder.addField("User", x[0],LeaderBoardinline);
                embedBuilder.addField("Cash",x[1],!LeaderBoardinLine);
                System.out.println(Arrays.toString(x));
                int y = parseInt(x[1]);
                memberDatabase.write(x[0]+": "+x[1]+"\n");//TODO bug this
            }
            event.getChannel().sendMessageEmbeds(embedBuilder.build()).queue();
            try {
                TimeUnit.SECONDS.sleep(100);
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

