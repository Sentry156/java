package staticMethod;

import java.util.Random;

public class VerifyCodeUtil {
    //工具类不需要new来 创建 实例对象 所以直接私有构造器，以节约内存;
    private VerifyCodeUtil(){};
   public static String getCode(int length){
       StringBuilder code = new StringBuilder();
       Random random = new Random();
       String possibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

       for (int i = 0; i < length; i++) {
           int index = random.nextInt(possibleChars.length());
           code.append(possibleChars.charAt(index));
       }

       return code.toString();
   }
}
