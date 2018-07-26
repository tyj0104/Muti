package mu.com.mutil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

/**
 * Created by huangyang on 2018/7/23.
 */

public class MainTabActivity extends AppCompatActivity {

private ListView ls;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tab);
        initView();
    }

    private void initView() {
        ls = findViewById(R.id.ls);

        OneAdapter oneAdapter = new OneAdapter(this);

        ls.setAdapter(oneAdapter);

    }
}
