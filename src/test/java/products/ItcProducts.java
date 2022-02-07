package products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
public class ItcProducts extends ITC {
    private String product;
    private Double priceBeforeGST;
    private Double priceAfterGST;
}
