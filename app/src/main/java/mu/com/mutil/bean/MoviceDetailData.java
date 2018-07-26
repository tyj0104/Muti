package mu.com.mutil.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by huangyang on 2018/7/26.
 */

public class MoviceDetailData implements Serializable{
    public String currentPageNo;
    public List<MoviceItemData> data;

    public List<MoviceItemData> getData() {
        return data;
    }

    public String getCurrentPageNo() {
        return currentPageNo;
    }

    public void setCurrentPageNo(String currentPageNo) {
        this.currentPageNo = currentPageNo;
    }

    public void setData(List<MoviceItemData> data) {
        this.data = data;
    }
}
