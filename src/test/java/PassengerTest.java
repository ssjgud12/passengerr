import org.example.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassengerTest {
    Passenger MyPass;


        @BeforeEach
                void setup()
        {
            MyPass = new Passenger("Mr","Alvin","Olayemi");
        }
        @Test
    void ConstructorSuccess()
        {
            assertEquals("Mr",MyPass.getTitle());
        }


}
