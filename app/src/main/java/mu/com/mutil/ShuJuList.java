package mu.com.mutil;

import java.util.List;

/**
 * Created by ${TianYingJie} on 2018/7/26.
 */

public class ShuJuList {
    private int currentPageNo;

    private List<Content> data ;

    private int nextPage;

    private int pageSize;

    private int prePage;

    private int totalCount;

    private int totalPage;

    public void setCurrentPageNo(int currentPageNo){
        this.currentPageNo = currentPageNo;
    }
    public int getCurrentPageNo(){
        return this.currentPageNo;
    }
    public void setData(List<Content> data){
        this.data = data;
    }
    public List<Content> getData(){
        return this.data;
    }
    public void setNextPage(int nextPage){
        this.nextPage = nextPage;
    }
    public int getNextPage(){
        return this.nextPage;
    }
    public void setPageSize(int pageSize){
        this.pageSize = pageSize;
    }
    public int getPageSize(){
        return this.pageSize;
    }
    public void setPrePage(int prePage){
        this.prePage = prePage;
    }
    public int getPrePage(){
        return this.prePage;
    }
    public void setTotalCount(int totalCount){
        this.totalCount = totalCount;
    }
    public int getTotalCount(){
        return this.totalCount;
    }
    public void setTotalPage(int totalPage){
        this.totalPage = totalPage;
    }
    public int getTotalPage(){
        return this.totalPage;
    }
}
