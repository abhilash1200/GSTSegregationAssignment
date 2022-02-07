package merchant;
import gstPercent.GstOnApparel;
import products.ItcProducts;
import java.util.ArrayList;

public class GstCalculator {
    ArrayList<ItcProducts> products;
    public GstCalculator(ArrayList<ItcProducts> products) {
        this.products = products;
    }
    public void calculateFinalPriceWithGST(){
        GstOnApparel gstOnApparel = new GstOnApparel();
        products.stream().forEach(p->{
            if(p.getPriceBeforeGST()>=2000) {
                p.setPriceAfterGST(p.getPriceBeforeGST()+( p.getPriceBeforeGST()/100 * gstOnApparel.getGstPercent()));
            }
            System.out.println("Product: "+p.getProduct()+"Final Price: "+p.getPriceAfterGST() );
        });

    }
}
