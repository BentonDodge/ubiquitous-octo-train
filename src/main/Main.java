public class Main implements MemberEncyclopedia{
    public static void main(String[] args) {
        JDABuilder builder = JDABuilder.createDefault(args[0]);
        JDA jda = JDABuilder.createDefault("MTA1MDI0MTQ1MTY3NTYzNTc0Mw.GeXOLa.poA_k437aUNxzZz7APuQyaqsVthoqsT8rJk_AI").awaitReady().build();
        List<Member> members = guild.getMembersWithRoles(roles);
        System.out.println(members);
    }

//    public void memberList(){
//        List<Member> members = guild.getMembersWithRoles(roles);
//    }
}
