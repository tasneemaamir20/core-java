import java.util.ArrayList;

public class Restaurant {
    
    public static void main(String[] args) {
         ArrayList<Dish> menu=new ArrayList<>();
        menu.add(new Dish("hydrabadi biryani",300,"nonveg","south indian"));
        menu.add(new Dish("veg biryani",50,"veg","north indian"));
        menu.add(new Dish("Chicken afgani",320,"nonveg","north indian"));
        menu.add(new Dish("Chicken lollipop",300,"nonveg","north indian"));
        menu.add(new Dish("turkish seek kabab",300,"nonveg","italian"));
        menu.add(new Dish("Paneer tikka",250,"veg","north indian"));
        menu.add(new Dish("Soya kabab",50,"veg","north indian"));
        menu.add(new Dish("Soya malai chaap",150,"veg","north indian"));
        menu.add(new Dish("momos",150,"veg","chinese"));
        menu.add(new Dish("chawmien",100,"veg","chinese"));

        
        // for(int i=0;i<menu.size();i++)
        // {
        //     if(menu.get(i).type.equals("veg"))

        //     System.out.println(menu.get(i));
        // }

        // for(int i=0;i<menu.size();i++)
        // {
        //     if(menu.get(i).cusine.equals("chinese"))
        //     menu.remove(i);
        //      System.out.println(menu.get(i));
        // }

        for(int i=0;i<menu.size();i++)
        {
            if(menu.get(i).Price<=100)
            {
                menu.get(i).Price+=10;
            }
            else if(menu.get(i).Price>=100 && menu.get(i).Price<=300)
            {
                menu.get(i).Price+=20;
 
            }
            else if(menu.get(i).Price>300)
            {
                menu.get(i).Price+=30;
 
            }
            System.out.println(menu.get(i));
        }
       


    }
}
