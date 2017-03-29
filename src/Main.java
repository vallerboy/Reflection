import java.lang.reflect.Field;

/**
 * Created by OskarPraca on 2017-03-28.
 */
public class Main {
    public static void main(String[] args) {

        Class myClass = Player.class;
        Field[] fileds = myClass.getDeclaredFields();

        for(Field filed : fileds){
            System.out.println(filed.getName());
        }

    }
}
