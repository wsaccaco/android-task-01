package pe.edu.upc.devservice;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skynet on 3/04/17.
 */

public class ItemService {
    private List<Item> Items;
    public List<Item> getItems() { return Items; }

    public ItemService(Context context) {
        Resources res = context.getResources();
        Items = new ArrayList<>();

        Items.add(new Item(res.getString(R.string.name_service_js),
                res.getString(R.string.experience_years_js),
                res.getString(R.string.experience_coorps_js),
                res.getString(R.string.description_js),
                R.drawable.larasvel5,
                -12.066441,
                -76.9815876));

        Items.add(new Item(res.getString(R.string.name_service_aws),
                res.getString(R.string.experience_years_aws),
                res.getString(R.string.experience_coorps_aws),
                res.getString(R.string.description_aws),
                R.drawable.aws,
                -12.0705085,
                -76.9756017));

        Items.add(new Item(res.getString(R.string.name_service_android),
                res.getString(R.string.experience_years_android),
                res.getString(R.string.experience_coorps_aws),
                res.getString(R.string.description_android),
                R.drawable.android,
                -12.0984469,
                -77.0026952));

        Items.add(new Item(res.getString(R.string.name_service_ios),
                res.getString(R.string.experience_years_ios),
                res.getString(R.string.experience_coorps_ios),
                res.getString(R.string.description_ios),
                R.drawable.ios,
                -12.0971719,
                -77.0123874));
    }
}
