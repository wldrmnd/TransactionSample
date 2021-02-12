//Transaction:
//ID CardHolder_Name CardHolder_Surname Amount Time_Begin Time_End

//разработка всегда(!) начинается с проектирования
//классов нижних(классов, которые ни от кого не зависят) уровней
//add -> commit -> push

//1. Git (сверху) -> Enable VSC
//2. Помечаю класс как мусор (ПКМ по классу -> git -> add)
//3. Commit (зеленая галочка сверху справа) - отправить мусор в нашу локальную мусорку
//4. Push (зеленая стрелочка вверху сверху справа) - отправить локальный мусорв в большую мусорку (на github)

import menu.Bank;

public class Client {
    public static void main(String[] args) {
         new Bank();
    }
}
