package com.example.upsell;

import com.example.upsell.Model.Body;
import com.example.upsell.Model.Category;
import com.example.upsell.Model.HeaderTile;
import com.example.upsell.Model.User;

import java.util.ArrayList;
import java.util.List;

public class DataClass
{






    public  static List<HeaderTile> getMockHeaderListdata()
    {

        List<HeaderTile> headerTiles=new ArrayList<>();
        headerTiles.add(new HeaderTile("Header Title 1"));
        headerTiles.add(new HeaderTile("Header Title 2"));
        headerTiles.add(new HeaderTile("Header Title 3"));
        headerTiles.add(new HeaderTile("Header Title 4"));
        headerTiles.add(new HeaderTile("Header Title 5"));
        return headerTiles;

    }


    public  static List<Category> getMockCategoryListdata()
    {

        List<Category> headerTiles=new ArrayList<>();
        headerTiles.add(new Category("Shoes",R.drawable.ic_shoe));
        headerTiles.add(new Category("Tie",R.drawable.ic_tie));
        headerTiles.add(new Category("Sweaters",R.drawable.ic_sweater));
        headerTiles.add(new Category("Pents",R.drawable.ic_pent));
        headerTiles.add(new Category("Tie",R.drawable.ic_tie));
        headerTiles.add(new Category("Shoes",R.drawable.ic_shoe));
        return headerTiles;

    }


    public  static List<Body> getMockBodyListdata()
    {

        List<Body> list=new ArrayList<>();
        list.add(new Body(R.drawable.img_bag_4,"2 km","Bag","AED 312","Service","","",false));

        list.add(new Body(R.drawable.pent,"1 km","Pent","AED 360","Service","AED 400","10% Off",true));

        list.add(new Body(R.drawable.tie,"2 km","Tie","AED 360","Service","400","10% Off",false));

        list.add(new Body(R.drawable.pent,"1 km","Pent","AED 360","Service","AED 400","10% Off",true));
        list.add(new Body(R.drawable.img_bag_4,"2 km","Bag","AED 312","Service","","",false));
        list.add(new Body(R.drawable.pent,"1 km","Pent","AED 360","Service","AED 400","10% Off",true));
        list.add(new Body(R.drawable.tie,"2 km","Tie","AED 360","Service","400","10% Off",false));
        list.add(new Body(R.drawable.ic_sweater,"2 km","Sweater","AED 312","Service","","",false));
        list.add(new Body(R.drawable.pent,"1 km","Pent","AED 360","Service","AED 400","10% Off",true));

        return list;

    }

    public  static List<Body> getMockBodyListdata2()
    {

        List<Body> list=new ArrayList<>();
        list.add(new Body(R.drawable.img_bag_4,"2 km","Bag","AED 312","Service","","",false));

        list.add(new Body(R.drawable.pent,"1 km","Pent","AED 360","Service","AED 400","10% Off",true));

        list.add(new Body(R.drawable.tie,"2 km","Tie","AED 360","Service","400","10% Off",false));

        return list;

    }


    public  static List<User> getUsersListdata()
    {

        List<User> headerTiles=new ArrayList<>();
        headerTiles.add(new User("Shahzaib",R.drawable.img1));
        headerTiles.add(new User("Ansha",R.drawable.girlimg));
        headerTiles.add(new User("Irfan",R.drawable.person2));
        headerTiles.add(new User("Adil",R.drawable.img2));
        headerTiles.add(new User("Alisha",R.drawable.girlimg));

        return headerTiles;

    }
}
