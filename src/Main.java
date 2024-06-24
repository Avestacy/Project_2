Задача 1:
public class Main
{
    public static void main(String[] args) {
       int priceTicket  = 1000;  //цена за один билет
       int priceMile = 20;  //стоимость одной мили
       
       int bonusMiles = (int) (priceTicket / priceMile);
       
       System.out.println("Начисленных миль после расчете: "+ bonusMiles);
    }
}

Задача 2: 
public class Main
{
    public static void main(String[] args) {
       int startBalance = 1000; //начальный баланс на счету
       int addSum = 2000;  //сумма пополнения счета
       
       int bonus = 0;
       if (addSum > 1000){
           bonus = addSum / 100;
       } else {
           bonus = 0;
       }
       int totalBalans = startBalance + addSum + bonus;
       
       System.out.print("Бонус за пополнение счета: " + bonus);
    }
}
