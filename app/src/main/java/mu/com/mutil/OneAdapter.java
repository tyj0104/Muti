package mu.com.mutil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import mu.com.mutil.bean.MoviceItemData;

/**
 * Created by ${TianYingJie} on 2018/7/26.
 */

public class OneAdapter extends BaseAdapter{

    private Context context = null;
    private List <MoviceItemData> mDatas;
    public OneAdapter(Context context,List <MoviceItemData> datas) {
        this.context = context;
        this.mDatas = datas;
    }
    @Override
    public int getCount() {
        return mDatas.size() == 0? 0:mDatas.size();
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
            mHolder.content = (TextView) convertView.findViewById(R.id.content);
            mHolder.iv_ls = (ImageView) convertView.findViewById(R.id.iv_ls);
            convertView.setTag(mHolder);
        } else {
            mHolder = (ViewHolder) convertView.getTag();
        }
        MoviceItemData md = mDatas.get(position);
        mHolder.title.setText(md.getTitle());
        mHolder.genres.setText(md.getTYPES());
        mHolder.year .setText(md.getDirect());
        mHolder.actors.setText(md.getPlayer()); ;
        mHolder.language.setText(md.getScores());
        Glide.with(context).load(md.getPoster()).asBitmap().into(mHolder.iv_ls);
        mHolder.content.setText(md.getContent());
        return convertView;
    }


    class ViewHolder {
        private TextView title;
        private TextView genres;
        private TextView language;
        private TextView actors;
        private TextView year;
        private ImageView iv_ls;
        private TextView content;
    }
}
