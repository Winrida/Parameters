package Tests;

public class Starter
{
    public static void main(String[] args) {
        Starter st = new Starter();

        int a1 = 10;
        Simple s = new Simple(99L, "First"); // s - это ссылка, указывающая на объект типа Simple

        st.test(a1, s);

        System.out.println("ID ext: " + a1);
        System.out.println("EXT: " + s);
    }

    // Элементарный тип всегда копируется:
    // Число а1 копируется в метод, а не передаётся.

    //                                  v - simple копия ссылки
    private void test(int id, Simple simple)
    {
        id = 177;
        System.out.println("ID int: " + id);
        System.out.println("INT 1: " + simple);
        simple = new Simple(44L, "Second"); // Создаёт новый объект
        System.out.println("INT 2: " + simple);
        //simple.setId(44L); // изменяет объект по ссылке
    }
}
