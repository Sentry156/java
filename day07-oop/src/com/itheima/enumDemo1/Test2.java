package com.itheima.enumDemo1;

public class Test2 {
    public static void main(String[] args) {
        move(direction.UP);
    }
    public static void move(direction dir){
        switch(dir){
            case UP :
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
        }
    }
//    public static void move(int direction){
//        switch( direction){
//            case Constant.up :
//                System.out.println("向上移动");
//                break;
//            case Constant.down:
//                System.out.println("向下移动");
//                break;
//            case Constant.left:
//                System.out.println("向左移动");
//                break;
//            case Constant.right:
//                System.out.println("向右移动");
//                break;
//            default:
//                System.out.println("无效的移动方向");
//        }
//
//    }
}
