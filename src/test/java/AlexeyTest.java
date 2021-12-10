public class AlexeyTest {
    String greeting = "Hello";
    private int numba;
    private static AlexeyTest instance;

    private AlexeyTest()
    {
        numba = 5;
    }

    public AlexeyTest getThingy()
    {
        if(instance == null)
        {
            instance = new AlexeyTest();
        }
        return instance;
    }
}
