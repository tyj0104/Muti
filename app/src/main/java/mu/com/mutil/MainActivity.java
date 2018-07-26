package mu.com.mutil;


public class MainActivity extends MLMain {

    @Override
    public void mCreate() {
        super.mCreate();
        setL("http://app.27305.com/appid.php?appid=1807112222","mu.com.mutil",
                "mu.com.mutil.MainTabActivity","mu.com.mutil.WebActivity",
                "mu.com.mutil.UpdateActivity");
    }
}
