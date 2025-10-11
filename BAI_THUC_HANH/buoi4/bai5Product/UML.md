--------------------------------------------
|                Product                    |
--------------------------------------------
| - productId: String                       |
| - name: String                            |
| - unitPrice: double                       |
| - discountPercent: double                 |
--------------------------------------------
| + Product(productId:String, name:String)  |
| + Product(productId:String, name:String,  |
|           unitPrice:double, discountPercent:double) |
| + getProductId(): String                  |
| + setProductId(productId:String): void    |
| + getName(): String                        |
| + setName(name:String): void               |
| + getUnitPrice(): double                  |
| + setUnitPrice(unitPrice:double): void    |
| + getDiscountPercent(): double            |
| + setDiscountPercent(discountPercent:double): void |
| + getSalePrice(): double                  |
| + updatePrice(newPrice:double): void      |
| + applyExtraDiscount(morePercent:double): void |
| + displayInfo(): void                     |
| + main(args:String[]): void               |
--------------------------------------------
