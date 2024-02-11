public class Cards {
    public static int Number = (int) (Math.random()*12)+1;
    public static int Suit = (int) (Math.random()*3)+1;
    public static int Cards(){
        return Number*Suit;
    }
}
