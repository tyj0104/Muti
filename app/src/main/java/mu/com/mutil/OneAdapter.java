package mu.com.mutil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ${TianYingJie} on 2018/7/26.
 */

public class OneAdapter extends BaseAdapter{

    private Context context = null;
    public OneAdapter(Context context) {
        this.context = context;
    }
    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ViewHolder mHolder;
        if (convertView == null) {
            mHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.one, null, true);
            mHolder.title = (TextView) convertView.findViewById(R.id.title);
            mHolder.genres = (TextView) convertView.findViewById(R.id.genres);
            mHolder.year = (TextView) convertView.findViewById(R.id.year);
            mHolder.actors = (TextView) convertView.findViewById(R.id.actors);
            mHolder.language = (TextView) convertView.findViewById(R.id.language);
            mHolder.iv_ls = (ImageView) convertView.findViewById(R.id.iv_ls);
            convertView.setTag(mHolder);
        } else {
            mHolder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }


    class ViewHolder {
        private TextView title;
        private TextView genres;
        private TextView language;
        private TextView actors;
        private TextView year;
        private ImageView iv_ls;
    }
}
