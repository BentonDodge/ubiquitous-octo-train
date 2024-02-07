import net.dv8tion.jda.api.entities.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class MemberEncyclopedia extends Bot{
    public String userName = "";
    public int cash = 0;
    public void MemberList(String name, int cash){
        this.userName = java.lang.String.valueOf(name);//don't know why I have to cast a string into a string
        this.cash = cash;
         //*TODO* https://stackoverflow.com/questions/61288928/java-discord-bot-get-members-of-a-role
        return;
    }
}
