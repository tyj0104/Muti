package mu.com.mutil.bean;

import java.io.Serializable;

/**
 * Created by huangyang on 2018/7/26.
 */

public class MoviceData implements Serializable{
    public String returnCode;
    public MoviceDetailData list;
    public String returnMessage;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public MoviceDetailData getList() {
        return list;
    }

    public void setList(MoviceDetailData list) {
        this.list = list;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }
}
