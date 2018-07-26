package mu.com.mutil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.List;

import mu.com.mutil.bean.MoviceData;
import mu.com.mutil.bean.MoviceItemData;

/**
 * Created by huangyang on 2018/7/23.
 */

public class MainTabActivity extends AppCompatActivity {

    private ListView ls;
    private List<MoviceItemData> mData;

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tab);
        initDatas();
        initView();
    }

    private void initDatas() {
        Gson gson = new Gson();
        MoviceData m1 = gson.fromJson("s", MoviceData.class);
        mData = m1.getList().data;
    }

    private void initView() {
        ls = findViewById(R.id.ls);
        if (mData != null) {
            OneAdapter oneAdapter = new OneAdapter(this,mData);
            ls.setAdapter(oneAdapter);
        }

    }
}
