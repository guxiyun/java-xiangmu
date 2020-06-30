package JAVA小项目二;

public class Player {
    public void happy(Game game){
        game.start();//一定是父类的方法
        game.play();//有可能是子类的
        game.end();//一定是父类的方法


    }
}
