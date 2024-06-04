public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");


        System.out.println("задание 1");
int a = 700;
System.out.println("a");
byte b = 120;
System.out.println("b");
short c = 31600;
System.out.println("c");
long d = 333333333;
System.out.println("d");
float i =3;
System.out.println("i");
double e = 39.99;
System.out.println("e");

System.out.println("задание 2");
double p =27.12;
System.out.println("p");
float f = 2.786F;
System.out.println("f");
short u =569;
System.out.println("u");
long g = 987678965549L;
System.out.println("g");
float o = 27897;
System.out.println("o");
byte l = 67;
System.out.println("l");

System.out.println("задание 3");
byte studentLudmila = 23;
byte getStudentAnna = 27 ;
byte getStudentEkaterina = 30;
byte allStudent = (byte) (getStudentAnna+getStudentEkaterina+studentLudmila);
int paper = 490;
int forEveryStudent = paper / allStudent;
System.out.println("На каждого ученика рассчитано"+ forEveryStudent + "листов бумаги");

System.out.println("задание 4");
byte but= 16;
byte betOneMin= (byte) (but/2);
int betTwentyMin = betOneMin + 20;
System.out.println( "за 20 мин машина произвела"+ betTwentyMin+"шт  бутылок");
int betDay= betOneMin* 1440;
System.out.println("За сутки машина произвела"+betTwentyMin+" шт бутылок");
int threeDay = betDay * 3;
System.out.println("За трое суток машина произвела "+threeDay+"шт бутылок");
int month=(short)(betDay*31);
System.out.println("За месяц мешина произвела"+month+"шт бутылок");

System.out.println("задание 5");
byte paints = 120;
byte white = 2;
byte brown = 4;
byte paintPerClass = (byte)(white+brown);
System.out.println("красок уходит на один класс"+paintPerClass);
byte classQuantity =(byte)(paints/paintPerClass);
System.out.println("В школе классов"+ classQuantity);
byte paintsWhite = (byte) (classQuantity*white);
byte paintsBrown = (byte)(classQuantity*brown);
System.out.println("нужно белой краски"+paintsWhite+"шт");
System.out.println("нужно коричневой краски"+paintsBrown+"шт");

System.out.println("задание 6");
int banana= 80* 5;
int milk= 105 * 2;
int iceCream=  100*2;
int egg = 70* 4;
int allWeight= banana+ milk+iceCream+egg;
int allWeightKilo=allWeight/ 1000;
System.out.println("масса одного завтрака"+ allWeight+"гр или" +  allWeightKilo+ "килограммов");

System.out.println("задание7");
int targetKg = 7;
int minGramPerDay=250;
int maxGramPerDay = 500;
int targetGram= targetKg * 1000;
int ifMin = targetGram/minGramPerDay;
int ifMax = targetGram/maxGramPerDay;
int daysAverage = (ifMin +ifMax)/2;
System.out.println("если спортсмен будет терять каждый день по 250грамм "+ ifMin);
System.out.println("если спортсмен будет терять каждый день по 500 грамм "+ ifMax);
System.out.println("если в среднем" + daysAverage);

System.out.println("задание 8");
int masha = 67760;
int denis = 83690;
int kristina = 76230;
float mashaZ = masha *12;
float denisZ = denis *12;
float kristinaZ = kristina *12;
float mashaZP = (float) (mashaZ* 1.1);
float denisZP = (float) (denisZ*1.1);
float kristinaZP = (float) (kristinaZ* 1.1);
int mashaP =(int)(mashaZP-mashaZ);
int denisP = (int) (denisZP-denisZ);
int kristinaP = (int) (kristinaZP-kristinaZ);
System.out.println( "Маша теперь получает" + mashaZP+ "рублей"+"Годовой доход вырос на"+  mashaP+ "рублей");
 System.out.println("Денис теперь получает"+denisZP+"рублей"+"Годовой доход вырос на"+ denisP +"рублей");
 System.out.println("Кристина теперь получает "+kristinaZP+"рублей"+"Годовой доход вырос на"+kristinaP+ "рублей");}}







