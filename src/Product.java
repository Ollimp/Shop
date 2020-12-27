public class Product {
    private  String title;
    private int price;
    private int colvo;
    public int hesh;

    public  Product (String title, int price,int colvo)
    {
     this.title=title;this.price=price;this.colvo=colvo;
    }
    //public  Product(int hesh){this.hesh=hesh;}
    public void getProduct()
    {
        System.out.println("Name: "+this.title+" Price: "+ this.price+" Количество на складде "+this.colvo);
    }
public String getTitle(){return title;}
public int getPrice(){return price;}
public  void setPrice(int price)
{
    this.price=price;
}

    @Override
    public boolean equals(Object obj)
    {
        Product tmp=(Product)obj;
        boolean flag=false;
        if((this.title.equals(tmp.title)) && tmp.colvo>=hesh) {flag=true; this.hesh=hesh;}
        return flag;
    }

    public  void deGual()
    {
     this.colvo-=1;
    }
}
