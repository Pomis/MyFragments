package pomis.app.myfragments;

import android.support.v4.app.Fragment;

/**
 * Created by romanismagilov on 11.10.16.
 */

public class Page {
    public Fragment resource;
    public String title;

    public Page(Fragment resource, String title) {
        this.resource = resource;
        this.title = title;
    }
}
