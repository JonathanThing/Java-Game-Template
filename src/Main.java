import core.Game;

/**
 * Javastein 3D
 * A 3D Java game using Java graphics and raycasting
 * Inspired by Wolfenstein 3D by Id Software, Inc.
 * 
 * @author Jonathan Cai
 */
public class Main {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.start();
    }
}
