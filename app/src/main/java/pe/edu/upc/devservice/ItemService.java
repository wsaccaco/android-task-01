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
                R.drawable.larasvel5));

        Items.add(new Item(res.getString(R.string.name_service_aws),
                res.getString(R.string.experience_years_aws),
                res.getString(R.string.experience_coorps_aws),
                res.getString(R.string.description_aws),
                R.drawable.aws));

        Items.add(new Item(res.getString(R.string.name_service_android),
                res.getString(R.string.experience_years_android),
                res.getString(R.string.experience_coorps_aws),
                res.getString(R.string.description_android),
                R.drawable.android));

        Items.add(new Item(res.getString(R.string.name_service_ios),
                res.getString(R.string.experience_years_ios),
                res.getString(R.string.experience_coorps_ios),
                res.getString(R.string.description_ios),
                R.drawable.ios));
    }
}
