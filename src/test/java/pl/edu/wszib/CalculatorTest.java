package pl.edu.wszib;

import org.junit.*;

import java.util.ArrayList;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeClass
    public static void initData(){
        System.out.println("BeforeClass method !!");
        calculator = new Calculator();
    }
    public CalculatorTest(){
        System.out.println("konstruktor  !!");
    }

    @AfterClass //do rzeczy wysyłanych do baz gdy skonczymy testy i doprowadzic do stanu przed testami
    public static void destroyData(){
        System.out.println("AfterClass method !!");
        calculator = null;
    }
    @Before
    public void beforeMethod(){
        System.out.println("Before method !!");
    }
    @After
    public void afterMethod(){
        System.out.println("After method" );
    }
    @Test
    public void positiveSumTest(){
        //przygotowanie danych
        int a =5;
        int b = 7;
        int expectedResult = 12;

        // wykonanie testu
        int result = CalculatorTest.calculator.add(a,b);
        // sprawdzenie wyników (nazywamy asercja)
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void negativeSumTest(){
        //przygotowanie danych
        int a =-3;
        int b = -5;
        int expectedResult = -8;
        //Calculator calculator = new Calculator();
        // wykonanie testu
        int result = CalculatorTest.calculator.add(a,b);
        // sprawdzenie wyników (nazywamy asercja)
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void zeroAndNegativeSumTest(){
        //przygotowanie danych
        int a =0;
        int b = -5;
        int expectedResult = -5;
        //Calculator calculator = new Calculator();
        // wykonanie testu
        int result = CalculatorTest.calculator.add(a,b);
        // sprawdzenie wyników (nazywamy asercja)
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public  void positiveNegativeMultiplyTest(){

        //przygotowanie danych
        int a =5;
        int b = -10;
        int expectedResult = -50;
       // Calculator calculator = new Calculator();
        // wykonanie testu
        int result = CalculatorTest.calculator.multiply(a,b);
        // sprawdzenie wyników (nazywamy asercja)
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public  void positiveDivideTest(){

        //przygotowanie danych
        int a = 5;
        int b = 2;
        double expectedResult = 2.5;
      //  Calculator calculator = new Calculator();
        // wykonanie testu
        double result = CalculatorTest.calculator.divide(a,b);
        // sprawdzenie wyników (nazywamy asercja)
        Assert.assertEquals(expectedResult, result, 0.0001);
    }


@Test(expected = ArithmeticException.class) //adnotacja ze poleci błąd
    public void divideByZeroTest(){

    //przygotowanie danych
    int a = 5;
    int b = 0;


   // Calculator calculator = new Calculator();
    // wykonanie testu
    CalculatorTest.calculator.divide(a,b);
    }
}
//zasady testowania: F.I.R.S.T (szybkie testy, żebysmy mogli szybko je odpalać, 2. niezależne od siebie.(w junit testy sa wykonywane losowo),powtarzalne - ten sam test puszczony dwa razy da nam taki sam wynik