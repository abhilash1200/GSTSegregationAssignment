package merchant;
import products.*;
import org.testng.annotations.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.*;

public class BillingCounterTest {

    @Test
    public void scanAndPrintBill() {

        //Arrange
        ArrayList<ItcProducts> cart = new ArrayList<ItcProducts>();
        ItcProducts product1 = new ItcProducts("Aashirwad Atta ",50.00,50.00);
        ItcProducts product2 = new ItcProducts("Maggie ",1000.00,1000.00);
        ItcProducts product3 = new ItcProducts("Fair and Lovely ",2000.00,2000.00);
        ItcProducts product4 = new ItcProducts("Nestle ",50.00,50.00);
        ItcProducts product5 = new ItcProducts("Pepsico ",50.00,50.00);
        cart.add(product1);
        cart.add(product2);
        cart.add(product3);
        cart.add(product4);
        cart.add(product5);

        //Act
        GstCalculator gstCalculator = new GstCalculator(cart);
        gstCalculator.calculateFinalPriceWithGST();

        //Assert
        cart.stream().forEach(c->{
            if(c.getPriceBeforeGST()>=2000.00)
                assertThat(c.getPriceBeforeGST()).isLessThan(c.getPriceAfterGST());
        });

    }

}

