package useful;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Target(ElementType.METHOD) //аннотация только для методов (если применить к другому - будет материться)
@Retention(RetentionPolicy.RUNTIME) //runtime, class, source (где живет)
@interface МояАннотация {
    String key();
    String value();
    String something() default "ololololo";
}

@interface БольшеАннотацийБогуАннотаций {
    int value() default 42;
}

//@SuppressWarnings({"deprecation", "unused"})  //отключаем предупреждения
public class ReflectioinAndAnnotation {
    //рефлексия аннотации (аннотация должна быть Retention(RetentionPolicy.RUNTIME)
    @МояАннотация(key = "ололо", value = "ололошеньки")
    public void annTest() throws Throwable {
        Class<? extends ReflectioinAndAnnotation> cls = this.getClass();
        Method mtd = cls.getMethod("annTest");
        МояАннотация myAnnotation = mtd.getAnnotation(МояАннотация.class);
        System.out.println("key = " + myAnnotation.key());
        System.out.println("value = " + myAnnotation.value());
    }

    @БольшеАннотацийБогуАннотаций(3) //если value(), то можно прям так
    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

        ReflectioinAndAnnotation tst = new ReflectioinAndAnnotation();
        tst.annTest();

        TestClass tc = new TestClass(1, "", 42);
        tc.setAge(213);
        tc.printData();

        TestClass testClass = null;
//        Class clazz = Class.forName(TestClass.class.getName());
//        testClass = (TestClass) clazz.newInstance();
        Class clazz = Class.forName(TestClass.class.getName()); //инициализация с параметрами (констр.)
        Class[] params = {int.class, String.class};
        testClass = (TestClass) clazz.getConstructor(params).newInstance(1111, "ololo");

        Constructor[] constructors = clazz.getConstructors(); //получение всех конструкторов класса
        for (Constructor constructor : constructors) {
            Class[] paramPamPams = constructor.getParameterTypes(); //получение параметров конструкторов
            for (Class paramType : paramPamPams) {
                System.out.println("$$ " + paramType);
            }
        }

        //доступ к приват полю
        Field field = tc.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(tc, "ololo");
        tc.printData();

        //приват поле
        Field ff = tc.getClass().getDeclaredField("aaaa");
        ff.setAccessible(true);
        System.out.println("ff = " + ff.getInt(tc));

        //доступ к приват методу
        Method method = tc.getClass().getDeclaredMethod("printPrivateMethod");
        method.setAccessible(true);
        method.invoke(tc);

        //доступ к приват методу с параметрами
        Method privateSum = testClass.getClass().getDeclaredMethod("sum", int[].class);
        privateSum.setAccessible(true);
        System.out.println(privateSum.invoke(testClass, (Object) new int[]{1, 2, 3, 4}));
    }
}


class TestClass {
    private String name = "default";
    private int age;
    private static int aaaa = 111;

    public TestClass(int ignoreThisToo, String ignoreThis) {}
    public TestClass(long ignoreThisToo, String ignoreThis, Integer ignoreThisThree) {}

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printData() {
        System.out.println("name = " + name + ", age = " + age);
    }

    private static void printPrivateMethod() {
        System.out.println("Рефлексируем! =)");
    }

    private int sum(int ... num) {
        int sum = 0;
        for (int n : num) sum += n;
        return sum;
    }
}