package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - I am only called once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Kenneth"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each....");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After - I am only called once");
    }
}