public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);

//        Ошибка: ArithmeticException деление на ноль.
//        Возникает так как у devide нет проверки делителя на ноль.
//        В качестве решения представлена дополнительная проверка делителя на 0.
//        Уведомление пользователя, что деление на 0 невозможно. Осуществляется возврат 0.
//        Если уведомление не обязательно можно прописать в одну строчку.
//        devide = (x, y) -> y != 0 ? x / y : 0;
//        Можно построить через блок try - catch
    }
}
