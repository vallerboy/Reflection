import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by OskarPraca on 2017-03-28.
 */
public class Main {
    public static void main(String[] args) {

        Class myClass = Player.class;
//        Field[] fileds = myClass.getDeclaredFields();
     //   Method[] methods = myClass.getDeclaredMethods();

        try {
            Constructor constructor = myClass.getConstructor();
            Object myClassObj = constructor.getClass().newInstance();
            Method methodPrint = myClassObj.getClass().getMethod("printScore", String.class);
            Object result =  methodPrint.invoke(methodPrint, "test");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}
