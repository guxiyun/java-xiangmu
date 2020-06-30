package JAVA小项目二;

public class Clist {
    public static void main(String[] args){
        Game game1 = new DNF();//向上转型
        Game game2 = new LOL();
        Game game3 = new CS();

        Player player= new Player();
        player.happy(game1);
        player.happy(game2);
        player.happy(game3);

    }
}
