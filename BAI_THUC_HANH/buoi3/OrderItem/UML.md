---------------------       1      ----------------------
|       Order       |<>-----------|     OrderItem       |
---------------------               ----------------------
| - items: List<OrderItem>         | - name: String
---------------------               | - quantity: int
| + addItem(item:OrderItem):void   | - price: double
| + getTotalAmount():double        | + getTotalPrice():double
| + printOrder():void              | + toString():String
---------------------               ----------------------
