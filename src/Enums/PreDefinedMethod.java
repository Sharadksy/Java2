package Enums;

public class PreDefinedMethod {
    public static void main(String[] args) {
//        Direction[] dir = Direction.values();
//        for (Direction d : dir){
//            System.out.println(d);
//        }

        Direction dir = Direction.valueOf("NORTH");
        System.out.println(dir);

        System.out.println(dir.ordinal());


    }
}

enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}
