public class Pubg extends Weopon {
    

        Weopon clickWeopon()
        {
            int score=300;
            if(score<=200)
            {
                Knife k=new Knife();
                // k.Use();
                return k;
            }
            else if(score>200 && score<=500)
            {
                Gun g=new Gun();
                return g;
            }
            else
            {
                Bomb b=new Bomb();
                return b;
            }
        }
}
