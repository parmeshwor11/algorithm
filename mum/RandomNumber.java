package algorithm.mum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parmeshwor on 1/14/16.
 */
public class RandomNumber {

    public static void main(String[] args) {

        long time;
        int end = 100;
        List<Long> l = new ArrayList<>();
        long time1 = System.currentTimeMillis();
        while(l.size()<end)
        {
            time = System.currentTimeMillis()%end;
            if(!l.contains(time)){
                l.add(time);
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("time2-time1 = " + (time2 - time1));
        System.out.println(l);

    }
}
