import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.io.*;

public class Main{
public static String memberDataString;
    public static void main(String[] args) {
        File memberDatabase = new File("..\\ubiquitous-octo-train\\src\\main\\java\\Resources\\MemberDatabase");
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(memberDatabase));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (true){
            try {
                if ((memberDataString = br.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(memberDataString);}
        JDA jda = JDABuilder.createLight("MTA1MDI0MTQ1MTY3NTYzNTc0Mw.GeXOLa.poA_k437aUNxzZz7APuQyaqsVthoqsT8rJk_AI", GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS)
                .addEventListeners(new Listeners())
                .build();


    }
}
